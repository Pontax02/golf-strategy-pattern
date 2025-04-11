package edu.estatuas;

public class ComputeCard {

    private final GolfPlay play;
    private final ScoreCard scoreCard;

    public ComputeCard(GolfPlay play, ScoreCard scoreCard) {
        this.play = play;
        this.scoreCard = scoreCard;
    }



    public void compute() {
        this.play.implementStrategy(this.scoreCard);
    }
}
