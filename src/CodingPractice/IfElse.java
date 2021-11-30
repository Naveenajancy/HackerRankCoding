package CodingPractice;

/*Given an integer, n, perform the following conditional actions:
 If n is odd, print Weird
If n is even and in the inclusive range of 2 to5 , print Not Weird
If n is even and in the inclusive range of 6 to 20 , print Weird
If n is even and greater than 20 , print Not Weird */

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number % 2 == 0 && number > 20)
            System.out.println("Not Weird");

        else if (number % 2 ==0 && number > 6 && number < 20)
            System.out.println("Weird");

        else if (number % 2 ==0 && number > 2 && number < 5)
            System.out.println("Not Weird");

        else if(number % 2 !=0)
            System.out.println("Weird");

        else
            System.out.println("Weird");
    }
}
