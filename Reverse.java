//32. Write a JAVAprogram to enter a number and print its reverse.
import java.util.Scanner;

class Method {

  void check(int n) {
    int  r = 0, d,t=n;
    while (n != 0) {
      d = n % 10;
      r = (r * 10) + d;
      n = n / 10;

    }
      System.out.println( "reverse number of "+t+" is: "+r);
  }
}

public class Reverse {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n");
    n = sc.nextInt();
    Method m = new Method();
    m.check(n);

  }
}