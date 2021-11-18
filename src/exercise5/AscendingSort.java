package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter size: ");
    int size = input.nextInt();

    int array[] = new int[size];
    int template;
    System.out.println("Enter numbers: ");

    for (int i = 0; i < size; i++) {
      array[i] = input.nextInt();
    }

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - 1; j++) {
        if (array[j] > array[j + 1]) {
          template = array[j];
          array[j] = array[j + 1];
          array[j + 1] = template;
        }
      }
    }

    // Sort numbers in ascending order

    String arrayAsString = Arrays.toString(array);
    System.out.println("Sorted numbers: " + arrayAsString);
  }
}
