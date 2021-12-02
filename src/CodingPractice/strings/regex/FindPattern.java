package CodingPractice.strings.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPattern {
    public static void main(String[] args) {

    List<String> patternList = new ArrayList<>();
//    Pattern pattern = Pattern.compile("(p[\\w]+)");
//    Pattern pattern = Pattern.compile("\\W");
    Pattern pattern = Pattern.compile("(pa[a-z]*)+");
    String paragraph = "A regular expression, specified as a string, must first be compiled into an instance of this class. !@" +
                       " The resulting pattern can then be used to create a Matcher object that can match arbitrary character sequences against the regular expression. " +
                       "All of the state involved in performing a match resides in the matcher, so many matchers can share the same pattern !!";
    Matcher matcher = pattern.matcher(paragraph);
    while(matcher.find()){
        patternList.add(matcher.group());
    }
        System.out.println("Pattern count: " + patternList.size());
        System.out.println(patternList);


    }
}