import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class MCC {
    /* Chicken types:
        "Black Sex Link",
        "White Cochin",
        "Rhode Island Red",
        "Buff Orpington",
        "Buff Laced Polish"
    */
    @Test
    public void checkFarm1() {
        boolean result = Farm.checkFarm(false, -100,"Flamingo");
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = Farm.checkFarm(false, -24, "Black Sex Link");
        assertTrue(result);
    }

    @Test
    public void checkFarm3() {
        boolean result = Farm.checkFarm(false, 360, "Lion");
        assertFalse(result);
    }

    @Test
    public void checkFarm4() {
        boolean result = Farm.checkFarm(false,40, "White Cochin");
        assertTrue(result);
    }

    @Test
    public void checkFarm5() {
        boolean result = Farm.checkFarm(true,1200, "Giraffe");
        assertFalse(result);
    }

    @Test
    public void checkFarm6() {
        boolean result = Farm.checkFarm(true,2317, "Rhode Island Red");
        assertTrue(result);
    }

    @Test
    public void checkFarm7() {
        boolean result = Farm.checkFarm(true,720, "Snake");
        assertTrue(result);
    }

    @Test
    public void checkFarm8() {
        boolean result = Farm.checkFarm(true,520, "Buff Laced Polish");
        assertTrue(result);
    }
}