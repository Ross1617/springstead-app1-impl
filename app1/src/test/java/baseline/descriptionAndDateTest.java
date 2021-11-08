package baseline;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;
class descriptionAndDateTest {
    todoItem item = new todoItem("2012-10-21","ran to mexico","0");
    @Test
    public void descriptionTest(){
        String expected = "ran to mexico";
        String actual = item.getDescription();
        assertEquals(actual,expected);
    }
    @Test
    public void dateTest(){
        String expected = "2012-10-21";
        String actual = item.getDate();
        assertEquals(actual,expected);
    }


}
