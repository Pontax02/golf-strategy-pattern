package edu.estatuas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PlayerTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void builderPlayerTest() {

        Player player = new Player("MJ",(byte) 0);

        assertEquals((byte)0,player.getHandicap());
        assertEquals("MJ",player.getInitials());
    }
}
