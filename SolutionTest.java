package RegEx.RegEx3;

import org.junit.Before;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution sol;

    @Before
    public void setup(){
        sol=new Solution();
    }

    @org.junit.Test
    public void returnCount() {
        assertEquals(1,sol.returnCount("text labor instead knit shop flavor find humor critical driving","humor"));
    }
}