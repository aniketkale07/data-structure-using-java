//Searching on the 2D Array . Find the element from the 2D Array

package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        int [][] arr={
            {2,3,4},
            {1,26,36,46,5},
            {21,22,23,24,25},
            {6,7,8,9,10}
        };
        int target=getInput();
        int result[]=searchElement(arr,target);
        displayResult(result);
    }

//Input method 
private static int getInput(){
    Scanner sc = new Scanner(System.in);
    return sc.nextInt();
}

//Search Elment in 2D Array 
private static int[] searchElement(int arr[][], int target){
    int[] result=new int[2];
    for(int row =0;row<arr.length;row++){
        for(int column=0;column<arr[row].length; column++){
            if(arr[row][column]==target){

                result[0]=row;
                result[1]=column;
                return result;
            }
        }
    }
    //if element is not found
    result[0]=-1;
    result[1]=-1;
    return result;
}

//Display the Result
private static void displayResult(int result[]){
    System.out.println("The Given target is found at position :"+ Arrays.toString(result));
}
}
