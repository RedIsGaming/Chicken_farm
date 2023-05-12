import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class MCC {
    @Test
    public void checkFarm1() {
        boolean result = new Farm(false, 68, "Seal").checkFarm();
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = new Farm(false, 297, "Black Sex Link").checkFarm();
        assertTrue(result);
    }

    @Test
    public void checkFarm3() {
        boolean result = new Farm(false, 100000, "Shark").checkFarm();
        assertFalse(result);
    }

    @Test
    public void checkFarm4() {
        boolean result = new Farm(false, 35940, "White Cochin").checkFarm();
        assertTrue(result);
    }

    @Test
    public void checkFarm5() {
        boolean result = new Farm(true, 2601, "Rhinoceros").checkFarm();
        assertFalse(result);
    }

    @Test
    public void checkFarm6() {
        boolean result = new Farm(true, 4, "Rhode Island Red").checkFarm();
        assertTrue(result);
    }

    @Test
    public void checkFarm7() {
        boolean result = new Farm(true, 180, "Hyena").checkFarm();
        assertTrue(result);
    }

    @Test
    public void checkFarm8() {
        boolean result = new Farm(true, 9940, "Buff Orpington").checkFarm();
        assertTrue(result);
    }
}