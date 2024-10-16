import java.util.Scanner;

public class Factorial {
    public static void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        System.out.print(number + "! = ");
        System.out.println(App.factorial(number));
    }
}
