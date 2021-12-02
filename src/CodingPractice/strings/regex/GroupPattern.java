/*Group numbers and letter into a list */

package CodingPractice.strings.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupPattern {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\w+");
        String sentence = "I want to run 2 miles for 365 days !";
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            try {
                numbers.add(Integer.parseInt(matcher.group()));
            } catch (NumberFormatException e) {
                words.add(matcher.group());

            }
        }
        //Collections.sort(words);
        System.out.println("Number Group "+ numbers);
        System.out.println("Words Group "+ words);
    }
}

