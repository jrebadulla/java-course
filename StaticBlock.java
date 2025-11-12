class Mobile {

    String brand;
    int price; // Instance variable
    static String name; // Static variable share all the objects

    static { // Static block , it call only once, it call first
        name = "Phone"; // static variable
        System.out.println("in static block");
    }

    public Mobile() { // constructor
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show() { // Non - static method
        System.out.println(brand + " : " + price + " : " + name);
    }

    // public static void show1(Mobile m) { // static method, cannot accept non
    // static variable. should do inderectly
    // System.out.println(m.brand + " : " + m.price + " : " + name);

    // }

}

public class StaticBlock {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 20000;
        Mobile.name = "Iphone 7";

        // Mobile m2 = new Mobile();

    }
}
