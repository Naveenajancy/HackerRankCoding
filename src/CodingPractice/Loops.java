package CodingPractice;

/*Given an integer, N, print its first multiples 10.
Each multiple N X i(where 1 <= i <= 10 should be printed on a new line in the form: N x i = result.
*/

import java.util.*;

public class Loops {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int N = scan.nextInt();
                for (int i = 1; i <=10; i++) {
                    System.out.println(N +" x " + i +" = " + (N * i));
                }

            }
       }

