
package Sorting;
public class InsertionSort {
    public static void main(String[] args) {
       
            int arr[]={3,4,2,1,6,5,76,55,87,0,9,8,7,45,34,23,12,10};
           insertionSort(arr);
    }
    /**
     * @param arr
     */
    //Insertion sort method
    private static void insertionSort(int[] arr){
        int length=arr.length;
        int smallest=0;
        for(int i=0;i<length;i++){
            smallest=i;
            for(int j=i+1;j<length;j++){
               
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            System.out.println("\nArray after Sorting using Selection Sorting\n");
           int temp =arr[smallest];
           arr[smallest]=arr[i];
           arr[i]=temp;
        }

        //Print the valuee
        for(int num : arr){
            System.out.print(num+ " ");
        }
    }
}
