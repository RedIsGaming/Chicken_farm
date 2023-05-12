import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class DC {
    @Test
    public void checkFarm1() {
        boolean result = new Farm(false, -20, "White Cochin").checkFarm();
        assertTrue(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = new Farm(true, 194, "Giraffe").checkFarm();
        assertFalse(result);
    }
}