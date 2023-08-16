
//9. Write a JAVAprogram to input any character and check whether it is alphabet, digit or special character.
import java.util.*;

class AlphaOrNumOrSpecialChar {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a charector");
    char ch = sc.next().charAt(0);
    if (Character.isAlphabetic(ch)) {
      System.out.println(ch + " is a Alphabet");
    } else if (Character.isDigit(ch))
      System.out.println(ch + " is  a number");
    else
      System.out.println(ch + " is a special symbol");

  }
}