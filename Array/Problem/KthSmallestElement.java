package Problem;
// Find the Kth element in array 
// skip the duplicate Element 

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 2, 5, 655, 66, 55, 77, 87, 98, 665, 345, 234 };
        int k = getInput();

        //Check the K is out of bound or not 
        if(k>arr.length-1){
            throw new IllegalCallerException("K is out of bound", null);
        }
        int result = smallestElement(arr, k);
        displayResult(result, k);
    }

    // Get input from user
    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k:");
        return sc.nextInt();
    }

    // Display Result
    private static void displayResult(int result, int n) {
        System.out.println("The " + n + "th smallest element is: " + result);
    }

    // Main Logic to find k-th smallest element
    private static int smallestElement(int arr[], int k) {
        Arrays.sort(arr); // Sort the array
        System.out.println(Arrays.toString(arr)); // Print sorted array for verification
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (count == k) {
                return arr[i];
            }
        
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        
        }
        return -1;
    }
}
    