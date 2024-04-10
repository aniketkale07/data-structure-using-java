package HackerRank_Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionOfDigit {
    public static void main(String[] args) {
        
        // Dynamic Declaration of Array :
        int[] arr = getArrayInput();

        // Find the numbers where the sum of the digits is even 
        ArrayList<Integer> result = sumOfNumber(arr);        
        displayResult(result);
    }

    // Method to get input array from user
    private static int[] getArrayInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Enter the number of elements: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            return arr;
        }
    }

    // Method to find numbers where the sum of the digits is even
    private static ArrayList<Integer> sumOfNumber(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : arr) {
            int sum = sumOfDigit(num);
            if(sum % 2 == 0) {
                result.add(num);
            }
        }  
        return result;  
    }

    // Method to calculate sum of digits
    private static int sumOfDigit(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Method to display the result
    private static void displayResult(ArrayList<Integer> result) {
        System.out.println("The following numbers have a sum of digits that is even: " + result);
    }
}
