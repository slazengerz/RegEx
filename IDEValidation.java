package RegEx.RegEx3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDEValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuffer sbfr=new StringBuffer();
        String line;
        while(sc.hasNext()){
            //System.out.println(sc.next().length());
            sbfr.append(sc.nextLine().trim());
            sbfr.append("\n");
       }
        //System.out.println(sbfr);
        String regex="\\/\\/.*|(?s)\\/\\*.*?\\*\\/";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(sbfr);
        while(matcher.find()){
            System.out.println(sbfr.substring(matcher.start(),matcher.end()));
        }
    }

}
