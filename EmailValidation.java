package RegEx.RegEx3;

import javax.rmi.CORBA.Util;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String regex="(\\b[\\w\\.]*@[\\w\\.]*\\w+)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher;
        int nooflines=getNoOfLines();
        String[] input=getListOfInput(nooflines);
        TreeSet<String> result=new TreeSet<String>();
        for(int i=0;i<nooflines;i++){
            matcher=pattern.matcher(input[i]);
            while(matcher.find()){
                System.out.println(matcher.group(1));
                result.add(matcher.group(1));
                //System.out.println(result);
            }
        }
        String resultString=String.join(";", result);
        System.out.println("==========");
        System.out.println(resultString);
    }
    public static int getNoOfLines(){
        int nooflines=0;
        Scanner sc=new Scanner(System.in);
        nooflines= sc.nextInt();
        sc.nextLine();
        return nooflines;
    }

    public static String[] getListOfInput(int nooflines){
        Scanner sc=new Scanner(System.in);
        String[] input=new String[nooflines];
        for(int i=0;i<nooflines;i++){
            input[i]=sc.nextLine();
        }
        return input;
    }
}
