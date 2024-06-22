package Sorting.Problem;

//This is the Problem of Cylic Sort
// Find the Missing Number in Cyclic Sort 
//Series start from 0 to N 
//arr --> 2,1,5,4,0     --> 3 is Missing --> the index number is equal to the arr[index]


import java.util.Arrays;

public class CS_MissingNumber {
    
    public static void main(String args[]){
        int arr[]={2,1,5,4,0};
        //where i is the index of the number
        int i=0;
        while(i<arr.length){
            int current=arr[i];
            if(arr[i]<arr.length && arr[i]!=i){
                // int temp =arr[i];
                // arr[i]=arr[current];
                // arr[current]=temp;

                //using swap method
                swap(arr, i, current);
            }else{
                i++;
            }

            }
        int index =findElement(arr);
        System.out.println(index);
        System.out.println(Arrays.toString(arr));
    }

    //its traverse overall the array
    private static int findElement(int[] arr) {
        // TODO Auto-generated method stub
        
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }


private static void swap(int arr[], int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
