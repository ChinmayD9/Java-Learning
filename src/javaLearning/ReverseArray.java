package javaLearning;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int arr[] = new int[number];
        
        // Filling the array with user input
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Printing the original array
        System.out.println("Original array:");
        for (int i = 0; i < number; i++) {
            System.out.println(arr[i]); 
        }
        
        // Reversing the array in place
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        
        // Printing the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < number; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }

}
