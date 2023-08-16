//45. Write a JAVAprogram to check whether a number is Perfect number or not.
import java.util.*;

class Perfect {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int n = sc.nextInt();
    int t = n;
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0)
        sum = sum + i;

    }
    if (sum == t)
      System.out.println(t + "is an perfect number ");
    else
      System.out.print(t + "is not a perfect number ");

  }
}