// Celling of Number :
// their is a target is present in Array => return 
//Otherwise the grestest smallest element than target present in ARRAY..

package Searching.Problems;

import java.util.Scanner;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 8, 9, 12, 13, 25, 23, 121};
        
        int target = getInput();
        
        int resultIndex = findCeiling(arr, target);
        
        if (resultIndex != -1) {
            System.out.println("Ceiling of " + target + " is: " + arr[resultIndex]);
        } else {
            System.out.println("No ceiling found for " + target);
        }
    }    

    // Get input for target
    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number:");
        return sc.nextInt();
    }

    // Find the ceiling number in the array
    private static int findCeiling(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int midIndex;

        while (start <= end) {
            midIndex = start + (end - start) / 2;

            if (arr[midIndex] == target) {
                return midIndex;
            }

            if (arr[midIndex] < target) {
                start = midIndex + 1;
            } else {
                end = midIndex - 1;
            }
        }

        // If target is greater than the largest element in the array
        if (start < arr.length) {
            return start;
        }

        return -1;
    }
}
