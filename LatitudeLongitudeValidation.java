package RegEx.RegEx3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LatitudeLongitudeValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nooflines=sc.nextInt();
        List<String> input=new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<nooflines;i++){
            input.add(sc.nextLine());
        }
        String regex="^\\([+-]*((\\d|[0-8]\\d)(\\.\\d+)*|90|90\\.0+),\\s*[+-]*((\\d{0,2}|[1][0-7]\\d)(\\.\\d+)*|180|180.0+)\\)$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher;
        for(String s:input){
            matcher=pattern.matcher(s);
            if(matcher.matches()){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }

        }
    }
}
