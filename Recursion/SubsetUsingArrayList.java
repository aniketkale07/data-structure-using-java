package Recursion;
import java.util.ArrayList;

public class SubsetUsingArrayList {
    public static void main(String[] args) {
        
        String current="abc";
        ArrayList<String> list=subsetWithArrayList(current, new ArrayList<>());

    }

    @SuppressWarnings("unchecked")
    private static ArrayList<String> subsetWithArrayList(String current, ArrayList<String> arrayList) {
        
        if(current.isEmpty()){
        arrayList.add("");
        return arrayList;        
        }

        char ch=current.charAt(0);
    
        return subsetWithArrayList(current.substring(1), arrayList);
        
    }
    
}
