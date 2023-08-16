
//31. Write a JAVAprogram to calculate product of digits of a number.
import java.util.*;

class Demo {
  void digit(int n) {
    int product = 1, d;

    while (n > 0) {
      d = n % 10;
      product = product * d;
      n = n / 10;
    }
    System.out.println("the product  of digits in the given number is :" + product);
  }

}

class ProductOfDigits {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Demo d = new Demo();
    System.out.println("enter a number");
    int n = sc.nextInt();
    d.digit(n);
  }
}