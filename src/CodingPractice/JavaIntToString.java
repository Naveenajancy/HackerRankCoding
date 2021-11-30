package CodingPractice;

import java.util.Scanner;

public class JavaIntToString {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = in.nextInt();
            String str = String.valueOf(number);
            if (number == Integer.parseInt(str))
                System.out.println("Good job");
            else
                System.out.println("Not equal");
        }
        catch (Exception e){
            System.out.println("Error: "+e.toString());
        }
    }
}
