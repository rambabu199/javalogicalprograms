//35. Write a JAVAprogram to print all ASCII character with their values.
public class Ascii {
  public static void main(String[] args) {
    System.out.println("ASCII Character\tASCII Value");

    for (int i = 0; i <= 127; i++) {
      System.out.println((char) i + "\t\t\t" + i);
    }
  }
}
