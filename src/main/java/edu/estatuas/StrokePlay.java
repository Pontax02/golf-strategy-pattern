package edu.estatuas;

public class StrokePlay implements GolfPlay {

    private static byte[] course;
    private Player player;
    public static int finalscore = 0;
    @Override
    public void implementStrategy(ScoreCard scoreCard){

        scoreCard.getPlayerA().ifPresent(player -> {
            byte[] course = scoreCard.getPlayerCourse(player);
            int finalScore = 0;
            for (byte strokes : course) {
                finalScore += strokes;
            }
            player.finalScore = finalScore;
        });


        scoreCard.getPlayerB().ifPresent(player -> {
            byte[] course = scoreCard.getPlayerCourse(player);
            int finalScore = 0;
            for (byte strokes : course) {
                finalScore += strokes;
            }
            player.finalScore = finalScore;
        });

    }

}
