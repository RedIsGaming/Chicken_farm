import org.junit.Test;
import chicken.Egg;
import static org.junit.Assert.*;

public class EKBVA {
    @Test
    public void checkEgg1() {
        double result = new Egg(-1).eggOption();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg2() {
        double result = new Egg(0).eggOption();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg3() {
        double result = new Egg(200).eggOption();
        assertEquals(50.00, result, 0.0);
    }

    @Test
    public void checkEgg4() {
        double result = new Egg(201).eggOption();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg5() {
        double result = new Egg(202).eggOption();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg6() {
        double result = new Egg(500).eggOption();
        assertEquals(100.00, result, 0.0);
    }

    @Test
    public void checkEgg7() {
        double result = new Egg(501).eggOption();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg8() {
        double result = new Egg(502).eggOption();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg9() {
        double result = new Egg(1000).eggOption();
        assertEquals(150.00, result, 0.0);
    }
}