package RegEx.RegEx3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

    //this method prompts user to input string
    //and returns the string
    private Pattern pattern;
    private Matcher matcher;

    public String getInput(){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        return input;
    }


    public int getNoOfLines(){
        int nooflines=0;
        Scanner sc=new Scanner(System.in);
        nooflines= sc.nextInt();
        sc.nextLine();
        return nooflines;
    }

    public String[] getListOfInput(int nooflines){
        Scanner sc=new Scanner(System.in);
        String[] input=new String[nooflines];
        for(int i=0;i<nooflines;i++){
            input[i]=sc.nextLine();
        }
        return input;
    }
    //this method returns true or false if the pattern is matched or not
    public boolean checker(String regex,String input){
        pattern=Pattern.compile(regex);
        matcher=pattern.matcher(input);
        return matcher.find();
    }

    //this  method returs matching expression at provided group no
    public String checkerRetEleAtGrp(String regex,String input,int grp){
        pattern=Pattern.compile(regex);
        matcher=pattern.matcher(input);
        if(matcher.find()) {
            return matcher.group(grp);
        }else{
            return "";
        }
    }
    //this method returns the count of occurences.
    public int checkerRetCount(String regex,String input){
        pattern=Pattern.compile(regex);
        matcher=pattern.matcher(input);
        int count=0;
        while(matcher.find()){
            count++;
        }
        return count;
    }
}
