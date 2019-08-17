package RegEx.RegEx3;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        //System.out.println("Please enter no of lines");
        int noOfLines=sc.nextInt();
        sc.nextLine();
        String[] storeLines=new String[noOfLines];
        for(int i=0;i<noOfLines;i++){
            //System.out.println("Please enter no line no:"+(i+1));
            storeLines[i]=sc.nextLine();
        }
        //System.out.println("Enter no of test cases");
        int noOfTCs=sc.nextInt();
        sc.nextLine();
        String[] strTCs=new String[noOfTCs];
        int[] result=new int[noOfTCs];
        for(int i=0;i<noOfTCs;i++){
            //System.out.println("Please enter tc no:-"+(i+1));
            strTCs[i]=sc.nextLine();
            String usPattern=strTCs[i].replaceAll("[o][u]","o");
            //check for UK pattern in below
            for(int j=0;j<storeLines.length;j++){
                //check for UK sting
                result[i]+=returnCount(storeLines[j],strTCs[i]);
                //System.out.println("Pattern "+strTCs[i]+" found "+result+" times");
                //check for US string
                result[i]+=returnCount(storeLines[j],usPattern);
                //System.out.println("Pattern "+usPattern+" found "+result+" times");
            }
        }

        //System.out.println("---RESULT-----");
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