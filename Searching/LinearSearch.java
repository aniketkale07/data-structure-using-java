package Searching;

import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 12, 23, 34, 45, 56, 67, 76, 54, 78, 87, 99 };

        int target = getInput();
        int result = linearSearch(arr, target);
        displayResult(result);
    }

    // Method to get the target value from the user
    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        return sc.nextInt();
    }

    // Method to perform linear search and return the index of the target value
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Method to display the search result
    private static void displayResult(int result) {
        if (result == -1) {
            System.out.println("Element is not found.");
        } else {
            System.out.println("Element is found at index: " + result);
        }
    }
}
