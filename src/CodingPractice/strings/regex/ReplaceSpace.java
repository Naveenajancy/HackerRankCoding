/*
How to replace 2 or more spaces with single space in string and delete leading spaces only.
String.replaceAll() replaces each substring that matches the given regular expression with the given replacement. "2 or more spaces" can be expressed by regular expression [ ]+
 */
package CodingPractice.strings.regex;

import java.util.Locale;

public class ReplaceSpace {
    public static void main(String[] args) {
        String line = "1   hello h  ow  are     you   ?";
        System.out.println(line.replaceAll("[\\s]+", " "));
    }
}
