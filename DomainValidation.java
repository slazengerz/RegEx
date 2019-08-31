import java.io.*;
import java.util.*;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class DomainValidation {

    public static void main(String[] args) {
        String regex="http[s]*:\\/\\/(www.|ww2.)*([\\w-]+\\..*?)(\\/|\\\"|\\?|_|\\s|\\'|\\\\)";
        Scanner sc=new Scanner(System.in);
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher;
        int nooflines=sc.nextInt();
        sc.nextLine();
        String[] input=new String[nooflines];
        for(int i=0;i<nooflines;i++){
            input[i]=sc.nextLine();
        }
        TreeSet<String> result=new TreeSet<String>();
        for(int i=0;i<nooflines;i++){
            matcher=pattern.matcher(input[i]);
            while(matcher.find()){
                //System.out.println(matcher.group(1));
                result.add(matcher.group(2));
                //System.out.println(result);
            }
        }
        String resultString=String.join(";", result);
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