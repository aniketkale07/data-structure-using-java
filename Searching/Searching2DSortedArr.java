package Searching;

import java.util.Scanner;

public class Searching2DSortedArr {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // int target = getInput();
        int target = 8;
        int[] result = search(arr, target);
        displayResult(result);
    }

    // Get Input
    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    //
    private static int[] binarySearch(int arr[][], int target,int row, int cStart,int cEnd){
        while (cStart<=cEnd) {
            int mid = cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return new int[] {row , mid};
            }

            if(arr[row][mid]<target){
            cStart=mid+1;                
            }else{
                cEnd=mid-1;
            }
            
        }
        return new int[] {-1,-1};
    }
    private static int[] search(int [][] arr,int target){
    int row=arr.length;
    int cols=arr[0].length-1;
    // int cols=arr[row].length-1;

    
    if(row==1){     
        System.out.println(binarySearch(arr, target, row, 0, arr[row].length-1));
        }

int rStart=0;
int rEnd=row-1;
int cMid= cols/2;

        // Run the loop till 2 rows are remaining
        while (rStart<(rEnd-1)) {
            int mid=rStart+(rEnd-rStart)/2;
            if(arr[mid][cMid]==target){
                return new int[] {mid,cMid};
            }
            if(arr[mid][cMid]>target){
                rEnd=mid-1;
            }else{
                rStart=mid+1;
            }
        }
    return new int[] {-1,-1};
}
    private static void displayResult(int[] result) {
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Target found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Target not found.");
        }
    }
}
