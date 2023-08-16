//36. Write a JAVAprogram to find power of a number using for loop.
import java.util.*;

class Power {
  public static void main(String agrs[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter base and exponent");
    int n = sc.nextInt();
    int e = sc.nextInt();
    int result = 1;
    for (int i = 1; i <= e; i++) {
      result = result * n;
    }
    System.out.println(n + "to the power of " + e + " is :" + result);
  }
}