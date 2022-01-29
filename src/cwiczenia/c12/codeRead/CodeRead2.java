package cwiczenia.c12.codeRead;

public class CodeRead2 {
    public static void main(String[] args) {

        System.out.println("\n--- 1 ---\n");
        {
            A a = new A();
            B b = new B();
            C c = new C();
            D d = new D();

            a.fun();
            b.fun();
            c.fun();
            d.fun();
        }

        System.out.println("\n--- 2 ---\n");
        {
            A a = new A();
            B b = new B();
            C c = new C();
            D d = new D();

            A[] aTab = new A[5];
            aTab[0] = a;
            aTab[1] = b;
            aTab[2] = c;
            aTab[3] = d;

            for (int i = 0; i < aTab.length; i++) {
                System.out.println( aTab[i] );
            }
        }

        System.out.println("\n--- 3 ---\n");
        {
            A a = new A();
            B b = new B();
            C c = new C();
            D d = new D();

            A[] aTab = new A[5];
            aTab[0] = a;
            aTab[1] = b;
            aTab[2] = c;
            aTab[3] = d;

            for (A element : aTab) {
                System.out.println( element );
            }
        }

        System.out.println("\n--- 4 ---\n");
        {
            A a = new A();
            String myA = "A";
            String myNewA = new String("A");
            String mySortOfNewA = "A";

            System.out.println("\n--- 4A ---\n");
            {
                System.out.println( myA == myA );
                System.out.println( myA.equals(myA) );
                System.out.println( myA == myNewA );
                System.out.println( myA == mySortOfNewA );
            }

            System.out.println("\n--- 4B ---\n");
            {
                System.out.println( myA = myNewA );
                System.out.println( myA == myA );
                System.out.println( myA.equals(myA) );
                System.out.println( myA == myNewA );
                System.out.println( myA == mySortOfNewA );
            }

            System.out.println("\n--- 4C ---\n");
            {
                System.out.println( myA = "A" );
                System.out.println( myA == myA );
                System.out.println( myA.equals(myA) );
                System.out.println( myA == myNewA );
                System.out.println( myA == mySortOfNewA );

                System.out.println("---");

                System.out.println( myNewA = "A" );
                System.out.println( myA == myA );
                System.out.println( myA.equals(myA) );
                System.out.println( myA == myNewA );
                System.out.println( myA == mySortOfNewA );

                //gdzie jest i jak dostac sie do obiektu
                //ktory byl pod zmienna myNewA???
            }

            System.out.println("\n--- 4D ---\n");
            {
                System.out.println(A.byMyA().equals(myA));
                System.out.println(B.byMyA("Compliance").equals(myA));

                System.out.println(A.byMyA() == myA);
                System.out.println(B.byMyA("Compliance") == myA);
            }
        }

        System.out.println("\n--- 5 ---\n");
        {
            //metoda hashCode() pozwoli nam na sprawdzenie czy to ten sam obiekt;
            System.out.println("\n--- 5A ---\n");
            {
                Doom doom = new Doom();
                Doom daniel = doom;
                
                System.out.println( doom.hashCode() == daniel.hashCode());
            }

            System.out.println("\n--- 5B ---\n");
            {
                Doom doom = new Doom();
                Doom imposter = new Doom(doom);

                System.out.println( doom.hashCode() == imposter.hashCode());
            }

            System.out.println("\n--- 5C ---\n");
            {
                Doom doom = new Doom();
                Doom wannabe = new Doom(doom.intField, doom.stringField, doom.doomedSkill);

                System.out.println( doom.hashCode() == wannabe.hashCode());
                System.out.println( doom.doomedSkill.hashCode() == wannabe.doomedSkill.hashCode() );
            }
            
            System.out.println("\n--- 5D ---\n");
            {
                Doom doom = new Doom();
                Doom goat = doom.returnGOAT();

                System.out.println( doom.hashCode() == goat.hashCode());
            }

            System.out.println("\n--- 5E ---\n");
            {
                Doom doom = new Doom();
                Doom daniel = doom;

                System.out.println( doom.hashCode() == daniel.hashCode());

                daniel.doomedSkill = new Skill("J Dilla");

                System.out.println( doom.hashCode() == daniel.hashCode());

                System.out.println( doom.doomedSkill.name);
                System.out.println( daniel.doomedSkill.name);
            }

            System.out.println("\n--- 5F ---\n");
            {
                Doom doom = new Doom();
                Doom imposter = new Doom(doom);

                System.out.println( doom.hashCode() == imposter.hashCode());

                imposter.doomedSkill = new Skill("J Dilla");

                System.out.println( doom.hashCode() == imposter.hashCode());

                System.out.println( doom.doomedSkill.name);
                System.out.println( imposter.doomedSkill.name);
            }
            
        }

        System.out.println("\n--- 6 ---\n");
        {
            try {
                try {

                    try {
                        throw new IndexOutOfBoundsException();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("You ");
                    }

                    System.out.println( "gotta" );

                } catch (IndexOutOfBoundsException e){
                    System.out.println("be ");
                }finally {
                    System.out.println("kidding");
                }
            }catch (Exception e){
                System.out.println("me ");
            }

        }

    }
    public static class A{

        public void fun(){
            System.out.println("Hello my name is " + this.getClass().getSimpleName());
        }

        @Override
        public String toString() {
            return "A";
        }

        public static String byMyA(){
            return "A";
        }

        public static String byMyA(String s){
            return new String("A");
        }
    }

    public static class B extends A{

        @Override
        public void fun(){
            super.fun();
        }

        @Override
        public String toString() {
            return "B";
        }
    }

    public static class C extends B{

        @Override
        public void fun(){
            System.out.println("Konichiwa my name is " + this.getClass().getSimpleName());
        }

        @Override
        public String toString() {
            return "C";
        }
    }

    public static class D extends A{

        @Override
        public void fun(){
            super.fun();
            System.out.println("Bye " + this);
        }

    }

    public static class Doom {

        int intField;
        String stringField = "RIP";
        Skill doomedSkill = new Skill("OP");

        public Doom(){};

        public Doom(int intField, String stringField, Skill doomedSkill) {
            this.intField = intField;
            this.stringField = stringField;
            this.doomedSkill = doomedSkill;
        }

        public Doom(Doom someClass){
            this.intField = someClass.intField;
            this.stringField = someClass.stringField;
            this.doomedSkill = someClass.doomedSkill;
        }

        public Doom returnGOAT(){
            return this;
        }

    }

    public static class Skill{
        String name;

        public Skill(String string) {
            this.name = string;
        }
    }


    //by MS
}
