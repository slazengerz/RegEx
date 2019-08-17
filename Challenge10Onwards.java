package RegEx.RegEx3;

import org.junit.Test;

public class Challenge10Onwards {

    public static Utility utility=new Utility();

    public static void main(String[] args) {
        //below is generic code to use in all  challenges
        //below code gets input from STDIN

        String input=utility.getInput();

        Challenge10Onwards challenge10=new Challenge10Onwards();
        //challenge10.MatchingCharRanges(input);
        //challenge10.MatchingXRepetitions(input);
        //challenge10.MatchingXYRepetitions(input);
        //challenge10.MatchingWordBoundries(input);
        //challenge10.MatchingSametextAgainAndAgain(input);
        //challenge10.BackRefToFailedGrp(input);
        //challenge10.ForwardReferences(input);
        //System.out.println(challenge10.negativeLookBehind("helo"));
        challenge10.detectHTMLLinks("");
    }


    /*
        The string's length is 5
        The first character must be a lowercase English alphabetic character.
        The second character must be a positive digit. Note that we consider zero to be neither positive nor negative.
        The third character must not be a lowercase English alphabetic character.
        The fourth character must not be an uppercase English alphabetic character.
        The fifth character must be an uppercase English alphabetic character.
     */
    public boolean MatchingCharRanges(String input){
        //String[] inputArray={"h4CkR","H4ckr","hackrr","h4ckr","h4C1r","h4Ckr"};
        String regex="^[a-z]{1}[1-9]{1}[^a-z]{1}[^A-Z]{1}[A-Z]{1}";
        return utility.checker(regex,input);
    }
    /*
        Your task is to write a regex that will match  using the following conditions:
        must be of length equal to 45.
        The first 40 characters should consist of letters(both lowercase and uppercase),
        or of even digits.
        The last 5 characters should consist of odd digits or whitespace characters.
     */
    public boolean MatchingXRepetitions(String input){
        String regex="^[aA-zZ02468]{40}[13579\\s]{5}$";
        return utility.checker(regex,input);
    }
    /*
        You have a test string .
        Your task is to write a regex that will match  using the following conditions:
        should begin with 1 or 2 digits.
        After that, S should have 3 or more letters (both lowercase and uppercase).
        Then S should end with up to 3 . symbol(s). You can end with  to  . symbol(s), inclusively.
     */
    public boolean MatchingXYRepetitions(String input){
        String regex="^[0-9]{1,2}[aA-zZ]{3,}[\\.]{0,3}$";
        return utility.checker(regex,input);
    }

    /*
        should begin with 1 or more digits.
        After that,  should have 1 or more uppercase letters.
        should end with 1 or more lowercase letters.
     */
    public boolean MatchingOneOrMoreRepetitions(String input){
        String regex="^[0-9]+[A-Z]+[a-z]+$";
        return utility.checker(regex,input);
    }
    /*
    should consist of only lowercase and uppercase letters (no numbers or symbols)
    should end in s
     */
    public boolean MatchingEndingItems(String input){
        String regex="^[aA-zZ]*s$";
        return utility.checker(regex,input);
    }
    /*
    Your task is to write a regex which will match word starting
    with vowel (a,e,i,o, u, A, E, I , O or U).
    The matched word can be of any length. The matched word should
     consist of letters (lowercase and uppercase both) only.
    The matched word must start and end with a word boundary.
     */
    public boolean MatchingWordBoundries(String input){
        //input="Found any match?";
        String regex="\\b[aeiouAEIOU][aA-zZ]{0,}\\b";
        //System.out.println(utility.checker(regex,input));
        return utility.checker(regex,input);
    }
    //should have 3 or more consecutive repetitions of ok.
    public boolean CapturingAndNonCapturingGroups(String input){
        String regex=".*(ok){3,}.*";
        //System.out.println(utility.checker(regex,input));
        return utility.checker(regex,input);
    }
    /*
        must start with Mr., Mrs., Ms., Dr. or Er..
        The rest of the string must contain only one or more English
        alphabetic letters (upper and lowercase).
     */
    public boolean AlternativeMatching(String input){
        String regex="^(Mr.|Mrs.|Ms.|Dr.|Er.)[a-zA-Z]+$";
        //System.out.println(utility.checker(regex,input));
        return utility.checker(regex,input);
    }
    /*
        must be of length: 20
        1st character: lowercase letter.
        2nd character: word character.
        3rd character: whitespace character.
        4th character: non word character.
        5th character: digit.
        6th character: non digit.
        7th character: uppercase letter.
        8th character: letter (either lowercase or uppercase).
        9th character: vowel (a, e, i , o , u, A, E, I, O or U).
        10th character: non whitespace character.
        11th character: should be same as 1st character.
        12th character: should be same as 2nd character.
        13th character: should be same as 3rd character.
        14th character: should be same as 4th character.
        15th character: should be same as 5th character.
        16th character: should be same as 6th character.
        17th character: should be same as 7th character.
        18th character: should be same as 8th character.
        19th character: should be same as 9th character.
        20th character: should be same as 10th character.
     */
    public boolean MatchingSametextAgainAndAgain(String input){
        input="ab .";
        String regex="(^[a-z]{1})(\\w){1}(\\s){1}([\\W]){1}(\\d){1}([\\D]){1}([A-Z]){1}([a-zA-Z]){1}([aeiouAEIOU]){1}([\\S]){1}\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10";
        //System.out.println(utility.checkerRetEleAtGrp(regex,input,1));
        return utility.checker(regex,input);
    }
    /*
    consists of 8 digits.
    may have "" separator such that string  gets divided in
    parts, with each part having exactly two digits. (Eg. 12-34-56-78)
     */
    public boolean BackRefToFailedGrp(String input){
        //input="";
        String regex="^\\b[0-9]{2}(-?)[0-9]{2}\\1[0-9]{2}\\1[0-9]{2}$";
        System.out.println(utility.checkerRetEleAtGrp(regex,input,1));
        System.out.println(utility.checker(regex,input));
        return utility.checker(regex,input);
    }
    /*
    Below pattern is for Branch Reset Groups challenge as this will not
     work with Java hence not providing any code.
    '/^\b[0-9]{2}(?|(:)|(-)|(.)|(---))[0-9]{2}\1[0-9]{2}\1[0-9]{2}$/'
     */
    /*
    Forward Reference
    consists of tic or tac.
    tic should not be immediate neighbour of itself.
    The first tic must occur only when tac has appeared at least twice before.
     */
    public boolean ForwardReferences(String input){
        //input="";
        String regex="\\b(\\2tic|(tac))+$";
        System.out.println(utility.checkerRetEleAtGrp(regex,input,1));
        System.out.println(utility.checkerRetEleAtGrp(regex,input,2));
        System.out.println(utility.checker(regex,input));
        return utility.checker(regex,input);
    }
    /*
    HackerRank tweets
     */
    public boolean hackerRankTweets(String input){
        //input="";
        String regex="\\b(\\2tic|(tac))+$";
        System.out.println(utility.checkerRetEleAtGrp(regex,input,1));
        System.out.println(utility.checkerRetEleAtGrp(regex,input,2));
        System.out.println(utility.checker(regex,input));
        return utility.checker(regex,input);
    }

    /*
    Positive Lookahead (?=<something>)
    Negative Lookahead--(?!<something>)
    Positive Lookbehind--(?<=<something>)
    Negative Lookbehind---(?<!<something>)
    Write a regex which can match all characters which are not immediately followed by that same character.
     */
    public boolean negativeLookAhead(String input){
        String regex="(\"(.)(?!\\\\1)\")";
        System.out.println(utility.checker(regex,input));
        return utility.checker(regex,input);
    }

    /*
    Positive positiveLookBehind
    Write a regex which can match all the occurences of digit which are immediately preceded by odd digit.
     */
    public boolean positiveLookBehind(String input){
        String regex="(?<=[13579])\\d";
        System.out.println(utility.checker(regex,input));
        return utility.checker(regex,input);
    }

    /*
    Negative LookBehind
    Write a regex which can match all the occurences of characters
    which are not immediately preceded by vowels (a, e, i, u, o, A, E, I, O, U).
  */
    public boolean negativeLookBehind(String input){
        String regex="(?i)(?<![aeiou]).";
        //System.out.println(utility.checker(regex,input));
        return utility.checker(regex,input);
    }

    /*
     Negative LookBehind
     Write a regex which can match all the occurences of characters
     which are not immediately preceded by vowels (a, e, i, u, o, A, E, I, O, U).
*/
    public boolean detectHTMLLinks(String input){
        String regex="(<a href=\")(.*)(\">)(.*)(<\\/a>)";
        input="<a href=\"http://www.hackerrank.com\">HackerRank</a>";
        //System.out.println(utility.checker(regex,input));
        System.out.println(utility.checkerRetEleAtGrp(regex,input,1 ));
        System.out.println(utility.checkerRetEleAtGrp(regex,input,2 ));
        System.out.println(utility.checkerRetEleAtGrp(regex,input,3 ));
        System.out.println(utility.checkerRetEleAtGrp(regex,input,4 ));
        return utility.checker(regex,input);
    }
}
