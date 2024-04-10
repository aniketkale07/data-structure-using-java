package Searching.Problems;



import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
            List.of(1, 2, 3),
            List.of(4, 1, 6),
            List.of(71, 8, 9)
        );

        int difference = diagonalDifference(arr);
        System.out.println("The diagonal difference is: " + difference);
    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr.get(i).get(i); // main diagonal
            secondaryDiagonalSum += arr.get(i).get(n - 1 - i); // secondary diagonal
        }

        System.out.println(primaryDiagonalSum+secondaryDiagonalSum);
        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }
}


