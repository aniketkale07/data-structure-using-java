//Binarty Search Using Recursion...

package Recursion;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,4,6,9,11,22,33,44,45,56,67,78,89,122};
        int start=0;
        int end=arr.length-1;
        int target=2;
       int result= binarySearchR(arr,start,end,target);
       if(result==-1){
        System.out.println("\nElement is Not Found ..");
       }else{
        System.out.println("\nElement is Found at the index :" + result);
       }
    }

    private static int binarySearchR(int[] arr, int start, int end, int target) {
        // TODO Auto-generated method stub
        //Base Condition 

        while (start<=end) {
            
        
        int mid=start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(arr[mid]>target){
            end=mid-1;
            binarySearchR(arr, start,end, target);
        }else{
            start=mid+1;
            binarySearchR(arr,start, end, target);
        }}
        return -1;
    
    }
}
