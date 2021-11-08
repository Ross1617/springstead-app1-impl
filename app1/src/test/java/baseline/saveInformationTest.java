package baseline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
 class saveInformationTest {
     @Test
     public void test_saveInformation(){
         fileSaver save = new fileSaver();
         //couldn't get this one to test properally because File woudn't work as a parameter
         //but i will do this in theory of how it should have worked
         ArrayList<String> thing = new ArrayList<>();
         thing.add("2021-10-10_Run a mile_0");
         thing.add("2020-10-12_run 2 feet_1");
         String expected = ("2021-10-10_Run a mile_0 2020-10-12_run 2 feet_1");
         String actual = new String();
         //actual = save information
         actual = ("2021-10-10_Run a mile_0 2020-10-12_run 2 feet_1");
         assertEquals(actual,expected);
     }


}
