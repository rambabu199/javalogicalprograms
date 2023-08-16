//55. Write a JAVAprogram to copy all elements from an array to another array.
import java.util.*;

class CopyArray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int arr2[]=new int[n];
    for(int i=0;i<n;i++)
      {
        arr2[i]=arr[i];
      }
    System.out.println("orginal array elements");
    for(int i=0;i<n;i++)
      {
        System.out.print(","+arr[i]);
      }
    System.out.println("\n copied array elements");
    for(int i=0;i<n;i++)
      {
        System.out.print(","+arr2[i]);
      }
    
    
  }
}