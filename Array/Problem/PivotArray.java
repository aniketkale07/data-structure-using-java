 package Problem;
public class PivotArray{
    public static void main(String args[]){
        int[] arr={4,7,3,6,8,6};
        int pivot=findPivot(arr);
    if(pivot!=-1){
        displayResult(pivot);
    }else{
        System.out.println("Pivot is not Found");
    }
    }

    //Display the piivot
    private static void displayResult(int pivot){
    System.out.println("The pivot is element is at index : "+ pivot);
    }
    //FInd pivot with thsese method
private static int findPivot(int arr[]){
    int sum=0;
    for(int num:arr){
        sum+=num;
    }
    int leftsum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum-arr[i];
        if(sum==leftsum){
            return i;
        }
        leftsum+=arr[i];
    }
    return -1;
}

}

