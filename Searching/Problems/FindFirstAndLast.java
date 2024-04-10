//FInd the First and Last Occurance of the element in array 
// int[] arr = {1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9, 12};
// target ---> 4
// Result ----> [3, 7]
package Searching.Problems;

import java.util.Scanner;

import stack.repetStack;

public class FindFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9, 12};
        boolean isFirst;  // Change Boolean to boolean
        int target = getInput();
        int[] result = {-1, -1};
         result[0]=findFirstAndLast(arr, target, true);  // Correct the method name
         result[1]=findFirstAndLast(arr, target, false);  // Correct the method name

        //  Display the Result
        displayResult(result);
    }
    //Get the input from the user for target
    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    // Search the First And Last  Occurance of the 
    private static int findFirstAndLast(int arr[], int target, boolean isFirst) {
        int start = 0;
        int end = arr.length;
    int mid=0;
        while (start <= end) {
             mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                //Chek the starting side of th arr for checkig the 
                // their is a occurance of the target is found
                if (isFirst) {
                    // result[0] = mid;  // Update first occurrence
                    end = mid - 1;  // Continue searching on the left side
                    
                    //it will check for the last the occurance of the target
                    //it will excute only for the last occurance in right side at the
                    //end side
                } else {
                    // result[1] = mid;  // Update last occurrence
                    start = mid + 1;  // Continue searching on the right side
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    
        return mid;
    }
    
    // Display the result
    private static void displayResult(int[] result) {
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}

