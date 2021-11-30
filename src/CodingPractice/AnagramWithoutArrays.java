package CodingPractice;

import java.util.Scanner;

public class AnagramWithoutArrays {
    static boolean isAnagram(String a, String b) {
        if( a == null || b == null || a.length() != b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] character = new int[26];
        for(char c : a.toCharArray()){
            character[c - 'a']++;
        }
        for(char c : b.toCharArray()){
            if(--character[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

    }

