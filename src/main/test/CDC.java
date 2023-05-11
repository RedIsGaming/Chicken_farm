import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class CDC {
    @Test
    public void checkFarm1() {
        boolean result = Farm.checkFarm(false, 479,"Monkey");
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = Farm.checkFarm(false, 440, "Rhode Island Red");
        assertTrue(result);
    }

    @Test
    public void checkFarm3() {
        boolean result = Farm.checkFarm(true, -301, "Pig");
        assertFalse(result);
    }

    @Test
    public void checkFarm4() {
        boolean result = Farm.checkFarm(true,5000, "Buff Orpington");
        assertTrue(result);
    }
}