package CodingPractice.stdinout;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FingSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        System.out.println("message: " + message + "\n"+ message.substring(startIndex, endIndex));

//Scanner in = new Scanner(System.in);
//  System.out.print(in.next().substring(in.nextInt(),in.nextInt()));

    }
}
