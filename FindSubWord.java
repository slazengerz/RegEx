package RegEx.RegEx3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSubWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String regex="";
        int nooflines=sc.nextInt();
        sc.nextLine();
        String[] lines=new String[nooflines];
        for(int i=0;i<nooflines;i++){
            lines[i]=sc.nextLine();
        }
        int noofwords=sc.nextInt();
        sc.nextLine();
        String[] words=new String[noofwords];
        int[] result=new int[noofwords];
        for(int i=0;i<noofwords;i++){
            words[i]=sc.next();
        }
        for(int i=0;i<noofwords;i++){
            regex="\\b"+words[i]+"\\b";
            //regex  =words[i];
            //System.out.println(regex);
            Pattern pattern=Pattern.compile(regex);
            for(int j=0;j<nooflines;j++){
                Matcher matcher=pattern.matcher(lines[j]);
                while(matcher.find()){
                    result[i]++;
                    //System.out.println(result[i]);
                }
            }
        }
        for(int i=0;i<noofwords;i++){
            System.out.println(result[i]);
        }

    }
}
