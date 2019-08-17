package RegEx.RegEx3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String IPv4Regex="^([0|1](\\d{0,2})|[2][0-5]{0,1}\\d{0,1}|\\d{0,2})\\.([0|1](\\d{0,2})|[2][0-5]{0,1}\\d{0,1}|\\d{0,2})\\.([0|1](\\d{0,2})|[2][0-5]{0,1}\\d{0,1}|\\d{0,2})\\.([0|1](\\d{0,2})|[2][0-5]{0,1}\\d{0,1}|\\d{0,2})";
        String IPv6Regex="[a-f0-9]{0,4}:[a-f0-9]{0,4}:[a-f0-9]{0,4}:[a-f0-9]{0,4}[a-f0-9]{0,4}:[a-f0-9]{0,4}:[a-f0-9]{0,4}:[a-f0-9]{0,4}:[a-f0-9]{0,4}";
        int nooflines=sc.nextInt();
        sc.nextLine();
        String[] input=new String[nooflines];
        for(int i=0;i<nooflines;i++){
            input[i]=sc.nextLine();
        }
        Pattern pattern4= Pattern.compile(IPv4Regex);
        Pattern pattern6= Pattern.compile(IPv6Regex);
        Matcher matcher;

        for(int i=0;i<nooflines;i++){
             matcher=pattern4.matcher(input[i]);
            if(matcher.matches()){
                System.out.println("IPv4");
            }else{
                matcher.reset();
                matcher=pattern6.matcher((input[i]));
                if(matcher.matches()){
                    System.out.println("IPv6");
                }else{
                    System.out.println("Neither");
                }
            }
        }
    }
}
