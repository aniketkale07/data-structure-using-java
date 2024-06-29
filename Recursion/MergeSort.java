package Recursion;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 1, 6, 5, 76, 55, 87, 0, 9, 8, 7, 45, 34, 23, 12, 10 };
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
       divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    private static void conquer(int[] arr, int start, int mid, int end) {
        int finalArray[] = new int[end - start + 1];
        int mid1 = start;
        int mid2 = mid + 1;
        int x = 0;

        while (mid1 <= mid && mid2 <= end) {
            if (arr[mid1] <= arr[mid2]) {
                finalArray[x++] = arr[mid1++];
            } else {
                finalArray[x++] = arr[mid2++];
            }
        }

        while (mid1 <= mid) {
            finalArray[x++] = arr[mid1++];
        }

        while (mid2 <= end) {
            finalArray[x++] = arr[mid2++];
        }

        for (int i = 0, j = start; i < finalArray.length; i++, j++) {
            arr[j] = finalArray[i];
        }
    }
}
