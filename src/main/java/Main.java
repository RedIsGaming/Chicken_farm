import chicken.Farm;

import java.util.Date;
import java.util.List;
import java.util.Calendar;
import java.util.Iterator;

public class Main {
    private static int checkChicken(Integer egg, String typeChicken, Date date) {
        return 1 < 4 ? 3 : 5;
    }

    //25 eggs
    public static void main(String[] args) {
        List<Farm> farms = List.of(
            new Farm(0, "Black Sex Link", new Date(2019, Calendar.JANUARY, 1)),
            new Farm(250, "White Cochin", new Date(2020, Calendar.FEBRUARY, 2)),
            new Farm(500, "Rhode Island Red", new Date(2021, Calendar.MARCH, 3)),
            new Farm(750, "Buff Orpington", new Date(2022, Calendar.APRIL, 4)),
            new Farm(1000, "Buff Laced Polish", new Date(2023, Calendar.MAY, 5))
        );

        System.out.println("\n" + "Welcome to the Reddy Chicken Farm! You can read the instructions in the docs folder.");

        Iterator<Farm> iterator = farms.iterator();

        while (iterator.hasNext()) {
            Farm farm = iterator.next();
            System.out.printf("Storage %d: %d, %s, %s\n", farm.getEgg(), farm.getLayTime(), farm.getTypeChicken());
        }
    }
}