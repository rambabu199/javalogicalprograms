//39. Write a JAVAprogram to check whether a number is Prime number or not.
import java.util.*;

class Prime {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number:");
    int n = sc.nextInt();
    int count=0;
    for(int i=1;i<=n;i++)
      {
        if(n%i==0)
          count++;
      }
    if(count==2)
      System.out.println(n+" is a prime number");
    else
      System.out.println(n+" is not a prime number");
  }
}