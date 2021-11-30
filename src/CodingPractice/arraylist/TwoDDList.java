package CodingPractice.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDDList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberofLines = scan.nextInt();
        List<List<Integer>> numberLists = new ArrayList<>();
        for (int row = 0; row < numberofLines; row++) {
            int elements = scan.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int column = 0; column < elements; column++) {
                list.add(scan.nextInt());
            }
            numberLists.add(list);
        }

        int numberOfQuries = scan.nextInt();
        for (int i = 0; i < numberOfQuries ; i++) {
            int rowIndex = scan.nextInt()-1;
            int columnIndex = scan.nextInt()-1;
            List<Integer> list = numberLists.get(rowIndex);
            try{
                System.out.println(list.get(columnIndex));
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}



