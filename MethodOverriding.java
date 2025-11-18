class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc extends Calc {
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        AdvCalc ac = new AdvCalc();
        int result = ac.add(5, 5);
        System.out.println(result);
    }

}
