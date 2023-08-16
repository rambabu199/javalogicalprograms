//25. Write a JAVAprogram to print multiplication table of any number.
import java.util.*;
class MultiplicationTable
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any number to print the multiplication table");
      int n=sc.nextInt();
      for(int i=1;i<=10;i++)
        {
          int t=i*n;
          System.out.println(n+"*"+i+"="+t);
        }
    }
  }