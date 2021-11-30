package CodingPractice.stdinout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerhasNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> nList = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
            int number = scanner.nextInt();
            nList.add(number);
        }
        System.out.println(nList);


        }
    }


