import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class DC {
    @Test
    public void checkFarm1() {
        boolean result = Farm.checkFarm(false, -20,"White Cochin");
        assertTrue(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = Farm.checkFarm(true, 194, "Giraffe");
        assertFalse(result);
    }
}