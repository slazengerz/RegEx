package RegEx.RegEx3;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        String[] storeLines={
                "splendour wealth piece recognition savoury endeavour oil cannot reality fish",
                "sincere savor argument vigour chain awake cap surprising savoury jump",
                "natural study process immoral flag vigour habit assist candy pet",
                "shoulder aside slightly onto crash later disagreement savour rumour entrance",
                "splendour petrol unable inevitably crowd growth fasten leading responsibility artificially",
                "equally alarmed also knowledge ok splendor armory pick sale be",
                "activity rumour ending alcoholic savory curve splendour honestly enjoyable rumour",
                "determined used rumor union affair odor granddaughter elect endeavor alter",
                "savor hour enjoyable waiter divorce at mental prepared folding primary",
                "cheaply vegetable upon splendor disease savor it cast hear cardboardg"
        };

        System.out.println("Enter no of test cases");

       String[] strTCs={"endeavour","savoury","savour","vigour",
                        "valour","splendour","rumour","odour",
                        "armoury"};

        //String[] strTCs={"humour"};

        int[] result=new int[strTCs.length];
        for(int i=0;i<strTCs.length;i++){
            String usPattern=strTCs[i].replaceAll("[o][u]","o");
            //check for UK pattern in below
            for(int j=0;j<storeLines.length;j++){
                //check for UK sting
                int ukResult=returnCount(storeLines[j],strTCs[i]);
                System.out.println("ukpattern to find:->"+strTCs[i]);
                System.out.println("UK pattern result:->"+ukResult);
                //check for US string

                int usResult=returnCount(storeLines[j],usPattern);
                System.out.println("uspattern to find:->"+usPattern);
                System.out.println("US pattern result:->"+usResult);
                result[i]+=usResult+ukResult;
                //System.out.println("Pattern "+usPattern+" found "+result+" times");
            }
        }
        System.out.println("***RESULT IS***");
        for(int i:result){
            System.out.println(i);
        }

    }
    //this method returns the count of pattern in the input sting.
    public static int returnCount(String input,String regEx){
        int count=0;
        regEx="\\b"+regEx+"\\b";
        Pattern pattern=Pattern.compile(regEx,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(input);
        while(matcher.find()){
            count=count+1;
        }
        return count;
    }
}