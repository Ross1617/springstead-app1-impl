package baseline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class editDateTest {
    //create new instance of editDate
    @Test
    public void test_editDate() {
        modifyShown mod = new modifyShown();
        //create an expected ArrayList
        String newCompleted = "2014-12-12";
        String newCompleted2 = "2010-10-10";
        String oldText = "2013-11-11_Fly_0";
        String oldText2 = "2014-11-10_Ride a boat_1";
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();
        expected.add("2014-12-12_Fly_0");
        expected.add("2010-10-10_Ride a boat_1");
        actual.add("2013-11-11_Fly_0");
        actual.add("2014-11-10_Ride a boat_1");
        //assign the return value to  an Array list
        actual = mod.modifyArrayList(actual,newCompleted,oldText,0);
        actual = mod.modifyArrayList(actual,newCompleted2,oldText2,0);
        //compare the two
        assertEquals(actual,expected);
    }
}
