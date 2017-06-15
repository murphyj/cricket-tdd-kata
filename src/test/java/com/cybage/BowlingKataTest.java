package com.cybage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BowlingKataTest {

    @Test
    public void atStartOfBowlingGameMyScoreIsZero() throws Throwable {
        BowlingGame bowlingGame = new BowlingGame();
        int score = bowlingGame.getScore();
        assertEquals(0, score);
    }

    @Test
    public void knockingDownAPinScoresOne() throws Throwable {
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(1);
        int score = bowlingGame.getScore();
        assertEquals(1, score);
    }
}
