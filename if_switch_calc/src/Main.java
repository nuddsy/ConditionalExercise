import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Input num1 (Int): ");
        String num1Str = scanner.nextLine();

        System.out.printf("Input num2 (Int): ");
        String num2Str = scanner.nextLine();

        try {
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            if (num1 > num2) {
                System.out.println("num1 is greater: " +num1);
            } else if (num1 < num2) {
                System.out.println("num2 is greater: " +num2);
            }
            else {
                System.out.println("They're the same");
            }

            System.out.printf("Please input num3 (Int): ");
            String num3Str = scanner.nextLine();
            int num3 = Integer.parseInt(num3Str);
            if (num3 % 2 == 0) {
                System.out.println("num3 is even: " + num3);
            } else {
                System.out.println("num3 is odd: " + num3);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid integer");
        }
    }
}