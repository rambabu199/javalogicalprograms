//17. Write a JAVAprogram to print all natural numbers from 1 to n. - using while loop
import java.util.*;
class PrintAllNumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=sc.nextInt();
      int i=1;
      while(n>0)
        {
          
          System.out.print(i+",");
          i=i+1;
          n--;
        }
    }
  }