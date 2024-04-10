//Find the number whose addition of digit is even.  
package Searching.Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionOfDigit {
    public static void main(String[] args) {
        
        //static declration of array
        // int[] arr={12,232,440,3444,5654,6765,4542,222};

        //Dynamic Declaration of Array :
        int[] arr=getArrayInput();

        //Count the digit and check it is even or not, return even
        // ArrayList<Integer> result=new ArrayList<>();
        // result=additionOfDigit(arr);
        // displayResult(result);
        
        //find the sum of the number 
        ArrayList<Integer> result=sumOfNumber(arr);        
           displayResult(result);

    }

    private static int[] getArrayInput(){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the no of Element : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    private static ArrayList<Integer> additionOfDigit(int arr[]){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int num:arr){
            int count=digit(num);
            if(count % 2==0){
                result.add(num);
            }

        }
        return result;
    }
    //count the number of digit
    private static int digit(int num){
        int count=0;
        String str=num+ "";
        for(char ch: str.toCharArray()){
            count++;
        }
        return count;
    }
    //Display the ArrayList
private static void displayResult(ArrayList<Integer> result){
    result.toString();
    System.out.println("The Following series contain sum of digit is even  :"+result);
    // System.out.println("The Following series contain no  of digit is even  :"+result);

    // using looping statement 
    // for(int num: result){
    //     System.err.println(num);
    // }
}
private static ArrayList<Integer> sumOfNumber(int[] arr){
    ArrayList<Integer> result = new ArrayList<>();
  for(int num:arr){
    int sum=sumOfDigit(num);
    if(sum % 2==0){
        result.add(num);
    }
  }  
    return result;
    
}

//sum of digit
private static int sumOfDigit(int num){
    int sum=0;
    while(num>0){
        sum+=num%10;
        num/=10;
    }
    return sum;
}
}
