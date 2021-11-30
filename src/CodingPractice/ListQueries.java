package CodingPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//List<Double> numbers = new ArrayList<Double>();
//while (scan.hasNextDouble()) {
//    numbers.add(scan.nextDouble());
//}

public class ListQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of elements");
        int numberOfElements = scanner.nextInt();
        List<Integer> numberList = new ArrayList<Integer>();
        for(int i =0; i< numberOfElements; i++){
        int number = scanner.nextInt();
        numberList.add(number);
        }
        System.out.println("numberList "+numberList);
        System.out.println("enter no of queries: ");
        int numberOfQueries = scanner.nextInt();
       // int count = 1;
        for(int i=0; i<numberOfQueries ; i++){
            System.out.println("enter query name Insert ? Delete");
            String queryName = scanner.next();
            if(queryName.equals("Insert")){
                System.out.println("enter index and value");
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                numberList.add(index, value);
            }
           // else if (queryName.equals("Delete")){
            else {
                System.out.println("Enter index value to be deleted");
                int deleteNumberAtIndex = scanner.nextInt();
                numberList.remove(deleteNumberAtIndex);
            }

            }
        System.out.println("Final List : "+numberList);
        for(Integer number : numberList){
            System.out.print(number+" ");
        }
    }
}
