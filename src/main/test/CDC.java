import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class CDC {
    @Test
    public void checkFarm1() {
        boolean result = new Farm(false, 479, "Monkey").checkFarm();
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = new Farm(false, 440, "Rhode Island Red").checkFarm();
        assertTrue(result);
    }

    @Test
    public void checkFarm3() {
        boolean result = new Farm(true, -301, "Pig").checkFarm();
        assertFalse(result);
    }

    @Test
    public void checkFarm4() {
        boolean result = new Farm(true, 5000, "Buff Orpington").checkFarm();
        assertTrue(result);
    }
}