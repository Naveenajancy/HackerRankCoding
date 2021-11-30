package CodingPractice;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigIntegerIsProbablePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger b = scanner.nextBigInteger();
        //Arrays.sort();
        System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "Prime" : "not prime");
    }

}
