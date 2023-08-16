//37. Write a JAVAprogram to find all factors of a number.
import java.util.*;

class Factors {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int n = sc.nextInt();
    System.out.println("the factors of given number is :");
    for (int i = 1; i < n; i++) {
      if (n % i == 0)
        System.out.print(i + " ");
    }

  }
}