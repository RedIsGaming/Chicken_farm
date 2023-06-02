import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class MCDC {
    @Test
    public void checkFarm1() {
        boolean result = new Farm(false, 660, "Fly").checkFarm();
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = new Farm(false, 820, "Buff Laced Polish").checkFarm();
        assertTrue(result);
    }

    @Test
    public void checkFarm3() {
        boolean result = new Farm(true, 78, "Bee").checkFarm();
        assertFalse(result);
    }

    @Test
    public void checkFarm4() {
        boolean result = new Farm(true, 200, "Goat").checkFarm();
        assertTrue(result);
    }
}