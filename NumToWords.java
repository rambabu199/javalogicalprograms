//34. Write a JAVAprogram to enter a number and print it in words.
import java.util.*;
class NumToWords
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
      int n=sc.nextInt();
     // int t=n;
      int  r = 0, d;
    while (n != 0)
      {
        d = n % 10;
        r = (r * 10) + d;
        n = n / 10;
      }
      while(r>0)
        {
          int de=r%10;
          switch(de)
            {
              case 0:
                System.out.print("Zero");
                break;
              case 1:
                System.out.print("One");
                break;
              case 2:
                System.out.print("Two");
                break;
              case 3:
                System.out.print("Three");
                break;
              case 4:
                System.out.print("Four");
                break;
              case 5:
                System.out.print("Five");
                break;
              case 6:
                System.out.print("Six");
                break;
              case 7:
                System.out.print("Seven");
                break;
              case 8:
                System.out.print("Eight");
                break;
              case 9:
                System.out.print("Nine");
                break;
            }
          r=r/10;
        }
    }
  }