package RegEx.RegEx3;


import CommonUtilities.GetInputLinesWithParams;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankTweetSolution {

    public void checkHacerRankTweet() {
        int result = 0;
        String regex = "(?=hackerrank)\\w+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        String[] input = getInput();
        for (String s : input) {
            matcher = pattern.matcher(s);
            if (matcher.find()) {
                result++;
            }
        }
        System.out.println(result);

    }

    public int checkHacerRankTweetWithSingleVal(String val) {
        int result = 0;
        String regex = "(?=hackerrank)\\w+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        matcher = pattern.matcher(val);
        if (matcher.find()) {
            result++;
        }
        return result;
    }

    public static String[] getInput() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter no of Lines");
        int numLines = sc.nextInt();
        sc.nextLine();
        String[] retArray = new String[numLines];
        for (int i = 0; i < numLines; i++) {
            //System.out.println("Please enter line no :"+(i+1));
            retArray[i] = sc.nextLine();
        }
        return retArray;
    }

}
