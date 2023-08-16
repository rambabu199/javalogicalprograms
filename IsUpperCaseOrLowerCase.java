
//10. Write a JAVAprogram to check whether a character is uppercase or lowercase alphabet.
import java.util.*;

class IsUpperCaseOrLowerCase {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a charector");
    char ch = sc.next().charAt(0);
    if (Character.isAlphabetic(ch)) {
      if (Character.isUpperCase(ch))
        System.out.println(ch + " is a Upper case letter");
      else
        System.out.println(ch + " is a Lower case  letter");

    } else
      System.out.println(ch + " is not a alphabet");

  }
}