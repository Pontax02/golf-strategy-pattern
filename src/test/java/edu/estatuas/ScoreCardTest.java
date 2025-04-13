package edu.estatuas;


import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;



public class ScoreCardTest {

    private static Player playerA;
    private static Player playerB;
    private static Player playerC;
    private static Player playerD;
    private static ScoreCard scoreCard;

    @BeforeClass
    public static void ScoreSetup() {
         playerA = new Player("MJ", (byte) 0);
         playerB = new Player("PM", (byte) 0);
         playerC = new Player("MM", (byte) 0);
         playerD = new Player("BB", (byte) 0);
         scoreCard = new ScoreCard();
        scoreCard.setPlayerA(playerA);
        scoreCard.setPlayerB(playerB);
        scoreCard.setPlayerC(playerC);
        scoreCard.setPlayerD(playerD);

    }


    @Test
    public void testScoreCard() {

        assertEquals(Optional.of(playerA),scoreCard.getPlayerA());
        assertEquals(Optional.of(playerB),scoreCard.getPlayerB());
        assertEquals(Optional.of(playerC),scoreCard.getPlayerC());
        assertEquals(Optional.of(playerD),scoreCard.getPlayerD());

    }
    @Test
    public void testScoreCardInitials() {

        assertEquals("MJ",playerA.getInitials());
        assertEquals("PM",playerB.getInitials());
        assertEquals("MM",playerC.getInitials());
        assertEquals("BB",playerD.getInitials());
    }
}
