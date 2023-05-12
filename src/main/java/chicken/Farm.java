package chicken;

import java.util.List;

public record Farm(boolean isPsychical, int egg, String typeChicken) {
    private List<String> chickenType() {
        return List.of(
            "Black Sex Link",
            "White Cochin",
            "Rhode Island Red",
            "Buff Orpington",
            "Buff Laced Polish"
        );
    }

    public boolean checkFarm() {
        List<String> chickenTypes = chickenType();

        return (isPsychical && egg % 20 == 0) || chickenTypes.contains(typeChicken);
    }
}