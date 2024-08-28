package Design_Patterns_LLD.behavioral_design_pattern.Interpreter_design_pattern.example1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//The Best example is regex in Java
public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","ABCD32"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9876543210"));

        String input = "The quick brown fox jumps over the lazy dog";
        Pattern pattern = Pattern.compile("q.*k"); // starts with q and ends with k
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        } else {
            System.out.println("Match not found");
        }
    }
}
