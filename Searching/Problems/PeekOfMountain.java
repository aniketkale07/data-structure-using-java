package Searching.Problems;

public class PeekOfMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 4, 3, 2, 1 };
        int result = findMountainPeek(arr);
        displayResult(result);
    }

    private static int findMountainPeek(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;

            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static void displayResult(int result) {
System.out.println("The Peek of Mountatin is : " + result);
    }
}
