package baseline;
/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Ross Springstead
 */

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ApplicationsController {
    private ArrayList<String> todoList = new ArrayList<>();


    public ArrayList<String> getTodoList(){
        return todoList;
    }


    //creates a new instance of TodoListModify
    @FXML
    private Button addTodoListButton;

    @FXML
    private Button buttonSaveName;

    @FXML
    private DatePicker date;

    @FXML
    private TextField description;

    @FXML
    private Button editDataButton;

    @FXML
    private DatePicker editedDate;

    @FXML
    private TextField editedDescription;

    @FXML
    private TextField lineNumberEditInformation;

    @FXML
    private Button newButton;

    @FXML
    private TextField editInfoCompleted;

    @FXML
    private TextField newTitle;

    @FXML
    private Button openButton;

    @FXML
    private Button removeButton;

    @FXML
    private TextField removeNumber;

    @FXML
    private Button saveButton;

    @FXML
    private Button showAllButton;

    @FXML
    private Button showCompletedButton;

    @FXML
    private Button showUncompletedButton;

    @FXML
    private TableColumn<?, ?> tableComplete;

    @FXML
    private TableColumn<?, ?> tableDate;

    @FXML
    private TableColumn<?, ?> tableDescription;

    @FXML
    int CompletedButtonClicked(ActionEvent event) {
        int number = 0;
        //calls the showCompleted function and assigns the return to number
        return number;
    }

    @FXML
    ArrayList<String> clickAddTodoList(ActionEvent event) {
        //creates a blank string
        //gets the information in the text boxes and adds it to a string
        //calls the addItems with the string and assigns the output to todoList
        return todoList;
    }

    @FXML
    int clickedEditInformation(ActionEvent event) {
        int counter =0;
        //checks to see if there is anything in the newdate section
            //if so call editDate function in TodoListModify
            //had to write code cause sonarLint was yelling
            counter++;
            //modify the arrayList
        //checks to see if there is anything in the newDescription section
            //if so call the editDescription function in TodoListModify
            counter++;;
            //modify the arrayList
        //checks to see if there is anything in the newCompleted section
            //if so then call editCompleted function in TodoListModify
            //modify the arrayList
            counter++;
        return counter;
    }

    @FXML
    void clickedSaveFile(ActionEvent event) {
        //calls saveFile with the filename

    }

    @FXML
    void clickedSaveName(ActionEvent event) {
        //gets the information in the text box labeled edit title name
        //calls the setTitle function with the information

    }

    @FXML
    int clickedShowUncompleted(ActionEvent event) {
        int number = 0;
        //calls the function showUnComplete in TodoListModify and assign the value of return to number
        return number;

    }

    @FXML
    void newFileClicked(ActionEvent event) {
        //calls the openNewFile function in TodoListModify
    }

    @FXML
    void openFileClicked(ActionEvent event) {
        //calls the openFile in TodoListModify
    }

    @FXML
    ArrayList<String> removeClicked(ActionEvent event) {
        //gets the lineNumber in the text box
        //calls the removeTask function with the lineNumber
        //it returns the new arrayList and assigns it to todoList
        return todoList;

    }

    @FXML
    int showAllClicked(ActionEvent event) {
        int number =0;
        //calls the showAll function in the TodoListModify and assigns the return to number
        return number;


    }



}
