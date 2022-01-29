package wyklady.w12;

public class Rocket {
    private int fullMass;
    private boolean engineStatus = false;

    public void start() throws FullLimitException, EngineStartedException {
        if (fullMass < 100)
            throw new FullLimitException();
        if (engineStatus)
            throw new EngineStartedException();
        System.out.println("Engine start("+fullMass+") 🚀");
        engineStatus = true;
    }

    public void fillFuel(int val) {
        fullMass += val;
        System.out.println(val + " fuel added ⛽");
    }
}
