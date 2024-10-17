import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            Menu.display();
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    Factorial.display();
                    break;
                case 2:
                    Fibonacci.display();
                    break;
                case 3:
                    TwoProducts.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }

    public static int factorial(int number) {
        if (number == 1) {
            System.out.print(number + " = ");
            return 1;
        }

        System.out.print(number + " * ");
        return number * factorial(number - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int twoProducts(int v1, int v2) {
        if (v2 == 0) {
            return 0;
        }

        if (v2 == 1) {
            return v1;
        }

        return v1 + twoProducts(v1, v2 - 1);
    }

}
