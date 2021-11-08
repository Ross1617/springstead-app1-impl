package baseline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class editCompletedTest {
    //create new instance of editCompleted
    @Test
    public void test_editCompleted(){
        modifyShown mod = new modifyShown();
        //create an expected ArrayList
        String newCompleted = "1";
        String newCompleted2 = "0";
        String oldText = "2013-11-11_Fly_0";
        String oldText2 = "2014-11-10_Ride a boat_1";
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();
        expected.add("2013-11-11_Fly_1");
        expected.add("2014-11-10_Ride a boat_0");
        actual.add("2013-11-11_Fly_0");
        actual.add("2014-11-10_Ride a boat_1");
        //assign the return value to  an Array list
        actual = mod.modifyArrayList(actual,newCompleted,oldText,2);
        actual = mod.modifyArrayList(actual,newCompleted2,oldText2,2);
        //compare the two
        assertEquals(actual,expected);

    }

}