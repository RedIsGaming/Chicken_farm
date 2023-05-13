package chicken;

public record Environment(int egg, boolean isPsychical, String typeChicken, boolean broilerChicken) {
    private double eggOrMeatOption1() {
        return new Farm(isPsychical, egg, typeChicken).checkFarm() &&
            egg % 20 == 0 ? new Egg(egg).eggOption() :
            broilerChicken ? (egg * 0.50) / (egg * 60.00 / 1000) : 0.00;
    }

    private double eggOrMeatOption2() {
        return new Farm(isPsychical, egg, typeChicken).checkFarm() &&
            egg % 20 == 0 ? new Egg(egg).eggOption() :
            broilerChicken ? (egg * 0.40) / (egg * 60.00 / 1000) : 0.00;
    }

    private double eggOrMeatOption3() {
        return new Farm(isPsychical, egg, typeChicken).checkFarm() &&
            egg % 20 == 0 ? new Egg(egg).eggOption() :
            broilerChicken ? (egg * 0.30) / (egg * 60.00 / 1000) : 0.00;
    }

    public double eggOrMeatOption() {
        return 0 <= egg && egg <= 200 ? eggOrMeatOption1() :
            200 < egg && egg <= 500 ? eggOrMeatOption2() :
            500 < egg && egg <= 1000 ? eggOrMeatOption3() : 0.00;
    }
}