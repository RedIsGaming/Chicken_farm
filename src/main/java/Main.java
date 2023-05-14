import java.util.List;
import chicken.Environment;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[32mWelcome to the Reddy Chicken Farm! Instructions are found in the docs folder.\n");

        List<Environment> environments = List.of(
            new Environment(260, true, "Cat", false),
            new Environment(720, false, "Rhode Island Red", true),
            new Environment(39, true, "Black Sex Link", true)
        );

        int storage = 0;
        Iterator<Environment> iterator = environments.iterator();

        while (iterator.hasNext()) {
            Environment environment = iterator.next();
            storage++;

            System.out.printf("\u001B[34mStorage %d\n" +
                "Is psychical: %b\n" +
                "Number of eggs: %d\n" +
                "Chicken type: %s\n" +
                "Broiler chicken: %b\n\n", storage,
                environment.isPsychical(), environment.egg(), environment.typeChicken(), environment.broilerChicken()
            );
        }
    }
}