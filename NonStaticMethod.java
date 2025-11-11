class Mobile {

    String brand;
    int price; // Instance variable
    static String name; // Static variable share all the objects

    public void show() { // Non - static method
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile m) { // static method, cannot accept non static variable. should do inderectly
        System.out.println(m.brand + " : " + m.price + " : " + name);

    }

}

public class NonStaticMethod {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 20000;
        Mobile.name = "Iphone 7";

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 10000;
        Mobile.name = "Samsung 7";

        m1.show();
        m2.show();

        Mobile.show1(m1);
    }
}
