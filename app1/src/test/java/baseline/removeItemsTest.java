package baseline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class removeItemsTest {
    //create a new instance of removeItems
    @Test
    public void removeItems_test(){
        removeItems remove = new removeItems();
        //create an expected array list
        ArrayList <String> expected = new ArrayList<>();
        ArrayList <String> actual = new ArrayList<>();
        String expected1 = "2001-11-11_Dance_0";
        String expected2 = "2016-11-16_Birthday_1";
        String expected3 = "2018-10-10_Run away_0";

        //adding elements
        expected.add(expected1);
        expected.add(expected3);
        actual.add(expected1);
        actual.add(expected2);
        actual.add(expected3);
        //call removeTask with a parameter
        remove.removeTask("2016-11-16_Birthday_1",actual);
        //assign the return to an array list
        //compare the two array Lists
        assertEquals(actual,expected);




    }

}