import java.util.Scanner;

public class Fibonacci {
    public static void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position of the Fibonacci sequence: ");
        int position = scanner.nextInt();

        System.out.print("Fibonacci(" + position + ") = ");
        System.out.println(App.fibonacci(position));
    }
}
