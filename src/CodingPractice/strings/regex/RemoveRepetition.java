package CodingPractice.strings.regex;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class RemoveRepetition {
    public static void main(String[] args) {
        String sentence = "I love Love to To code Code";
//        String sentence = "1 hello HelLo i am i am i i i i am a a a good person";
        List<String> wordsSet = new ArrayList<>();
        String[] split = sentence.split("\\s");
        for (String element : split) {
            if(checkIfExist(wordsSet, element)){
                wordsSet.add(element);
            }
        }
        System.out.println("Final result: "+ String.join(" ", wordsSet));

    }

    private static boolean checkIfExist(List<String> word, String element) {
        boolean result = true;
        for(String each : word) {
            if (each.equalsIgnoreCase(element)) {
                result = false;
            }
        }
        return result;


    }
}
