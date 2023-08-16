//1.Write a JAVAprogram to find maximum between two numbers.
import java.util.*;
class Max2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a, b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a>b)
        System.out.println(a+" is big");
      else
        System.out.println(b+" is big");
    }
  }