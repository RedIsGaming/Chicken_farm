package chicken;

public record Environment(int egg, boolean isPsychical, String typeChicken, boolean broilerChicken) {
    public double eggOrMeatOption1() {
        return new Farm(isPsychical, egg, typeChicken).checkFarm() && new Egg(egg).checkEgg() &&
            egg % 20 == 0 ? egg * 0.25 :
            broilerChicken ? (egg * 0.50) / (egg * 60.00 / 1000) : 0.00;
    }

    public double eggOrMeatOption2() {
        return new Farm(isPsychical, egg, typeChicken).checkFarm() && new Egg(egg).checkEgg() &&
            egg % 20 == 0 ? egg * 0.20 :
            broilerChicken ? (egg * 0.40) / (egg * 60.00 / 1000) : 0.00;
    }

    public double eggOrMeatOption3() {
        return new Farm(isPsychical, egg, typeChicken).checkFarm() && new Egg(egg).checkEgg() &&
            egg % 20 == 0 ? egg * 0.15 :
            broilerChicken ? (egg * 0.30) / (egg * 60.00 / 1000) : 0.00;
    }
}