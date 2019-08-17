package RegEx.RegEx3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class Challenge10OnwardsTest {

    private boolean result;
    private String value;

    public Challenge10OnwardsTest(boolean result,String value){
        this.result=result;
        this.value=value;
    }

    @Parameterized.Parameters
    //hackrr","h4ckr","h4C1r","h4Ckr"}
    /*
        The string's length is 5
        The first character must be a lowercase English alphabetic character.
        The second character must be a positive digit. Note that we consider zero to be neither positive nor negative.
        The third character must not be a lowercase English alphabetic character.
        The fourth character must not be an uppercase English alphabetic character.
        The fifth character must be an uppercase English alphabetic character.
     */
    public static Collection<Object[]> setMultipleValues(){
        return  Arrays.asList(new Object[][]{
                {true,"h4CkR"},
                {false,"H4CkR"},
                {false,"h%CkR"},
                {false,"h4ckR"},
                {false,"h4CKR"},
                {false,"h4CKr"},
                {true,"h4CkRank"}

        });
    }

    @org.junit.Test
    public void challenge_Test(){
        Challenge10Onwards ch10=new Challenge10Onwards();
        //assertTrue(ch10.challengeTen(value));
        assertEquals(result,ch10.MatchingCharRanges(value));
    }

    @org.junit.Test
    public void MatchingWordBoundries_Test(){
        Challenge10Onwards ch10=new Challenge10Onwards();
        //assertTrue(ch10.challengeTen(value));
        assertEquals(result,ch10.MatchingWordBoundries("Found any match?"));
    }
}