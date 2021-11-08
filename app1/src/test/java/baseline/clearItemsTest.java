package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class clearItemsTest {
    @Test
    public static void main(String[] args) {
        clearEverything clear = new clearEverything();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();
        actual.add("2012-12-01_Fly a plane_0");
        actual.add("2012-01-01_go swimming_0");
        actual.add("2014-03-04_clean my room_1");
        actual = clear.clearArrayList();
        assertEquals(actual,expected);
    }
}
