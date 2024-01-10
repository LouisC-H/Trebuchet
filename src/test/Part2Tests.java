import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Part2Tests {

    @Test
    void testA(){
        Assertions.assertEquals(Main.extractDigits("two1nine"), 29);
    }

    @Test
    void testB(){
        Assertions.assertEquals(Main.extractDigits("eightwothree"), 83);
    }

    @Test
    void testC(){
        Assertions.assertEquals(Main.extractDigits("abcone2threexyz"), 13);
    }

    @Test
    void testD(){
        Assertions.assertEquals(Main.extractDigits("xtwone3four"), 24);
    }

    @Test
    void testE(){
        Assertions.assertEquals(Main.extractDigits("4nineeightseven2"), 42);
    }

    @Test
    void testF(){
        Assertions.assertEquals(Main.extractDigits("zoneight234"), 14);
    }

    @Test
    void testG(){
        Assertions.assertEquals(Main.extractDigits("7pqrstsixteen"), 76);
    }
}
