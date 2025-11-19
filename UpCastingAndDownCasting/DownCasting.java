package UpCastingAndDownCasting;

class A {
    public void show() {
        System.out.println("In A Show");
    }
}

class B extends A {

    public void show1() {
        System.out.println("In B Show");
    }
}

public class DownCasting {
    public static void main(String[] args) {
        A a = new B(); // UpCasting, Parent Object / Reference
        a.show();

        B b = (B) a; // DownCasting , down casting from a parent ref
        b.show1();

    }
}
