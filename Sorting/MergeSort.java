//Merge Sort is especially works on divide and conquer method on Array...
// First it is divide whole array and after it will conquer it in it proper order
//    TIME COMPLEXITY ---> o(nlogn)
//    SPACE COMPLXITY ---> o(n)
package Sorting;

import java.util.Arrays;

public class MergeSort {
    private static void divide(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);

    }

    private static void conquer(int arr[], int start, int mid, int end) {
        int merged[] = new int[end - start + 1];
        int mid1 = start; // Tracking the array which is starting from Start to Mid
        int mid2 = mid + 1; // Tracking the array which is starting from Mid+1 to End
        int x = 0; // Tracking the array of merged

        while (mid1 <= mid && mid2 <= end) {
            if (arr[mid1] <= arr[mid2]) {
                merged[x] = arr[mid1];
                x++; // Increment the merged array index
                mid1++; // Increment the second array increment
            } else {
                merged[x] = arr[mid2];
                x++;
                mid2++;
            }
        }
        // if First array remains element and second array sorted all element in it
        // Then the remainning element in First array it will be sorted as it
        while (mid1 <= mid) {
            merged[x] = arr[mid1];
            x++;
            mid1++;
        }
 
        // if Second array remains element and FIRST array sorted all element in it
        // Then the remainning element in Second array it will be sorted as it
        while (mid2 <= end) {
            merged[x] = arr[mid2];
            x++;
            mid2++;
        }

        // Copy the Element from merged to original arr
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 1, 6, 5, 76, 55, 87, 0, 9, 8, 7, 45, 34, 23, 12, 10 };
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
