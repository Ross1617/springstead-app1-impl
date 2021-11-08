package baseline;

import java.util.ArrayList;

public class modifyShown {
    public ArrayList<String> modifyArrayList(ArrayList<String> oldArrayList, String newText, String oldText, int number){
        for (int i = 0; i < oldArrayList.size(); i ++){
            if (oldText.equals(oldArrayList.get(i))){
                String old = (String) oldArrayList.get(i);
                String words[] = old.split("_");
                String description = words[1];
                String date = words[0];
                String complete = words[2];
                String newOne = "";
                if (number == 0){
                    newOne = newText + "_" + description + "_" + complete;
                }
                if (number == 1 ){
                    newOne = date + "_" + newText + "_" + complete;
                }
                if (number == 2){
                    newOne = date + "_" + description +"_" + newText;
                }

                //modify the arrayList
                oldArrayList.set(i,newOne);

            }

        }
        //returning the value
        return oldArrayList;



    }

}
