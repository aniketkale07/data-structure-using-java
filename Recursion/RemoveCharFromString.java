// Que . Remove the char from given string and return remaining String Using Recursion.
// Current String : bccdd  ..== remove: c --> Ans : bdd

package Recursion;

/**
 * RemoveCharFromString
 */
public class RemoveCharFromString {

    public static void main(String[] args) {
        StringBuilder ans=new StringBuilder();
        String current="aniketkale";
        removeChar(current,ans);
    }

    private static void removeChar(String current, StringBuilder ans) {
     if(current.isEmpty()){
        System.out.println("\nString After Removing the element : "+ans);
        return;
     
     }
        char ch=current.charAt(0);
       
        if(ch=='k'){
            removeChar(current.substring(1), ans);
        }else{
            removeChar(current.substring(1), ans.append(ch));
        }


    }
}