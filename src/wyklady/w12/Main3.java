package wyklady.w12;

public class Main3 {
    public static void main(String[] args) {

        Rocket rocket = new Rocket();

        for (int i = 0; i < 3; i++) {
            try {
                rocket.start();
            } catch (FullLimitException e) {
                rocket.fillFuel(100);
            } catch (EngineStartedException e) {
                System.out.println("Engine already started ⚠");
            }

            /* finally {
                System.out.println("⚠ Stop start - unknown exception ⚠");
            } */
        }


    }
}
