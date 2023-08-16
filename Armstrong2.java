//44. Write a JAVAprogram to print all Armstrong numbers between 1 to n.
import java.util.*;

class Armstrong2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    System.out.println("the armstrong numbers in given range:");
    for (int i = 1; i < n; i++) {
      int t = i;
      int d;// arm;
      int sum = 0;
      while (t != 0) {
        d = t % 10;
        // arm = d * d * d;
        sum = sum + (d * d * d);
        t = t / 10;
      }
      if (sum == i)
        System.out.println(i + "");
      /*
       * else
       * System.out.println("the given number is not an armstrong number");
       */
    }
  }
}