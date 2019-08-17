package RegEx.RegEx3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchSpecificChars {
    public static void main(String[] args) {

        MatchSpecificChars matchSpecificChars=new MatchSpecificChars();
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        String regex="^[123]{1}[120]{1}[xs0]{1}[30Aa]{1}[xsu]{1}[\\.,]{1}\\b";
        matchSpecificChars.checker(regex,input);
    }

    public void checker(String regex,String input){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        System.out.println(matcher.find());

    }
}
