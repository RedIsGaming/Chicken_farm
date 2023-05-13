import org.junit.Test;
import chicken.Environment;
import static org.junit.Assert.*;

public class PT {
    @Test
    public void checkEnvironment1() {
        double result = new Environment(84, true, "Black Sex Link", true)
        .eggOrMeatOption1();
        assertEquals(8.33, result, 0.01);
    }

    @Test
    public void checkEnvironment2() {
        double result = new Environment(84, false, "Turtle", false)
        .eggOrMeatOption1();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEnvironment3() {
        double result = new Environment(120, true, "Black Sex Link", true)
        .eggOrMeatOption1();
        assertEquals(30.00, result, 0.0);
    }

    @Test
    public void checkEnvironment4() {
        double result = new Environment(120, false, "Turtle", false)
        .eggOrMeatOption1();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEnvironment5() {
        double result = new Environment(472, true, "Black Sex Link", true)
        .eggOrMeatOption2();
        assertEquals(6.66, result, 0.01);
    }

    @Test
    public void checkEnvironment6() {
        double result = new Environment(472, false, "Turtle", false)
        .eggOrMeatOption2();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEnvironment7() {
        double result = new Environment(500, true, "Black Sex Link", true)
        .eggOrMeatOption2();
        assertEquals(100.00, result, 0.0);
    }

    @Test
    public void checkEnvironment8() {
        double result = new Environment(500, false, "Turtle", false)
        .eggOrMeatOption2();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEnvironment9() {
        double result = new Environment(797, true, "Black Sex Link", true)
        .eggOrMeatOption3();
        assertEquals(5.00, result, 0.01);
    }

    @Test
    public void checkEnvironment10() {
        double result = new Environment(797, false, "Turtle", false)
        .eggOrMeatOption3();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEnvironment11() {
        double result = new Environment(860, true, "Black Sex Link", true)
        .eggOrMeatOption3();
        assertEquals(129.00, result, 0.0);
    }

    @Test
    public void checkEnvironment12() {
        double result = new Environment(860, false, "Turtle", false)
        .eggOrMeatOption3();
        assertEquals(0.00, result, 0.0);
    }
}