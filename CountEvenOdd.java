
//53. Write a JAVAprogram to count total number of even and odd elements in an array.
import java.util.*;

class CountEvenOdd {

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    int evencount = 0;
    int oddcount = 0;
    for (int i = 0; i < n; i++) {
      if (array[i] % 2 == 0)
        evencount++;
      else
        oddcount++;
    }
    System.out.println("the count of even numbers in array" + evencount);
    System.out.println("the count of odd numbers in array" + oddcount);
  }
}