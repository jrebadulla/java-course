package FinalKeyword;

final class Calc { // Final class, No one can extends
    public void show() {
        System.out.println("In Calc Show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc { // Cannot inherit final class
}

public class FinalClass {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(11, 11);
    }
}
