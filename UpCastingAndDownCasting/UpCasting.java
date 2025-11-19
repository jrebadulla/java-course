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

public class UpCasting {
    public static void main(String[] args) {
        A a = (A) new B(); // UpCasting
        a.show();

    }
}
