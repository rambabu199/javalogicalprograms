//67. Write a JAVAprogram to count total number of words in a string.
import java.util.*;

class CountWords {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give data for   string");
    String str = sc.nextLine();
    String ch[]=str.split(" ");
    System.out.println("Total number of words in given String is: "+ch.length);  
    
  }
}