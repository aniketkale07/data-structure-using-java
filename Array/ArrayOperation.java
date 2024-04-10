import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            // Declration of array 
            // int arr[];
            int[] arr = new int[5];

            arr[0]=34;
            arr[1]=11;
            arr[2]=121;
            arr[3]=111;
            arr[4]=434;

            // System.out.println("Length of an Array : "+arr.length);

            //Looping 
            // for(int num : arr){
            //     System.err.print(num+ " ");
            // }

// ------------------------------------------------------------
   // System.out.println();
   //     for(int i=0;i<arr.length;i++){
   //         System.out.print(arr[i] + " ");
   //     }

// -------------------------------------------------------------
   // System.out.println();    
   // int i=0;
   //     while(i<arr.length){
   //         System.out.print(arr[i] + ", ");
   //         i+=1;
   //     }
// -------------------------------------------------------------
            //To string method
            // System.out.println("\nUsing toString() :--> "+Arrays.toString(arr));

// ---------------------------------------------------------------
            // System.out.println(arr[5]);     //ArrayIndexOutOfBoundException

// ---------------------------------------------------------------

//Array of Object
            // String[] str=new String[4];

            // for(int j=0;j<str.length;j++){
            //     str[j]=sc.next();
            // }
            // System.out.println(Arrays.toString(str));

//--------------------- 2 D Array ---------------------------
//  2 D Array is the Array of Array it will be the Collection of the Array
//Declaration
//  int[][] array2D={
//             {4,5,6},    //0 th Index
//             {1,23,3},   // 1st index
//             {5,4}     //2nd index
//         };

// -------------------------------------------------------

            // for(int temp[] : array2D){
            //     System.out.println(Arrays.toString(temp));
            // }

// ---------------------------------------------------------

// using basic for loop 
            int newarr[][]=new int[3][3];

   // input
   for(int rows=0;rows<newarr.length;rows++){
            for(int cols=0;cols<newarr[rows].length;cols++){
                newarr[rows][cols]=sc.nextInt();
            }
   }

// ----------------------------------------------------
// Output
   for(int rows=0;rows<newarr.length;rows++){

            System.out.println(Arrays.toString(newarr[rows]));

            // -------------OR------------------------

            // for(int cols=0;cols<newarr[rows].length;cols++){
            //     System.out.print(newarr[rows][cols] + " ");
            // }
   }
        }

    
    }
}
