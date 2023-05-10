import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class CDC {
    /* Chicken types:
        "Black Sex Link",
        "White Cochin",
        "Rhode Island Red",
        "Buff Orpington",
        "Buff Laced Polish"
    */
    @Test
    public void checkFarm1() {
        boolean result = Farm.checkFarm(false, 762,"Elephant");
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = Farm.checkFarm(false, 380, "White Cochin");
        assertTrue(result);
    }

    @Test
    public void checkFarm3() {
        boolean result = Farm.checkFarm(true, -60, "Cow");
        assertFalse(result);
    }

    @Test
    public void checkFarm4() {
        boolean result = Farm.checkFarm(true,1000, "Rhode Island Red");
        assertTrue(result);
    }
}