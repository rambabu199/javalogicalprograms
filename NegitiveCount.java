
//54. Write a JAVAprogram to count total number of negative elements in an array.
import java.util.*;

class NegitiveCount {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] < 0) {
        count++;
      }
    }

    System.out.println("the count of negitive numbers in the given array is: " + count);

  }
}