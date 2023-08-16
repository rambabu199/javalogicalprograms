
//49. Write a JAVAprogram to print Fibonacci series up to n terms
import java.util.*;

class Fibonacci {
  public static void main(String args[]) {
    int a = 0, b = 1, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    System.out.print(a + " ");
    System.out.print(b + " ");
    for (int i = 1; i <= n-2; i++) {
      c = a + b;
      a = b;
      b = c;
      System.out.print(c + " ");
    }
  }
}