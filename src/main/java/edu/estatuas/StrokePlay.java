package edu.estatuas;

import com.google.common.primitives.Bytes;

public class StrokePlay implements GolfPlay {

    private static byte[] course;
    private Player player;
    public static int finalscore = 0;

        @Override
        public void implementStrategy(ScoreCard scoreCard) {
            scoreCard.getPlayers().forEach(player ->
                    player.setScore(
                            Bytes.asList(scoreCard.getPlayerCourse(player))
                                    .stream()
                                    .map(Byte::intValue)
                                    .reduce(0, Integer::sum)
                    )
            );
        }

    }


