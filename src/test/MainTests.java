import org.junit.jupiter.api.*;

public class MainTests {

    @Test
    void testA(){
        Assertions.assertEquals(Main.extractDigits("1abc2"), 12);
    }

    @Test
    void testB(){
        Assertions.assertEquals(Main.extractDigits("pqr3stu8vwx"), 38);
    }

    @Test
    @DisplayName(">2 digit test")
    void testC(){
        Assertions.assertEquals(Main.extractDigits("a1b2c3d4e5f"), 15);
    }

    @Test
    @DisplayName("Single digit test")
    void testD(){
        Assertions.assertEquals(Main.extractDigits("treb7uchet"), 77);
    }
}
