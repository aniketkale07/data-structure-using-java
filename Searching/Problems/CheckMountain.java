
// Check the given array is mountain Array  or not and Search the target in tha array
// {1,2,3,4,5,6,4,3,2,1} ---> Target --> 3 --> Occur in twice --> return which have low index
package Searching.Problems;

import java.util.Scanner;

public class CheckMountain {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 4, 3, 2, 1 };
        int target = getInput();
        int peak = findPeak(arr); // it will get the peak of the element
        int end = arr.length - 1;
        int result = -1;

        // Check the left hand side of the peak
        if(target == arr[peak]){
            result = peak;
        } else {
            int leftSide = agnosticSearch(arr, target, 0, peak);
            if (leftSide == -1) {
                // Check the right side of the peak if element is not found
                int rightSide = agnosticSearch(arr, target, peak + 1, end);
                if (rightSide != -1) {
                    result = rightSide;
                }
            } else {
                result = leftSide;
            }
        }
        displayResult(result);
    }

    // Get Target From User
    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    // Find the peak of the Mountain
    private static int findPeak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    //Display the Result
    private static void displayResult(int result) {
        if(result==-1){
            System.out.println("Element is not Found...");
        }else{
            System.out.println("Element is found at the position : " + result);
        }
    }

    // Agnostic Searching
    private static int agnosticSearch(int arr[], int target, int start, int end) {

        // Check if it is in Ascending Order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // If the array is in ascending order
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
