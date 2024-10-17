import java.util.Scanner;

public class TwoProducts {
    public static void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int v1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int v2 = scanner.nextInt();

        System.out.println("The product of " + v1 + " and " + v2 + " is: ");
        System.out.println(App.twoProducts(v1, v2));
    }
}
