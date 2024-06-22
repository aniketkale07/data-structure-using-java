package Sorting.Problem;



import java.util.ArrayList;
import java.util.Arrays;

public class CS_MissingAllNumber {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4, 6, 7, 2,2}; // Example array with numbers in the range 1 to 7
        System.out.println("Original array: " + Arrays.toString(arr));
        int i = 0;

        // Correct placement of elements in the array
        while (i < arr.length) {
            int current = arr[i];
            // Ensure the current number is within the valid range and not already in its correct position
            if (current > 0 && current <= arr.length && arr[i] != arr[current - 1]) {
                swap(arr, i, current - 1); // Swap the elements
            } else {
                i++;
            }
        }
        System.out.println("Reordered array: " + Arrays.toString(arr));
        findMissing(arr); // Find and print missing numbers
    }

    // Finding the missing numbers in the array
    static void findMissing(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) { // If the current position doesn't have the correct number
                list.add(i + 1);  // Add the missing number to the list
            }
        }
        System.out.println("Missing numbers: " + list.toString());
    }

    // Swapping elements in the array
    private static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
