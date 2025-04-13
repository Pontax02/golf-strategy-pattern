package edu.estatuas;

import java.util.Arrays;
import java.util.Optional;

    enum StablefordSystem {

    DOUBLE_BOGEY(2,-3),
    BOGEY(1,-1),
    PAR(0,0),
    BIRDIE(-1,2),
    EAGLE(-2,5),
    ALBATROSS(-3,8);

    private final int strokes;
    private final int points;
    private StablefordSystem(int strokes, int points) {
        this.strokes = strokes;
        this.points = points;
    }

    public int getStrokes() {
        return this.strokes;
    }
    public int getPoints() {
    return this.points;
    }

        static StablefordSystem getLevel(int strokes) {
            Optional<StablefordSystem> level = Arrays.asList(StablefordSystem.values())
                    .stream()
                    .filter(l -> l.getStrokes() == strokes)
                    .findFirst();
            return level.isPresent()? level.get() : DOUBLE_BOGEY;
        }

    @Override
    public String toString() {
        return this.name() + ": " + this.getPoints();
        }
}
