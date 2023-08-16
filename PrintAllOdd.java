//21. Write a JAVAprogram to print all odd number between 1 to 100.
class PrintAllOdd {
  public static void main(String args[]) {
    int n = 1;
    while (n <= 100) {
      if (n % 2 != 0)
        System.out.print(n + ",");
      n++;
    }
  }
}