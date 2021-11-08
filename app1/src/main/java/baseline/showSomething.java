package baseline;



public class showSomething {
    public int showNonCompleted (String words){
        System.out.println(words);
        //parse through all the information
        //if the completed number is equal to 0
        String word[] = words.split("_");
        if (word[2].equals("0")){
            //returns
            return 1;
        }
        else {
            //returns
            return 0;
        }
    }
    public String getDescription(String words){
        String word[] = words.split("_");
        return word[1];

    }
    public String getDate(String words){
        String word[] = words.split("_");
        return word[0];

    }
    public String getCompleted(String words){
        String word[] = words.split("_");
        return word[2];
    }

}
