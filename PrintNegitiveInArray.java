
//50. Write a JAVAprogram to print all negative elements in an array.
import java.util.*;

class PrintNegitiveInArray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int count = 0;
    System.out.println("the negitive elements in the given  array ");
    for (int i = 0; i < n; i++) {
      if (arr[i] < 0) {
        count++;
        System.out.println(arr[i]);
      }
    }
    if (count == 0) {
      System.out.println("there is no negitive numbers in the given array");
    }
  }
}