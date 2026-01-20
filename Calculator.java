import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in))
        {
            int choice;
        double num1, num2;

        System.out.println("===== SIMPLE CALCULATOR =====");

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                switch (choice) {
                    case 1 -> System.out.println("Result = " + (num1 + num2));
                    case 2 -> System.out.println("Result = " + (num1 - num2));
                    case 3 -> System.out.println("Result = " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0) {
                            System.out.println("Result = " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                    }
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        System.out.println("Calculator closed. Thank you!");
        sc.close();
    }
    }
}
