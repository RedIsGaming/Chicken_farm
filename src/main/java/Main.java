import java.util.List;
import chicken.Farm;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[32mWelcome to the Reddy Chicken Farm! Instructions are found in the docs folder.\n");

        List<Farm> farms = List.of(
            new Farm(true,0, "Black Sex Link"),
            new Farm(false, 250, "White Cochin"),
            new Farm(true, 500, "Rhode Island Red"),
            new Farm(false, 750, "Buff Orpington"),
            new Farm(true, 1000, "Buff Laced Polish")
        );

        int i = 0;
        Iterator<Farm> iterator = farms.iterator();

        while (iterator.hasNext()) {
            Farm farm = iterator.next();
            i++;

            System.out.printf("\u001B[34mStorage %d\nIs psychical: %b\nNumber of eggs: %d\nChicken type: %s\n\n",
                i, farm.isPsychical(), farm.egg(), farm.typeChicken()
            );
        }
    }
}