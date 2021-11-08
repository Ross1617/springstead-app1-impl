package baseline;

public class parseOpenedFile {
    private String date;
    private String description;
    private String completed;
    public void parseInformation(String words){
        String word[] = words.split("_");
        date = word[0];
        description = word[1];
        completed = word[2];
    }
    public String getDate(){
        return date;
    }
    public String getDescription(){
        return description;
    }
    public String getCompleted(){
        return completed;
    }
}
