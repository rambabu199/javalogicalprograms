
//26. Write a JAVAprogram to count number of digits in a number.
import java.util.*;

class CountDigits {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    long n = sc.nextLong();
    int count = 0;
    while (n > 0) {
      count++;
      n = n / 10;
    }
    System.out.println("the number of digits in given number is: " + count);
  }
}