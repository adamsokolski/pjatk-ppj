package wyklady.w10;

public class Month {
    protected String name;
    protected int days;

    public Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public Month(String name, int days, boolean leap) {
        this(name, days + (leap ? 1 : 0));
    }

    public String getData() {
        return this.name + " - " + this.days;
    }
}
