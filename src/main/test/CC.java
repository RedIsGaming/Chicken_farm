import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class CC {
    @Test
    public void checkFarm1() {
        boolean result = new Farm(true, 400, "Elephant").checkFarm();
        assertTrue(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = new Farm(false, 38, "Black Sex Link").checkFarm();
        assertTrue(result);
    }
}