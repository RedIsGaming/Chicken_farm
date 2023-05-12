import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class MCDC {
    @Test
    public void checkFarm1() {
        boolean result = new Farm(false, 823, "Fly").checkFarm();
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = new Farm(false, -78, "Buff Laced Polish").checkFarm();
        assertTrue(result);
    }

    @Test
    public void checkFarm3() {
        boolean result = new Farm(false, 660, "Bee").checkFarm();
        assertFalse(result);
    }

    @Test
    public void checkFarm4() {
        boolean result = new Farm(true, 1795, "Goat").checkFarm();
        assertFalse(result);
    }
}