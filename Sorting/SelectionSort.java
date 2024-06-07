package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 1, 6, 5, 76, 55, 87, 0, 9, 8, 7, 45, 34, 23, 12, 10};
        selectionSort(arr);
    }

    /**
     * Selection sort method
     *
     * @param arr the array to be sorted
     */
    private static void selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            // Assume the current index has the smallest value
            int smallest = i;

            // Find the index of the smallest element in the unsorted part of the array
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            // Swap the smallest element with the first unsorted element
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        System.out.println("Array after Sorting using Selection Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
