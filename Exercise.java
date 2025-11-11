import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char again = 'y';
        do {

            System.out.print("Enter First Number: ");
            int firstNum = input.nextInt();

            System.out.print("Enter Second Number: ");
            int secondNum = input.nextInt();

            System.out.print("Choose operation (+, -, *, /): ");
            String operator = input.next();

            double result = 0;

            if (operator.equals("+")) {
                result = (firstNum + secondNum);
            } else if (operator.equals("*")) {
                result = (firstNum * secondNum);
            } else if (operator.equals("-")) {
                result = (firstNum - secondNum);
            } else if (operator.equals("/")) {
                result = (double) firstNum / secondNum;
                if (secondNum == 0) {
                    System.out.println("Cannot divide by zero.");
                }
            } else {
                System.out.println(" Thank you for using the calculator.");
            }

            if (secondNum != 0) {
                System.out.println("Result: " + result);
            }
            System.out.println("Do you want to calculate again? (y/n): ");
            again = input.next().charAt(0);

        }

        while (again == 'y');
        System.out.println(" Thank you for using the calculator.");
        input.close();

    }

}