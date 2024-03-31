public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 12, 23, 34, 45};
        int n = arr.length;

        // Print the original array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // Print a new line

        // Reverse the array without using anaother array
        // for (int i = 0; i < n / 2; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[n - 1 - i];
        //     arr[n - 1 - i] = temp;
        // }


      
        // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
