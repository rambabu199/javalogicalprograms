//46. Write a JAVAprogram to print all Perfect numbers between 1 to n.
import java.util.*;

class Perfect2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter starting  number");
    int m = sc.nextInt();
    System.out.println("enter ending  number");
    int n = sc.nextInt();
    for (int j = m; j < n; j++) {
      int t = j;
      int sum = 0;
      for (int i = 1; i < j; i++) {
        if (j % i == 0)
          sum = sum + i;

      }
      if (sum == t)
        System.out.println(t + "is an perfect number ");
    }
  }
}