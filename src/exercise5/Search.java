package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int number = input.nextInt();

        int numberIndex = -1;
        // Search for number in numbers
        for(int i = 0; i < numbers.length; i++){
            if(number == numbers[i]){
               
               numberIndex = i;
            }
        }
          System.out.println("Number index: " + numberIndex);
        }

        

        
    }


