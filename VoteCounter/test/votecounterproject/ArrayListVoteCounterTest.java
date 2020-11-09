package votecounterproject;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * @version Spring 2019
 * @author clatulip
 */
public class ArrayListVoteCounterTest {

    private ArrayListVoteCounter voteCounter;

    @Before
    public void setUp() throws Exception {
        this.voteCounter = new ArrayListVoteCounter();
        /*
        Data Legend:
            [0] = "Darth Sidius"
            [1] = "Darth Maul"
            [2] = "Darth Vader"
            [3] = "Darth Plagueis"
         */
    }

    @Test
    public void recordVote() {

        // assert both the votes and spoiled votes lists are empty.    
        assertTrue(voteCounter.getVotes().isEmpty());
        assertTrue(voteCounter.getSpoiledVotes().isEmpty());

        // now, record some votes for one of the candidates. Use the legend 
        // above for clarification
        for (int i = 0; i < 20; i++) {
            voteCounter.recordVote("Darth Vader");

        }

        // using the getSithSenateMemberVotes method, make sure your candidate 
        // actually recieved their votes
        System.out.println(voteCounter.getSithSenateMemberVotes("Darth Vader"));

        // assert that the size of the votes list has increased.
        assertEquals(voteCounter.getSithSenateMemberVotes("Darth Vader"), 20);

    }
}
