/*    String myString = "Hello World!"
        The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
        Given two strings of lowercase English letters, A and B, perform the following operations:
        1.	Sum the lengths of  A and B
        2.	Determine if is A lexicographically larger than B
        3.	Capitalize the first letter in A and B and print them on a single line, separated by a space.
*/

package CodingPractice;

import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();

        int lengthSum = str1.length() + str2.length();
        System.out.println(lengthSum);

        int alphet = str1.compareTo(str2);
        if(alphet > 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        String firstLetter = str1.substring(0, 1);
        String restLetter = str1.substring(1, str1.length());
        firstLetter = firstLetter.toUpperCase();
        str1 = firstLetter+restLetter;
        String firstLetter1 = str2.substring(0, 1);
        String restLetter1 = str2.substring(1, str2.length());
        firstLetter1 = firstLetter1.toUpperCase();
        str2 = firstLetter1+restLetter1;
        System.out.println(str1+" "+str2);


/*
Scanner sc=new Scanner(System.in);
String A=sc.next();
String B=sc.next();
System.out.println(A.length()+B.length());
System.out.println(A.compareTo(B)>0?"Yes":"No");
System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())
+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length())
 */


    }
}

