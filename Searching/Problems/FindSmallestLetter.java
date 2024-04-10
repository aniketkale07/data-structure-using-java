// Find the FindSmalestLetter gretter than the target 
// is it simlilear like the Ceiling Number Problem

// ------------------------------------------------------------------------

        // return  the start bcoz loop vulnarters
        // Before loop vulnartees --> Start----Mid-----End
        // After loop vulnartees --> End----Mid-----Start
        
package Searching.Problems;

import java.util.Scanner;

public class FindSmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'f', 'g', 'i', 'k', 'l', 'm', 'o', 'q', 'r', 's', 'u', 'x'};
        char target=getInput();
        char result=findCeilingChar(arr,target);
        displayResult(result);

    }
    private static char getInput(){
        Scanner sc=new Scanner(System.in);
        return sc.next().toLowerCase().charAt(0);
    }

    private static char findCeilingChar(char arr[],char target){
        int start=0;
        int end=arr.length-1;
        int mid=0;

        //Iterate over the Binary search on char array
        while(start<=end){
            mid=start+(end-start)/2;
            //check either the target element is available in array or not
            if(arr[mid]==target){
                if(arr[mid]==target){
                    return arr[mid];
                }
            }
            //if the target is lower than mid element then change the end to mid-1
            if(arr[mid]>target){
                end=mid-1;
            }
            //if the target is greater than mid element then change start to mid+1
            if(arr[mid]<target){
                start=mid+1;
            }
        }
        //if there is target element is not found at the array then 
        return arr[start];
    }

    private static void displayResult(char result){
        System.err.println("The Celling is : "+ result);
    }
}
