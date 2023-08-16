//5. Write a JAVAprogram to check whether a number is even or odd.
import java.util.Scanner;

class EvenOrOdd {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a value");
    int a = sc.nextInt();
    if (a % 2 == 0) {
      System.out.println("a is a even number");

    } else {
      System.out.println("a is a odd number");
    }
  }
}