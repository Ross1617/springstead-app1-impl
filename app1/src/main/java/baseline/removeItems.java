package baseline;

import java.util.ArrayList;

public class removeItems  {
    ArrayList<String> newTodoList = new ArrayList<>();

    public ArrayList removeTask(String value,ArrayList todoList){
        //deletes the information that is contained at that index
        todoList.remove(value);


        //returns updated List
        return newTodoList;
    }

}
