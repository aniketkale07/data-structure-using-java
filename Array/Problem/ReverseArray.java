package Problem;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
       

        reverseArrayMethod(arr);
        System.out.println(Arrays.toString(arr));

    }

    //Reverse array function 
 static void reverseArrayMethod(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            swap(arr, i,arr.length-1-i);
        }
    }

//Swapping function
    static void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
