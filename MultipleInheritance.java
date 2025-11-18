

public class MultipleInheritance {
    public static void main(String[] args) {

        VeryAdvCalc calc = new VeryAdvCalc();
        int r = calc.add(1, 10);
        int r1 = calc.sub(10, 5);
        int r2 = calc.multi(10, 5);
        int r3 = calc.divide(10, 5);
        double r4 = calc.power(10, 5);
        System.out.println(r + " " + r1);
        System.out.println(r2 + " " + r3);
        System.out.println(r4);

    }

}
