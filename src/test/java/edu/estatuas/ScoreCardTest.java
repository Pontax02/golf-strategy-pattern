package edu.estatuas;


import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class ScoreCardTest {

    @BeforeClass
    public static void ScoreSetup() {

    }


    @Test
    public void testScoreCard() {


        Player playerA = new Player("MJ", (byte) 0);
        Player playerB = new Player("PM", (byte) 0);
        Player playerC = new Player("MM", (byte) 0);
        Player playerD = new Player("BB", (byte) 0);
        ScoreCard scoreCard = new ScoreCard(Optional.of(playerA),Optional.of(playerB), Optional.of(playerC), Optional.of(playerD));

        assertEquals(Optional.of(playerA),scoreCard.getPlayerA());
        assertEquals(Optional.of(playerB),scoreCard.getPlayerB());
        assertEquals(Optional.of(playerC),scoreCard.getPlayerC());
        assertEquals(Optional.of(playerD),scoreCard.getPlayerD());
    }

}
