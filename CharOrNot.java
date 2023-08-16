
//7. Write a JAVAprogram to check whether a character is alphabet or not.
import java.util.Scanner;

class CharOrNot {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a charector");
    char ch = sc.next().charAt(0);
    if (Character.isAlphabetic(ch)) {
      System.out.println(ch + " is a Alphabet");
    } else
      System.out.println(ch + " is not a Alphabet");

  }
}