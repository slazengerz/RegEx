package RegEx.RegEx3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLLink {
    public static void main(String[] args) {
        int numoflines;
        Scanner sc=new Scanner(System.in);
        numoflines=sc.nextInt();
        String[] input=new String[numoflines];
        sc.nextLine();
        for(int i=0;i<numoflines;i++){
            input[i]=sc.nextLine();
        }
        findLinks(input);
    }

    public static void findLinks(String[] s) {
        String regex = "(<a href=\")(.*)(\">)(.*)(</a>)";
        Pattern pattern = Pattern.compile(regex);
        for (String input : s) {
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                System.out.println(matcher.group(2)+" , "+matcher.group(4));
            }
        }
    }
}
