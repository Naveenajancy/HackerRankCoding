import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = scanner.nextBigInteger();
        BigInteger secondNumber = scanner.nextBigInteger();
        //BigInteger total = (firstNumber + secondNumber)
        System.out.println(firstNumber.add(secondNumber));
        System.out.println(firstNumber.multiply(secondNumber));
    }
}
