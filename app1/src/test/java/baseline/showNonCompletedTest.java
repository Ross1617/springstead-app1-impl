package baseline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class showNonCompletedTest {
    //create a new instance of showNonCompleted
    @Test
    public void test_showNonCompleted() {
        //create an  array list
        showSomething show = new showSomething();
        int numberOfElements = 0;
        int expected = 2;
        //fill the array list with data
        ArrayList<String> values = new ArrayList<>();
        values.add("2020-11-11_Get flu_0");
        values.add("2019-10-10_get glue_1");
        values.add("2019-10-09_eat pasta_1");
        values.add("2021-10-10_find tree_0");
        values.add("2000-10-02_dance_1");

        for (int i = 0; i < values.size(); i++){
            //assign the return value to a new integer
            int val = show.showNonCompleted(values.get(i));
            if(val == 1){
                numberOfElements ++;
            }
        }
        //check to see if they are equal
        assertEquals(numberOfElements, expected);


    }



}