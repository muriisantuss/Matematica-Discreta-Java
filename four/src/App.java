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
}
