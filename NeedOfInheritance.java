
public class NeedOfInheritance {
    public static void main(String[] args) {

        AdvCalc calc = new AdvCalc();
        int r = calc.add(1, 10);
        int r1 = calc.sub(10, 5);
        int r2 = calc.multi(10, 5);
        int r3 = calc.divide(10, 5);

        System.out.println(r + " " + r1);
        System.out.println(r2 + " " + r3);

    }

}
