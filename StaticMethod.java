class Mobile {

    String brand;
    int price;    // Instance variable
    String name;

    public void show() { // local variable
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticMethod {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 20000;
        m1.name = "Iphone 7";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 10000;
        m2.name = "Samsung 7";

        m1.show();
        m2.show();
    }
}
