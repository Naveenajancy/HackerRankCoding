package CodingPractice.strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String string=sc.next();
        // using String Builder -> It represents the mutable sequence of characters

    System.out.println(string.equals(new StringBuilder(string).reverse().toString()) ? "Yes" : "No");

        /* Convert the string to char array and compare the reverse string
        char[] strArray = string.toCharArray();
        String reverseStr = "";
        int strLength = string.length() - 1;
        for(int i=strLength; i>=0; i--){
            reverseStr += strArray[i];
        }

        System.out.println(string.equals(reverseStr) ? "Yes" : "No");*/


         sc.close();


}

}
