
//18. Write a JAVAprogram to print all natural numbers in reverse (from n to 1). - using while loop
import java.util.*;

class PrintAllReverse {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    // int i=1;
    while (n > 0) {

      System.out.print(n + ",");
      // i=i+1;
      n--;
    }
  }
}