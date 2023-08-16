//42. Write a JAVAprogram to find all prime factors of a number.
/*import java.util.*;

class PrimeFactors {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int n = sc.nextInt();
    System.out.println("the prime factors of given number is :");
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        for (int j = 1; j <= i; j++) {
          int count = 0;
          for (int k = 1; k <= j; k++) {
            if (i % k == 0)
              count = count + 1;
          }
          if (count == 2)
            System.out.println(i);
        }
      }

      // System.out.print(i + " ");
    }

  }*/
import java.util.*;

class PrimeFactors {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:");
    int n = sc.nextInt();
    System.out.println("The prime factors of the given number are:");

    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
        System.out.println(i);
        n /= i;
      }
    }
    
    sc.close();
  }
}

