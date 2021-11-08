package baseline;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class addItemsTest {
    @Test
    public void test_addTask(){
        //create an expected ArrayList
        addItems add = new addItems();
        //pass a date description and completed or not when calling addTask
        String expected = "2003-11-11_Run a mile_0";

        //create an Array List to hold the result
        ArrayList<String> expectedArrayList = new ArrayList<>();
        ArrayList<String> actualArrayList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String date = "2003/11/11";

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        actualArrayList = add.addTask(localDate,"Run a mile","0",actualArrayList);
        expectedArrayList.add(expected);
        //compare the two
        assertEquals(expectedArrayList,actualArrayList);
    }


}