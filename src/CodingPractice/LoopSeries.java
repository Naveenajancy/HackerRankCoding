package CodingPractice;

import java.util.*;

/*
We use the integers ,a, b,n and  (a+2^0.b) to create the following series:
You are given q queries in the form of a,b,n For each query, print the series corresponding to the given
a,b,n and values as a single line of space-separated integers.
 */
public class LoopSeries {
    static void printSeries(int a, int b, int n){
        int result = 0;
        for(int i =0; i<n; i++){
            result = 0;
            for(int j=0; j<=i; j++){
                result += (Math.pow(2, j) * b);
            }
            result += a;
            System.out.print(result + " ");
        }
        System.out.print("\n");

    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a, b, n);
        }
        in.close();

    }

}
