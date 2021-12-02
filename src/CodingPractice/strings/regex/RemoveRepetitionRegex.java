/*

Remove the duplication using the using regex pattern
\b match a word boundary.
[a-z]+ match a word with one or more character.
\s white space character.
\1 is a back reference to first (captured) group.
+ one or more character.

 */


package CodingPractice.strings.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveRepetitionRegex {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String sentence = "I love Love To to  code Code CODE";
        String sentence = "1 hello HelLo i am i am i i i i am a a a good person";
        String validator = "\\b([a-z]+)(\\s\\b\\1\\b)+";
        Pattern pattern = Pattern.compile(validator, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()){
            sentence = sentence.replaceAll(matcher.group(), matcher.group(1));
        }
        System.out.println("Correct Sentence: "+ sentence);
    }
}
