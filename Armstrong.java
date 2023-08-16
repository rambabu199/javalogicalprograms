//43. Write a JAVAprogram to check whether a number is Armstrong number or not.
import java.util.*;

class Armstrong {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    int t = n;
    int sum = 0;
    while (n > 0) {
      int d = n % 10;
      int arm = d * d * d;
      sum = sum + arm;
      n = n / 10;
    }
    if (t == sum) {
      System.out.println("the given number is armstrong number");
    } else
      System.out.println("the given number is not an armstrong number");

  }
}