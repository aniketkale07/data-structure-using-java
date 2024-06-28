//  Their is the set (a,b,c) --> where subset are the a,b,c,ab,ac,bc  
// Are the subset of the (a,b,c) 
// Perfrom the operation with the Recurssion

package Recursion;

import java.util.ArrayList;

public class FindSubset {
    public static void main(String[] args) {
        String current = "abc";
        // findSubset(current, "");
    }

    
    // Finding subsset using Recusion using only string Operation 
    private static void findSubset(String current, String ans) {
        // Base condition: if the current string is empty, print the accumulated result
        if (current.isEmpty()) {
            System.out.println(ans);
            return;
        }

        // Take the first character of the current string
        char ch = current.charAt(0);

        // Recursive call including the character in the subset
        findSubset(current.substring(1), ans + ch);

        // Recursive call excluding the character from the subset
        findSubset(current.substring(1), ans);
    }
}
