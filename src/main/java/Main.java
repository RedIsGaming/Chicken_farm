import chicken.Farm;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
import java.util.Iterator;

public class Main {
    protected static int checkFarm(Integer egg, String typeChicken, Date layTime, boolean isPsychical) {
        return !isPsychical ? 0 : egg > 0 && egg <= 1000 ? egg % 20 : 8;
    }

    public static void main(String[] args) {
        System.out.println("\n" + "\u001B[32mWelcome to the Reddy Chicken Farm! You can read the instructions in the docs folder." + "\n");

        List<Farm> farms = List.of(
            new Farm(0, "Black Sex Link", new Date(2019, Calendar.JANUARY, 1), true),
            new Farm(250, "White Cochin", new Date(2020, Calendar.FEBRUARY, 2), false),
            new Farm(500, "Rhode Island Red", new Date(2021, Calendar.MARCH, 3), true),
            new Farm(750, "Buff Orpington", new Date(2022, Calendar.APRIL, 4), false),
            new Farm(1000, "Buff Laced Polish", new Date(2023, Calendar.MAY, 5), true)
        );

        int i = 0;
        Iterator<Farm> iterator = farms.iterator();

        while (iterator.hasNext()) {
            Farm farm = iterator.next();
            i++;
            System.out.printf("\u001B[34mStorage %d: %d, %s, %s\n", i, farm.egg(), farm.typeChicken(), farm.layTime());
        }
    }
}