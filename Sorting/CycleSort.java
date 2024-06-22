// Performing Cycle Sort 
// Time Complexity = O(n)
//The Range between 1 and  N , apply Cycle sort

package Sorting;

import java.util.Arrays;


/**
 * CycleSort
 */
public class CycleSort {
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String args[]) {
        int arr[] = { 4, 5, 3, 1, 2, 6 };
        int i = 0;
        while (i < arr.length) {
            int correct=arr[i]-1;

            if(arr[correct]!=arr[i]){
                swap(arr ,correct,i);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

   
}