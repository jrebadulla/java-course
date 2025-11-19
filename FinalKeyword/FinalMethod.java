package FinalKeyword;

class Calc {
    public final void show() { // Final method, cannot override method
        System.out.println("In Calc Show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {

    public void show() { // Cannot override final method
        System.out.println("In AdvCalc Show");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(11, 11);
    }
}
