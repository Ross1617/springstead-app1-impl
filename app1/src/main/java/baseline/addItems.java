package baseline;


import java.time.LocalDate;
import java.util.ArrayList;

public class addItems extends ApplicationsController {
    ArrayList<String> newTodoList = new ArrayList<>();


    public ArrayList<String> addTask(LocalDate date, String description, String completed,ArrayList<String> todoList){

        // gets the information in the date field and saves it
        // gets the information in the description and saves it
        // gets the information in the completed and saves it
        //add all three to items
        String newRow = date + "_"+description + "_" + completed;
        //adds the row to the arrayList
        todoList.add(newRow);


        //returns the arrayList

        return todoList;
    }

}
