package wyklady.w09;

public class Main {
    public static void main(String[] args) {
        new Cookie(10, "rodzynki").show();
        Cookie cookie = new Cookie(20, "rodzyny");
        cookie.show();

        new A();

        Cookie cookie1 = new Cookie(20);
        cookie1.setWeight(100);
        cookie1.show();


    }
}

class Cookie {
    int weight;
    String ingredient;

    Cookie(int weight, String ingredient) {
        this.weight = weight;
        this.ingredient = ingredient;
    }

    Cookie(int weight) {
        this(weight, "choco");
    }

    public void show() {
        System.out.println("Cookie: " + weight + " " + ingredient);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }
}




class A {
    public A(){

    }
}
