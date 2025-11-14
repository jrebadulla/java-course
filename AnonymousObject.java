
class A {

    public A() {
        System.out.println("object Created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class AnonymousObject {

    public static void main(String[] args) {

        new A(); // Anonymous Object
         new A().show();; // calling method (but cant use again)


    }
}
