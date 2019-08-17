package RegEx.RegEx3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PoC {
    public static void main(String[] args) {
        String ukPattern="splendour wealth oil recognition savoury endeavour oil cannot reality fish";
        System.out.println("US pattern->"+ukPattern.replaceAll("[u]",""));
        String regex="\\boil\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(ukPattern);
        int count=0;
        while(matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
