package Problem;
//Find the duplicate element in array using function 
// 1.Filter method in java 8
// using hasmap to stored the element in array as key and no of occurance as the value

import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 33, 4, 5, 4, 3, 4, 5, 6, 7, 8, 98, 7, 7, 8, 88, 77, 66, 66, 77};

        HashMap<Integer, Integer> result = findDuplicate(arr);
        displayResult(result);
    }

    //Display Method 
    // private static void displayResult(HashMap<Integer, Integer> result) {
    //     System.out.println("Following Numbers are Repeated more than one -->");
    //     System.out.println("Element\t\tRepetition");
    //     for (HashMap.Entry<Integer, Integer> entry : result.entrySet()) {
    //         if (entry.getValue() > 1) {
    //             System.out.println("|   "+entry.getKey() + "\t\t    " + entry.getValue()+"    |");
    //         }
    //     }

        //the following method is used  java 8 
        private static void displayResult(HashMap<Integer,Integer> result){
            System.out.println("Element\t\tRepetition");
            result.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()+"\t\t\t"+entry.getValue()));                                
        }
    
//Iterate over the arrray for the duplicate
    private static HashMap<Integer, Integer> findDuplicate(int arr[]) {
        // Create the HashMap to store the Element and the repetition of the element
        HashMap<Integer, Integer> duplicateArray = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            //check whether the key(arr[i]) is already present in the hasmap or not 
            // if it present then Increment the no of occurance by 1
            
            if (duplicateArray.containsKey(arr[i])) {
                duplicateArray.put(arr[i], duplicateArray.get(arr[i]) + 1); // Increment the count by 1
            } else {
            //otherwise add the element with occurance 1
                duplicateArray.put(arr[i], 1);
            }
        }
        return duplicateArray; 
    }
}

/*
 * ---------------OUTPUT-----------------
 * 
 */