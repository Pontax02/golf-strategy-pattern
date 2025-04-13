package edu.estatuas;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlayerTest {


    @Test
    public void builderPlayerTest() {

        Player player = new Player("MJ",(byte) 0);

        assertEquals((byte)0,player.getHandicap());
        assertEquals("MJ",player.getInitials());
    }
}
