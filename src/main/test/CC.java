import org.junit.Test;
import chicken.Farm;
import static org.junit.Assert.*;

public class CC {
    @Test
    public void checkFarm1() {
        boolean result = Farm.checkFarm(true, 400,"Elephant");
        assertTrue(result);
    }

    @Test
    public void checkFarm2() {
        boolean result = Farm.checkFarm(true, 38, "Black Sex Link");
        assertTrue(result);
    }
}