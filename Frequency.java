//33. Write a JAVAprogram to find frequency of each digit in a given integer.
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int[] digitFrequency = new int[10];

        while (number != 0) {
            int digit = number % 10;
            digitFrequency[digit]++;
            number /= 10;
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i] > 0) {
                System.out.println(i + ": " + digitFrequency[i]);
            }
        }
    }
}
