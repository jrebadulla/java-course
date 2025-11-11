import java.util.Scanner;

class Operator {

    public double add(int n1, int n2) {
        double result = n1 + n2;
        return result;
    }

    public double multiply(int n1, int n2) {
        double result = n1 * n2;
        return result;
    }

    public double subtract(int n1, int n2) {
        double result = n1 - n2;
        return result;
    }

    public double divide(int n1, int n2) {
        double result = n1 / n2;
        if (n2 == 0)
            System.out.println("Cannot devide 0");
        return result;
    }

}

public class Demo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number");
        int num2 = input.nextInt();



        Operator opt = new Operator();
        double result = opt.add(num1, num2);
        System.out.println(result);

        input.close();
    }
}
