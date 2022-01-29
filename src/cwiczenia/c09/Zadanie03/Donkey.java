package cwiczenia.c09.Zadanie03;

public class Donkey {
    private final double mass;
    private int maxBallons = 100;
    private Balloon[] arr = new Balloon[maxBallons];

    public Donkey(double mass){
        this.mass = mass;
    }

    public void addBaloon(Balloon Baloon) {
        arr[arr.length] = Baloon;
    }

    public boolean isFlying() {
        double massInGrams = mass * 1000;
        double sumCapacity = 0;
        for (int i = 0; i < arr.length; i++) {
            sumCapacity += arr[i].getLoad();
        }

        return sumCapacity >= massInGrams;
    }
}
