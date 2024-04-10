package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={3,4,2,1,6,5,76,55,87,0,9,8,7,45,34,23,12,10};
        bubbleSort(arr);
    }
    private static void bubbleSort(int[] arr){
        int length=arr.length;
        

        for(int i=0;i<length;i++){
            for(int j=1;j<length-1-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        for(int num : arr){
            System.err.print(num+ ", ");
        }
    }
}
