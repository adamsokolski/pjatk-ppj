package wyklady.w11;

public
    class Student
    extends Person {
        protected int sNumber;

        public Student(String name, int birthYear, int sNumber) {
            super(name, birthYear);
            this.sNumber = sNumber;
        }

        public void show() {
            System.out.println(name+" "+birthYear+" "+sNumber);
        }

        public String whoAreYou() {
            return super.whoAreYou() + " -> Student";
        }
        public String toString() {
        return super.whoAreYou() + " -> Student";
    }
}
