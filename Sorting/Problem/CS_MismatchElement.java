package Sorting.Problem;

// which originally contains all the numbers from 1 to N,
//  Unfortunately, due to some error. one of the numbers in s got Missed and other 
// is repeated , so find the tow numbers which are missing and repeated..



import java.util.ArrayList;
import java.util.Arrays;

public class CS_MismatchElement {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 4, 6, 7, 2 }; // Example array with numbers in the range 1 to 7
        System.out.println("\nOriginal Array : " + Arrays.toString(arr));
        int i = 0;
        while (i < arr.length) {
            int current = arr[i];
            if (arr[i] != arr[current - 1]) {
                swap(arr, i, current - 1);
            } else {
                i++;
            }
        }
        System.out.println("\nSorted array :" + Arrays.toString(arr));
        findMisMatch(arr);
    }

    static void findMisMatch(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                list.add(arr[i]);
                list.add(i + 1);

            }
        }
        System.out.println("MisMatch Element " + list.toString());
    }

    // Swapping elements in the array
    private static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
