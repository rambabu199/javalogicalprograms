
//6. Write a JAVAprogram to check whether a year is leap year or not.
import java.util.Scanner;

class LeapYear {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a year");
    int year = sc.nextInt();
    if (year % 4 == 0) {
      if (year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + " is a leap year");
      }

    } else {
      System.out.println(year + " is not a leap year");
    }
  }
}