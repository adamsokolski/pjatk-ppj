package wyklady.w12;

public class FullLimitException extends Exception {
    public FullLimitException() {
        super("Low fuel ⚠");
    }
}
