import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class CC {
    @Test
    public void testCheckFarm1() {
        boolean result = Farm.checkFarm(799,"White Cochin", true);
        assertTrue(result);
    }

    @Test
    public void testCheckFarm2() {
        boolean result = Farm.checkFarm(380, "Cow", true);
        assertTrue(result);
    }
}