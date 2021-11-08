package baseline;
import javafx.beans.property.SimpleStringProperty;

public class todoItem {
    private SimpleStringProperty date;
    private SimpleStringProperty description;
    private SimpleStringProperty Complete ;

    public todoItem(String date, String description, String complete){
        this.date = new SimpleStringProperty(date);
        this.description = new SimpleStringProperty(description);
        this.Complete = new SimpleStringProperty(complete);
    }

    public String getDate(){
        return date.get();
    }

    public void setDate(String newDate){
        this.date = new SimpleStringProperty(newDate);
    }

    public String getDescription(){
        return description.get();
    }

    public void setDescription(String description){
        this.description = new SimpleStringProperty(description);
    }
    public String getComplete(){
        return Complete.get();
    }

    public void setComplete(String completed){
        this.Complete = new SimpleStringProperty(completed);
    }

}
