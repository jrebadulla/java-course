import java.util.Scanner;

public class Exercuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {

            System.out.print("Enter First Number: ");
            int firstNum = input.nextInt();

            System.out.print("Enter Second Number: ");
            int secondNum = input.nextInt();

            System.out.print("Choose operation (+, -, *, /): ");
            String operator = input.next();

            double result = 0;

            if (operator.equals("+")) {
                result = firstNum + secondNum;

            } else if (operator.equals("-")) {
                result = firstNum - secondNum;

            } else if (operator.equals("*")) {
                result = firstNum * secondNum;

            } else if (operator.equals("/")) {
                if (secondNum != 0)
                    result = (double) firstNum / secondNum;
                else
                    System.out.println("Cannot divide by zero.");

            } else {
                System.out.println("Thank you for using the calculator.");
            }
            System.out.println("Result: " + result);

            System.out.print("Do you want to calculate again? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        System.out.println("Thank you for using the calculator.");
        input.close();

    }
}
