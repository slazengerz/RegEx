package RegEx.RegEx3;

public class MatchSpecificCharsNegate {

    public static Utility utility=new Utility();

    public static void main(String[] args) {
        String input=utility.getInput();
        String regex="^\\D{1}[^aeiou]{1}[^bcDF]{1}[^\\s]{1}[^AEIOU]{1}[^\\.,]{1}$";
        //String regex="^\\D{1}[^aeiou]{1}";
        //String regex="[^aeiou]";
        //System.out.println("abc".replaceAll(regex,"x"));
        System.out.println(utility.checker(regex,input));

    }
}
