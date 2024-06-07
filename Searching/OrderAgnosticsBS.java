// If their is a sorted array given BUT ----> 
//  u have a no idea about is sorting type is ASC or DESC
//At that time OrderAgnostics Will help 
// to find the target
//it will first compare first and last digit if 1st is smaller than last ascending order 
// nor Descending order 
package Searching;

import java.util.Scanner;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,18,29};
int[] descArr={9,8,7,6,5,4,32,1,0};
        int target=getInput();
        int result=agnosticsSearch(descArr,target);
        displayResult(result);
    }
    //get value of target from user
    private static int getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Target: ------>");
        return sc.nextInt();
    }

    //Perform  Binary Search Operation
    private static int agnosticsSearch(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        
        //Check is it in Ascending Order
        boolean isAsc=arr[0]<arr[end];
        if(isAsc){
            System.out.println("IS it in Ascending Order");
        }else{
            System.out.println("IS it in Descending order ");
        }

        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            //if the array is in ascending Order
            if(isAsc){
                if(arr[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }//if it in DESCENDING ORDER
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

            //Display the Result
    private static void displayResult(int result){
        if(result==-1){
            System.out.println("The Given in Element is not present an Array  ");
        }else{
            System.out.println("The Given Target is Found at index : "+ result);
        }
    }
}
