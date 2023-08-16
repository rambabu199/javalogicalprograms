//40. Write a JAVAprogram to print all Prime numbers between 1 to n.

import java.util.*;

class ALLPrimes {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter range (a to b)to print prime numbers:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = a; i <= b; i++) {
      int count = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0)
          count = count + 1;
      }
      if (count == 2)
        System.out.println(i);
    }
  }
}