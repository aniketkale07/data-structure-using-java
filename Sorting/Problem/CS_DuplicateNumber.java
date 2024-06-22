package Sorting.Problem;



import java.util.Arrays;

public class CS_DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4, 6, 7, 2}; // Example array with numbers in the range 1 to 7
               System.out.println("Original array: " + Arrays.toString(arr));

        int i = 0;
        while (i < arr.length) {
            int current = arr[i];
            // Ensure the current number is within the valid range and not already in its correct position
            if (current > 0 && current <= arr.length && arr[i] != arr[current - 1]) {
                swap(arr, i, current - 1); // Swap the elements
            } else {
                i++;
            }
        }
        System.out.println("Duplicate Number : "+ findDuplicate(arr));
    }

    static int findDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];
            }
        }
        return -1;
    }

    // Swapping elements in the array
    private static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
