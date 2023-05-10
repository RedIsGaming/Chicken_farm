import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class DC {
    @Test
    public void testCheckFarm1() {
        boolean result = Farm.checkFarm(799,"White Cochin", false);
        assertTrue(result);
    }

    @Test
    public void testCheckFarm2() {
        boolean result = Farm.checkFarm(380, "Cow", true);
        assertTrue(result);
    }
}