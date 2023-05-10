import java.util.List;
import chicken.Farm;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[32mWelcome to the Reddy Chicken Farm! You can read the instructions in the " +
            "docs folder." + "\n"
        );

        List<Farm> farms = List.of(
            new Farm(0, "Black Sex Link",true),
            new Farm(250, "White Cochin",false),
            new Farm(500, "Rhode Island Red",true),
            new Farm(750, "Buff Orpington",false),
            new Farm(1000, "Buff Laced Polish",true)
        );

        int i = 0;
        Iterator<Farm> iterator = farms.iterator();

        while (iterator.hasNext()) {
            Farm farm = iterator.next();
            i++;

            System.out.printf("\u001B[34mStorage %d\nNumber of eggs: %d\nChicken type: %s%nIs psychical: %b\n\n",
                i, farm.egg(), farm.typeChicken(), farm.isPsychical()
            );
        }
    }
}