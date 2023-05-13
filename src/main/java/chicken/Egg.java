package chicken;

public record Egg(int egg) {
    private double eggOption1() {
        return egg % 20 == 0 ? egg * 0.25 : 0.00;
    }

    private double eggOption2() {
        return egg % 20 == 0 ? egg * 0.20 : 0.00;
    }

    private double eggOption3() {
        return egg % 20 == 0 ? egg * 0.15 : 0.00;
    }

    public double eggOption() {
        return 0 <= egg && egg <= 200 ? eggOption1() :
            200 < egg && egg <= 500 ? eggOption2() :
            500 < egg && egg <= 1000 ? eggOption3() : 0.00;
    }
}