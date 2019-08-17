package RegEx.RegEx3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class HackerRankTweetSolutionTest {

    private boolean result;
    private String value;

    public HackerRankTweetSolutionTest(boolean result,String value) {
        this.result=result;
        this.value=value;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> runWithMultipleValues(){
        return Arrays.asList(new Object[][]{
                {true,"this contains #hackerrank"},
                {false,"this has no ref to check string"},
                {true,"yes, this indeed contains$hackerRank"}
        });
    }

    @Test
    public void checkHacerRankTweet() {
        HackerRankTweetSolution hcSol=new HackerRankTweetSolution();
//        assertThat("\\d+",hcSol.checkHacerRankTweetWithSingleVal(value));
//        assert
        //assertEquals(\\d+,hcSol.checkHacerRankTweetWithSingleVal(value));
    }
}