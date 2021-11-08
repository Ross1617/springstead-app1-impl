package baseline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class openFileTest {
    parseOpenedFile parse = new parseOpenedFile();

    @Test
    public void parserTester(){
        String text = "2010-10-12_Walk a mile_0";
        parse.parseInformation(text);
        String expected = "0";
        String actual = parse.getCompleted();
        assertEquals(expected,actual);
    }
    @Test
    public void parserTester2(){
        String text = "2010-10-12_Walk a mile_0";
        parse.parseInformation(text);
        String expected = "Walk a mile";
        String actual = parse.getDescription();
        assertEquals(expected,actual);
    }
    @Test
    public void parserTester3(){
        String text = "2010-10-12_Walk a mile_0";
        parse.parseInformation(text);
        String expected = "2010-10-12";
        String actual = parse.getDate();
        assertEquals(expected,actual);
    }
}
