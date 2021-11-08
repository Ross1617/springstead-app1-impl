package baseline;
/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Ross Springstead
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ApplicationsController implements Initializable {
    private ArrayList<String> todoList = new ArrayList<>();



    public ArrayList<String> getTodoList(){
        return todoList;
    }


    //creates a new instance of TodoListModify
    FileChooser fileChooser = new FileChooser();



    @FXML
    private TextField completed;

    @FXML
    private DatePicker date;

    @FXML
    private TextField description;

    @FXML
    private Button newButton;

    @FXML
    private Button openButton;

    @FXML
    private Button removeButton;

    @FXML
    private Button saveButton;

    @FXML
    private Button showAllButton;

    @FXML
    private Button showCompletedButton;

    @FXML
    private Button showUncompletedButton;

    @FXML
    private TableView<todoItem> tableOfItems;

    @FXML
    private TableColumn<todoItem, String> tableDate;

    @FXML
    private TableColumn<todoItem, String> tableDescription;

    @FXML
    private TableColumn<todoItem, String> tableComplete;

    @FXML
    private Button clearButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {



        tableDate.setCellValueFactory(new PropertyValueFactory<>("Date"));
        tableDescription.setCellValueFactory(new PropertyValueFactory<>("Description"));
        tableComplete.setCellValueFactory(new PropertyValueFactory<>("Complete"));
        tableDescription.setCellFactory(TextFieldTableCell.<todoItem>forTableColumn());
        tableComplete.setCellFactory(TextFieldTableCell.<todoItem>forTableColumn());
        tableDate.setCellFactory(TextFieldTableCell.<todoItem>forTableColumn());
        tableOfItems.setItems(todoItems);
        //allows to edit the table
        tableOfItems.setEditable(true);
        tableDescription.setOnEditCommit(
                (TableColumn.CellEditEvent<todoItem,String> t) -> {
                    modifyShown changes = new modifyShown();
                    //getting the values of the selected row
                    String oldComplete = t.getTableView().getItems().get(t.getTablePosition().getRow()).getComplete();
                    String oldDate = t.getTableView().getItems().get(t.getTablePosition().getRow()).getDate();
                    String oldDescription = t.getTableView().getItems().get(t.getTablePosition().getRow()).getDescription();
                    ((todoItem)t.getTableView().getItems().get(t.getTablePosition().getRow())).setDescription(t.getNewValue());
                    String newDescription = t.getTableView().getItems().get(t.getTablePosition().getRow()).getDescription();
                    String old = oldDate+"_" + oldDescription + "_"+ oldComplete;
                    //changing the array list
                    todoList = changes.modifyArrayList(todoList, newDescription, old, 1);

                }
        );
        tableComplete.setOnEditCommit(
                (TableColumn.CellEditEvent<todoItem,String> t) -> {
                    modifyShown changes = new modifyShown();
                    String oldComplete = t.getTableView().getItems().get(t.getTablePosition().getRow()).getComplete();
                    String oldDate = t.getTableView().getItems().get(t.getTablePosition().getRow()).getDate();
                    String oldDescription = t.getTableView().getItems().get(t.getTablePosition().getRow()).getDescription();
                    ((todoItem)t.getTableView().getItems().get(t.getTablePosition().getRow())).setComplete(t.getNewValue());
                    String newComplete = t.getTableView().getItems().get(t.getTablePosition().getRow()).getComplete();
                    String old = oldDate+"_" + oldDescription + "_"+ oldComplete;
                    //changing the array list
                    todoList = changes.modifyArrayList(todoList, newComplete, old, 2);
                }
        );
        tableDate.setOnEditCommit(
                (TableColumn.CellEditEvent<todoItem,String> t) -> {
                    modifyShown changes = new modifyShown();
                    String oldComplete = t.getTableView().getItems().get(t.getTablePosition().getRow()).getComplete();
                    String oldDate = t.getTableView().getItems().get(t.getTablePosition().getRow()).getDate();
                    String oldDescription = t.getTableView().getItems().get(t.getTablePosition().getRow()).getDescription();
                    ((todoItem)t.getTableView().getItems().get(t.getTablePosition().getRow())).setDate(t.getNewValue());
                    String newDate = t.getTableView().getItems().get(t.getTablePosition().getRow()).getDate();
                    String old = oldDate+"_" + oldDescription + "_"+ oldComplete;
                    //changing the array list
                    todoList = changes.modifyArrayList(todoList, newDate, old, 0);
                }
        );
    }
    private ObservableList<todoItem> todoItems = FXCollections.observableArrayList();

    @FXML
    int CompletedButtonClicked(ActionEvent event) {
        int number =-1;
        showSomething nonCompleted = new showSomething();
        tableOfItems.getItems().clear();
        for (int i = 0; i < todoList.size(); i++){
            number = nonCompleted.showNonCompleted(todoList.get(i));
            if (number == 0){
                String completed1 = nonCompleted.getCompleted(todoList.get(i));
                String description1 = nonCompleted.getDescription(todoList.get(i));
                String date1 = nonCompleted.getDate(todoList.get(i));
                todoItem todoItem = new todoItem(date1, description1, completed1);
                tableOfItems.getItems().add(todoItem);

            }

        }
        //calls the showCompleted function and assigns the return to number
        return number;
    }

    @FXML
    ArrayList<String> clickAddTodoList(ActionEvent event) {
        addItems add = new addItems();
        //creates a blank string
        LocalDate date1  ;
        String descriptions = "";
        String completed1 ;
        //gets the information in the text boxes and adds it to a string
        descriptions =  description.getText();
        date1 = this.date.getValue();
        completed1 = this.completed.getText();
        //formatting
        String formattedDate = date1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        todoItem todoItem = new todoItem(formattedDate, descriptions, completed1);
        tableOfItems.getItems().add(todoItem);
        //making sure it is added correctly to arrayList
        todoList = add.addTask(date1, descriptions, completed1,todoList);
        return todoList;
    }

    @FXML
    void clickedSaveFile(ActionEvent event) throws FileNotFoundException {
        //calls saveFile with the filename
        fileSaver file = new fileSaver();
        File fileMaker = fileChooser.showSaveDialog(new Stage());
        file.savingFile(fileMaker,todoList);
    }

    @FXML
    int clickedShowUncompleted(ActionEvent event) {
        int number = 0;
        showSomething nonCompleted = new showSomething();
        //clears what is on the table
        tableOfItems.getItems().clear();
        for (int i = 0; i < todoList.size(); i++){
            //calling function
           number = nonCompleted.showNonCompleted(todoList.get(i));
           //if it is 1 then add it back to the new table
           if (number == 1){
               String completed1 = nonCompleted.getCompleted(todoList.get(i));
               String description1 = nonCompleted.getDescription(todoList.get(i));
               String date1 = nonCompleted.getDate(todoList.get(i));
               todoItem todoItem = new todoItem(date1, description1, completed1);
               tableOfItems.getItems().add(todoItem);
           }
        }
        //calls the function showUnComplete in TodoListModify and assign the value of return to number
        return number;
    }

    @FXML
    void openFileClicked(ActionEvent event) throws FileNotFoundException {
        parseOpenedFile parser = new parseOpenedFile();
        //clears what was left
        tableOfItems.getItems().clear();
        clearEverything clear = new clearEverything();
        todoList = clear.clearArrayList();
        File file = fileChooser.showOpenDialog(new Stage());
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                todoList.add((scanner.nextLine()));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        // goes through every line

        for (int i = 0; i < todoList.size(); i++ ){
           parser.parseInformation(todoList.get(i));
           String completed1 = parser.getCompleted();
           String date1 = parser.getDate();
           String description1 = parser.getDescription();
           todoItem todoItem = new todoItem(date1, description1, completed1);
           tableOfItems.getItems().add(todoItem);
        }

    }

    @FXML
    ArrayList<String> removeClicked(ActionEvent event) {
        removeItems remove = new removeItems();
        todoItem item = tableOfItems.getSelectionModel().getSelectedItem();
        String itemString = item.getDate() + "_" + item.getDescription() + "_" + item.getComplete();
        //calls the removeTask function with the value
        tableOfItems.getItems().removeAll((tableOfItems.getSelectionModel().getSelectedItem()));
        remove.removeTask(itemString, todoList);
        //it returns the new arrayList and assigns it to todoList
        return todoList;
    }

    @FXML
    int showAllClicked(ActionEvent event) {
        int number =0;
        showSomething nonCompleted = new showSomething();
        tableOfItems.getItems().clear();
        for (int i = 0; i < todoList.size(); i++){
                String completed1 = nonCompleted.getCompleted(todoList.get(i));
                String description1 = nonCompleted.getDescription(todoList.get(i));
                String date1 = nonCompleted.getDate(todoList.get(i));
                todoItem todoItem = new todoItem(date1, description1, completed1);
                tableOfItems.getItems().add(todoItem);
            }

        //calls the showAll function in the TodoListModify and assigns the return to number
        return number;


    }
    @FXML
    void clearButtonClicked(ActionEvent event) {
        tableOfItems.getItems().clear();
        clearEverything clear = new clearEverything();
        todoList = clear.clearArrayList();

    }


}
