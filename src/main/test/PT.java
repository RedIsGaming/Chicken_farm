import org.junit.Test;
import chicken.Environment;
import static org.junit.Assert.*;

public class PT {
    @Test
    public void checkEnvironment1() {
        double result = new Environment(84, true, "Black Sex Link", true)
        .eggOrMeatOption();
        assertEquals(8.33, result, 0.01);
    }

    @Test
    public void checkEnvironment2() {
        double result = new Environment(120, false, "Turtle", false)
        .eggOrMeatOption();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEnvironment3() {
        double result = new Environment(472, false, "Turtle", false)
        .eggOrMeatOption();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEnvironment4() {
        double result = new Environment(500, true, "Turtle", true)
        .eggOrMeatOption();
        assertEquals(100.00, result, 0.0);
    }

    @Test
    public void checkEnvironment5() {
        double result = new Environment(797, true, "Black Sex Link", false)
        .eggOrMeatOption();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEnvironment6() {
        double result = new Environment(860, false, "Black Sex Link", false)
        .eggOrMeatOption();
        assertEquals(129.00, result, 0.0);
    }
}