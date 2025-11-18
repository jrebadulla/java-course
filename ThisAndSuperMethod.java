
class A {
    public A() {
        super();
        System.out.println("In A");
    }

    public A(int a) {
        super();
        System.out.println("In A Int");
    }
}

class B extends A {
    public B() {
        // Super method execute the constructor of a class
        super();
        System.out.println("In B");
    }

    public B(int a) {

        // This method - execute the same constructor in the same class
        this();
        System.out.println("In B Int");
    }
}

public class ThisAndSuperMethod {
    public static void main(String[] args) {

        B b = new B();

    }
}
