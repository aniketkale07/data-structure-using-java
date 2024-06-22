package Sorting.Problem;



import java.util.ArrayList;
import java.util.Arrays;

public class CS_DuplicateAllNumber {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4, 6, 7, 2,4}; // Example array with numbers in the range 1 to 7
System.out.println("\nOriginal Array : " + Arrays.toString(arr));
        int i=0;
        while (i < arr.length) {
            int current = arr[i];
            // Ensure the current number is within the valid range and not already in its correct position
            if (current > 0 && current <= arr.length && arr[i] != arr[current - 1]) {
                swap(arr, i, current - 1); // Swap the elements
            } else {
                i++;
            }
        }
        findDuplicate(arr);
    }
    static void findDuplicate(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Sorted Array : " + Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }
        }
System.out.println("Duplicate element in the Array : "+list.toString());
    }
    private static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
