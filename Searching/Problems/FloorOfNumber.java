//BinarySearch Program 
//Find the Floor of the given target Number

package Searching.Problems;

import java.util.Scanner;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr={3,4,6,8,11,13,15,23,25,45,122,132};
        int target=getInput();
        int result=findfloor(arr,target);
        displayResult(result);
    }
//Get Target from the User
    private static int getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    //Display the result
    private static void displayResult(int result){
        System.out.println("The Floor is : "+ result);
    }

    //Get Floor of the target
    private static int findfloor(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;

        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println("The index of the given target is :"+mid);
                return arr[mid];
            }

            if(arr[mid]>target){
                end=mid-1;
            }
            
            if(arr[mid]<target){
                start=mid+1;
            }
        }
        return arr[end];
    }
}
