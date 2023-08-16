//3. Write a JAVAprogram to check whether a number is negative, positive or zero.
import java.util.*;
class NegitiveOrPositive
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
      int n=sc.nextInt();
      if(n<0)
        System.out.println(n+" is negitive number");
      else 
        System.out.println(n+" is positive number");
    }
  }