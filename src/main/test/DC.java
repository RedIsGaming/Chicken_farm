import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class DC {
    /* Chicken types:
        "Black Sex Link",
        "White Cochin",
        "Rhode Island Red",
        "Buff Orpington",
        "Buff Laced Polish"
    */
    @Test
    public void checkFarm1() {
        boolean result = Farm.checkFarm(false, 349, "White Cochin");
        assertTrue(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = Farm.checkFarm(true, -60, "Cow");
        assertFalse(result);
    }
}