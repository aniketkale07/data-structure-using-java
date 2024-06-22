package String;
import java.util.Arrays;

public class MethodOfString {
    public static void main(String args[]){
        String name ="Aniket Kale";
        
        //Make a Array of String 
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.err.println(name.indexOf('t'));    

        char arr[]=name.toCharArray();
int n=name.length();
        for(int i=0;i<n/2;i++){
            
            char temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
        }

        System.out.println(arr.toString());
    }
}
