//38. Write a JAVAprogram to calculate factorial of a number.
import java.util.*;

class Factorial {
  public static void main(String agrs[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int n = sc.nextInt();
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * i;
    }
    System.out.println("the factorial of " + n + " is :" + result);
  }
}