import java.util.List;
import chicken.Farm;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[32mWelcome to the Reddy Chicken Farm! Instructions are found in the docs folder.\n");

        List<Farm> farms = List.of(
            new Farm(true, 260, "Cat"),
            new Farm(false, 720, "Rhode Island Red"),
            new Farm(true, 39, "Black Sex Link")
        );

        int storage = 0;
        Iterator<Farm> iterator = farms.iterator();

        while (iterator.hasNext()) {
            Farm farm = iterator.next();
            storage++;

            System.out.printf("\u001B[34mStorage %d\n" +
                "Is psychical: %b\n" +
                "Number of eggs: %d\n" +
                "Chicken type: %s\n\n",
                storage, farm.isPsychical(), farm.egg(), farm.typeChicken()
            );
        }
    }
}