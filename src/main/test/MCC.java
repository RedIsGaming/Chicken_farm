import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class MCC {
    @Test
    public void checkFarm1() {
        boolean result = Farm.checkFarm(false, 68,"Seal");
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = Farm.checkFarm(false, 297, "Black Sex Link");
        assertTrue(result);
    }

    @Test
    public void checkFarm3() {
        boolean result = Farm.checkFarm(false, 100000, "Shark");
        assertFalse(result);
    }

    @Test
    public void checkFarm4() {
        boolean result = Farm.checkFarm(false,35940, "White Cochin");
        assertTrue(result);
    }

    @Test
    public void checkFarm5() {
        boolean result = Farm.checkFarm(true,2601, "Rhinoceros");
        assertFalse(result);
    }

    @Test
    public void checkFarm6() {
        boolean result = Farm.checkFarm(true,4, "Rhode Island Red");
        assertTrue(result);
    }

    @Test
    public void checkFarm7() {
        boolean result = Farm.checkFarm(true,180, "Hyena");
        assertTrue(result);
    }

    @Test
    public void checkFarm8() {
        boolean result = Farm.checkFarm(true,9940, "Buff Orpington");
        assertTrue(result);
    }
}