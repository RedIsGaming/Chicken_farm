import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class CDC {
    @Test
    public void checkFarm1() {
        boolean result = new Farm(true, 479, "Monkey").checkFarm();
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = new Farm(false, 440, "Rhode Island Red").checkFarm();
        assertTrue(result);
    }
}