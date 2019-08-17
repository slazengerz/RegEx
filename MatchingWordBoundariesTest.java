package RegEx.RegEx3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchingWordBoundariesTest {

    private Challenge10Onwards ch10;

    @Before
    public void setup(){
        ch10=new Challenge10Onwards();
    }

    @Test
    public void MatchingWordBoundries_Test() {
        String input="Found any Match?";
        assertTrue(ch10.MatchingWordBoundries(input));

    }

    @Test
    public void AlternativeMatchings_Test() {
        String input="Ms.underscore";
        assertTrue(ch10.AlternativeMatching(input) );

    }
}