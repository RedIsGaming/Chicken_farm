import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class MCDC {
    /* Chicken types:
        "Black Sex Link",
        "White Cochin",
        "Rhode Island Red",
        "Buff Orpington",
        "Buff Laced Polish"
    */
    @Test
    public void checkFarm1() {
        boolean result = Farm.checkFarm(false, 762,"Flamingo");
        assertFalse(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = Farm.checkFarm(false, 80, "Crocodile");
        assertFalse(result);
    }

    @Test
    public void checkFarm3() {
        boolean result = Farm.checkFarm(false, -92, "Black Sex Link");
        assertTrue(result);
    }

    @Test
    public void checkFarm4() {
        boolean result = Farm.checkFarm(true,1200, "Lion");
        assertFalse(result);
    }

    @Test
    public void checkFarm5() {
        boolean result = Farm.checkFarm(true,740, "Giraffe");
        assertTrue(result);
    }

    @Test
    public void checkFarm6() {
        boolean result = Farm.checkFarm(true,5475, "Buff Orpington");
        assertTrue(result);
    }
}