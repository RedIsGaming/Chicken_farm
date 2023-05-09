import org.junit.Test;
import java.util.Date;
import java.util.Calendar;
import static org.junit.Assert.*;

public class CC {
    @Test
    public void testCheckFarm() {
        Integer result = Main.checkFarm(0, "Black Sex Link", new Date(2019, Calendar.JANUARY, 1), true);
        assertEquals(8, result.intValue());
    }
}