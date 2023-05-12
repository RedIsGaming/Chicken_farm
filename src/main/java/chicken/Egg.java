package chicken;

public record Egg(int egg) {
    public boolean checkEgg() {
        return 0 < egg && egg <= 200 ||
            200 < egg && egg <= 500 ||
            500 < egg && egg <= 1000;
    }

    public double eggOption1() {
        return checkEgg() && egg % 20 == 0 ? egg * 0.25 : 0.00;
    }

    public double eggOption2() {
        return checkEgg() && egg % 20 == 0 ? egg * 0.20 : 0.00;
    }

    public double eggOption3() {
        return checkEgg() && egg % 20 == 0 ? egg * 0.15 : 0.00;
    }
}