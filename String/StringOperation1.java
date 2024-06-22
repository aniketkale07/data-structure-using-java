package String;

import java.util.ArrayList;

class StringOperation1 {

    @SuppressWarnings("removal")
    public static void main(String[] args) {

        // BOth String are indicate the same object
        String a = "Aniket";
        String b = "Aniket";
        // System.out.println(a==b);
        // if is it true then both a and b string object are indicate the single object
        // which is in string pool.. String pool is store the similear value at single
        // address
        // hence the storage is reduced.....

        // if we changed the a or b it will create the new instance of changed string .
        // /it will be no made any change in the same string

        String c = new String("Aniket kale");
        String d = new String("Aniket kale");

        // System.out.println(c==d );

        // Both c and d are the create new string that all the both are stord in
        // different locations
        // ==then both are not equal

        // --------------------Concatination of string --------------
        String cd = a + b;
        System.out.println(cd);

        System.out.println("Aniket" + new ArrayList<>());
        System.out.println("Aniket" + new Integer(4));

        // -------------------STRING BUILDER ----------------------
        // IT will be modify string without creating the new object of the string

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            // Using this it will take the 0(n^2) time
            // String pattern="";
            // pattern = pattern+ch;

            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}