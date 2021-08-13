import java.util.Arrays;
import java.util.Scanner;
class InsertionSort {
  void insertionSort(int array[]) {
    int size = array.length;
    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;
      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }
      array[j + 1] = key;
    }
  }

  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.println("Enter size of array:");
    size=sc.nextInt();
    int[] data =new int[size];
    for(int i=0;i<size;i++)
    data[i]=sc.nextInt();
    InsertionSort is = new InsertionSort();
    is.insertionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}