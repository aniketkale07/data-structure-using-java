package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,9,11,22,33,34,35,36,37,56,67,78,89};

        int target = getInput();
        
        //Without using the recursion
        // int result = binarySearch(arr,target);
        // displayResult(result);
    
        // using the recursion
        int result = using_recursion(arr, 0, arr.length-1, target);
        displayResult(result);
    }


    //Accept input from User for  Search
    private static int getInput() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    // Display the result
    private static void displayResult(int result) {
        if(result==-1){
            System.out.println("Element is not Found..");
        }else{
            System.out.println("Element is found at the index : "+ result);
        }
    }

    //Binary Search method using simple method
    private static int binarySearch(int[] arr, int target) {
            int start=0,mid,end=arr.length-1;

            while(start<=end){
                mid=start+(end-start)/2;

                if(arr[mid]==target){
                    return mid;
                }else if(arr[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            return -1;
    }
    
//-----------------------Using Recursion --------------------
private static int using_recursion(int arr[], int start,int end,int target){
    
    while (start<=end) {
        
    int mid=start+ (end-start)/2;
    if(arr[mid]==target){
        return mid;
    }

    if(arr[mid]>target){
        end=mid-1;
        using_recursion(arr,start,end,target);
    }
    if(arr[mid]<target){
        start=mid+1;
        using_recursion(arr, start, end, target);
    }
}

    return -1;

}}


