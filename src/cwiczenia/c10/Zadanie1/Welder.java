package cwiczenia.c10.Zadanie1;

public class Welder extends Person {
    private String jobSeniority;

    public Welder(String name, String jobSeniority) {
        super(name);
        this.jobSeniority = jobSeniority;
    }

    @Override
    public String getString() {
        return super.getString() + " - " + this.jobSeniority;
    }
}
