package HackerRank_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {11, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        int target = getInput();
        int[] result = search(arr, target);
        displayResult(result);
    }

    // Get target from user
    private static int getInput() {
        try (Scanner sc = new Scanner(System.in)) {
            return sc.nextInt();
        }
    }

    // Search in 2D Array
    private static int[] search(int arr[][], int target) {
        int rows = 0;
        int cols = arr[0].length - 1;  // Number of columns in the first row
        while (rows < arr.length && cols >= 0) {
            if (arr[rows][cols] == target) {
                return new int[]{rows, cols};
            }
            if (arr[rows][cols] < target) {
                rows++;
            } else {
                cols--;
            }
        }
        return new int[]{-1, -1};
    }

    private static void displayResult(int[] result) {
        System.out.println(Arrays.toString(result));
    }
}
