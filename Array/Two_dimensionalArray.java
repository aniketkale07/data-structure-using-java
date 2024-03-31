import java.util.Scanner;

public class Two_dimensionalArray {
    public static void main(String[] args) {
        int m = 0, n = 0;
        int arr[][];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an dimensional array : ");
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n][m];
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the 2 dimensional
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                System.out.println(arr[k][l]);
            }
        }
    }
}
