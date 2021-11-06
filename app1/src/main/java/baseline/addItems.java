package baseline;

import java.util.ArrayList;

public class addItems extends ApplicationsController {
    ArrayList<String> newTodoList = new ArrayList<>();


    public ArrayList<String> addTask(String date, String description, int completed ){
        //sets newTodoList to the one in superclass by using getTodoList

        //creates twos strings and one for integers for date, description, and completed
        // gets the information in the date field and saves it
        // gets the information in the description and saves it
        // gets the information in the completed and saves it
        //add all three to items
        //move the items in the list down one
        // add the three information into the gui
        // returns the string it added
        return newTodoList;
    }

}
