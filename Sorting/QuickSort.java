// It is the Quick sorting algorith on the basic of Divide and Conquer algorithm that pics
// the any random or starting , ending or any random element as the pivot in the array
// ---> First it will divide all small element in array to the left side
//----> Second stage it will seprate big element than pivot to the right side of the array
//--------------------TIME COMPLEXITY -----------------------------------
// WORST CASE : o(n^2)    -----> Occurs when the array is sorted in ASC OR DESC 
// AVERAGE CASE : o(Nlog N )
// SPACE COMPLEXITY : o(1)

package Sorting;

import java.util.Arrays;

public class QuickSort {
    private static void divide(int arr[], int start, int end) {
        if(start>end){
            return;
        }

        if(start<end){
            int  pivotIndex=partition(arr, start, end);
            
            divide(arr, start,  pivotIndex-1);
            divide(arr,  pivotIndex+1, end);

        }
    }

    private static int partition(int arr[], int start , int end){
        int pivot=arr[end];
        int i=-1;

        for(int j=0;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 2, 1, 6, 5, 76, 55, 87, 0, 9, 8, 7, 45, 34, 23, 12, 10 };
        System.out.println("\nArray Before the Sorting : "+Arrays.toString(arr));
        divide(arr, 0, arr.length-1);

        //Print the array After sorting
        System.out.println("\nArray After the Sorting : "+Arrays.toString(arr));
    }
}
