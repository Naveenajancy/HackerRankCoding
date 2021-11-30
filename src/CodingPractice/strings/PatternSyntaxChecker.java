package CodingPractice.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        //try{
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            try{
                String pattern = in.nextLine();
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }catch(Exception e){
                break;
            }
        }
        testCases--;
        //}catch(Exception e){
        //}

    }
}

//    Pattern.compile
//    Compiles the given regular expression into a pattern.
//        Params:
//        regex – The expression to be compiled
//        Returns:
//        the given regular expression compiled into a/**/ pattern
//        Throws:
//        PatternSyntaxException – If the expression's syntax is invalid