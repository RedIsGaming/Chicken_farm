import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class MCDC {
    @Test
    public void checkFarm1() {
        boolean result = Farm.checkFarm(false, 823, "Fly");
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = Farm.checkFarm(false, -78, "Buff Laced Polish");
        assertTrue(result);
    }

    @Test
    public void checkFarm3() {
        boolean result = Farm.checkFarm(false, 660,"Bee");
        assertFalse(result);
    }

    @Test
    public void checkFarm4() {
        boolean result = Farm.checkFarm(true,1795, "Goat");
        assertFalse(result);
    }
}