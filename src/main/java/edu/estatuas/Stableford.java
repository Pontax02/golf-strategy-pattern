package edu.estatuas;

import com.google.common.collect.Streams;
import com.google.common.primitives.Bytes;


public class Stableford implements GolfPlay {





    @Override
    public void implementStrategy(ScoreCard scoreCard){





        scoreCard.getPlayers().forEach(
                player -> player.setPoints(
                        Streams.zip(scoreCard.getHoles().stream().map(Holes::getPar),
                                        Bytes.asList(scoreCard.getPlayerCourse(player)).stream(),
                                        (par, strokes) -> strokes - par)
                                .map(StablefordSystem::getLevel)
                                .map(StablefordSystem::getPoints)
                                .reduce(0, Integer::sum)));
    }
}
