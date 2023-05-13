import org.junit.Test;
import chicken.Egg;
import static org.junit.Assert.*;

public class EKBVA {
    @Test
    public void checkEgg1() {
        double result = new Egg(-1).eggOption1();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg2() {
        double result = new Egg(0).eggOption1();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg3() {
        double result = new Egg(1).eggOption1();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg4() {
        double result = new Egg(199).eggOption1();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg5() {
        double result = new Egg(200).eggOption1();
        assertEquals(50.00, result, 0.0);
    }

    @Test
    public void checkEgg6() {
        double result = new Egg(201).eggOption2();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg7() {
        double result = new Egg(499).eggOption2();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg8() {
        double result = new Egg(500).eggOption2();
        assertEquals(100.00, result, 0.0);
    }

    @Test
    public void checkEgg9() {
        double result = new Egg(501).eggOption3();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg10() {
        double result = new Egg(999).eggOption3();
        assertEquals(0.00, result, 0.0);
    }

    @Test
    public void checkEgg11() {
        double result = new Egg(1000).eggOption3();
        assertEquals(150.00, result, 0.0);
    }

    @Test
    public void checkEgg12() {
        double result = new Egg(1001).eggOption3();
        assertEquals(0.00, result, 0.0);
    }
}