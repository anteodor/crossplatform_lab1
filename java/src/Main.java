import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lab 01 - Task 1 (Variant 13)");
        System.out.print("Enter leg a: ");
        float a = scanner.nextFloat();

        System.out.print("Enter leg b: ");
        float b = scanner.nextFloat();

        // Обчислення гіпотенузи
        float c = (float) Math.sqrt(a * a + b * b);

        // Обчислення периметра
        float P = a + b + c;

        System.out.printf("Hypotenuse c = %.3f%n", c);
        System.out.printf("Perimeter P = %.3f%n", P);

        scanner.close();
    }
}