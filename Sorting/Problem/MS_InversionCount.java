package Sorting.Problem;

import java.util.Arrays;

public class MS_InversionCount {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 1, 6, 5, 76, 55, 87, 0, 9, 8, 7, 45, 34, 23, 12, 10 };
        int inversionCount = divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of inversions: " + inversionCount);
    }

    private static int divide(int arr[], int start, int end) {
        if (start >= end) {
            return 0;
        }

        int mid = start + (end - start) / 2;
        int leftCount = divide(arr, start, mid);
        int rightCount = divide(arr, mid + 1, end);
        int mergeCount = conquer(arr, start, mid, end);

        return leftCount + rightCount + mergeCount;
    }

    private static int conquer(int arr[], int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int index = 0;
        int inversionCount = 0;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                merged[index++] = arr[left++];
            } else {
                merged[index++] = arr[right++];
                // All remaining elements in the left half form an inversion with arr[right]
                inversionCount += (mid - left + 1);
            }
        }

        // Copy remaining elements of left half, if any
        while (left <= mid) {
            merged[index++] = arr[left++];
        }

        // Copy remaining elements of right half, if any
        while (right <= end) {
            merged[index++] = arr[right++];
        }

        // Copy merged elements back to original array
        for (int i = 0; i < merged.length; i++) {
            arr[start + i] = merged[i];
        }

        return inversionCount;
    }
}
