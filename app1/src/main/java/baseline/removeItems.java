package baseline;

import java.util.ArrayList;

public class removeItems  {
    ArrayList<String> newTodoList = new ArrayList<>();

    public ArrayList<String> removeTask(String value,ArrayList<String> todoList){
        //deletes the information that is contained at that index
        todoList.remove(value);


        //returns updated List
        return newTodoList;
    }

}
