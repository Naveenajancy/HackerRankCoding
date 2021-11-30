package CodingPractice.strings;

import java.util.Scanner;

class UserNameValidator{
    public static final String regularExpression = "(^[a-zA-Z][a-zA-Z0-9_]{7,29})";
}

public class ValidUserNameRegularExpression {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UserNameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
