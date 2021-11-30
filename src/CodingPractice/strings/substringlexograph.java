package CodingPractice.strings;


import java.util.ArrayList;
import java.util.Collections;

public class substringlexograph {
    public static void main(String[] args) {
      //  String str = "welcometojava";
        String str = "wanted";
       // String str = "ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
        int n = 2;
        substringlexograph.getSmallestAndLargest(str,n);
    }

    public static String getSmallestAndLargest(String str, int n) {
        String sequence = str.substring(0,n);
        String smallest = sequence;
        String largest = sequence;

        int length = str.length() - n;
        for (int i = 1; i <= length; i++) {
            sequence = str.substring(i, i+n);
            if(sequence.compareTo(smallest) < 0){
                smallest = sequence;
            }
            else if(sequence.compareTo(largest) > 0){
                largest= sequence;
            }
        }
        System.out.println("smallest: " + smallest + "\nlargest: " + largest);
        return smallest+"\n"+largest;

  }
}
