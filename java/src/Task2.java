import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lab 01 - Task 2 (Variant 13)");
        System.out.print("Enter a three-digit integer: ");
        int n = scanner.nextInt();

        int sign = (n < 0) ? -1 : 1;
        int x = Math.abs(n);

        int last = x % 10;
        int rest = x / 10;

        int result = (last * 100 + rest) * sign;

        System.out.println("Result: " + result);

        scanner.close();
    }
}