package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class editDescriptionTest {
    //create new instance of editDescription
    @Test
    public void test_editDescription() {
        modifyShown mod = new modifyShown();
        //create an expected ArrayList
        String newCompleted = "Danced in Mexico";
        String newCompleted2 = "found a tree";
        String oldText = "2013-11-11_Fly_0";
        String oldText2 = "2014-11-10_Ride a boat_1";
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();
        expected.add("2013-11-11_Danced in Mexico_0");
        expected.add("2014-11-10_found a tree_1");
        actual.add("2013-11-11_Fly_0");
        actual.add("2014-11-10_Ride a boat_1");
        //assign the return value to  an Array list
        actual = mod.modifyArrayList(actual,newCompleted,oldText,1);
        actual = mod.modifyArrayList(actual,newCompleted2,oldText2,1);
        //compare the two
        assertEquals(actual,expected);
    }
}
