package baseline;

import java.util.ArrayList;

public class showNonCompleted extends  ApplicationsController{
    int counter =0;
    public int showNonCompleted (String words){
        System.out.println(words);
        String word[] = words.split(" ");
        if (word[2].equals("0")){
            //oldArray.add(word);
            return 1;
        }
        else {
            return 0;
        }
        //creates an array list and assigns it to getTodoList
        //looks through every index value of the arrayList
            //parse through all the information
            //if the completed number is equal to 0 then add it to the display
            //show all the ones that are completed in the gui
            //increase counter
    }
    public String getDescription(String words){
        String word[] = words.split(" ");
        return word[1];

    }
    public String getDate(String words){
        String word[] = words.split(" ");
        return word[0];

    }
    public String getCompleted(String words){
        String word[] = words.split(" ");
        return word[2];
    }

}
