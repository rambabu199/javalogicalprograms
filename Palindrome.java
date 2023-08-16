//29. Write a JAVAprogram to check whether a number is palindrome or not.
import java.util.Scanner;

class Method {

  void check(int n) {
    int t = n, r = 0, d;
    while (n != 0) {
      d = n % 10;
      r = (r * 10) + d;
      n = n / 10;

    }

    if (t == r) {
      System.out.println(t + " is a palindrome number");
    } else {
      System.out.println(t + " is not a palindrome number");
    }
  }
}

public class Palindrome {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n");
    n = sc.nextInt();
    Method m = new Method();
    m.check(n);

  }
}