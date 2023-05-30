package com.game;

public class CellEvaluator {

    public final NoArgFunction<Boolean> evalCell;
    private int liveNeighbors;

    public CellEvaluator(int liveNeighbors, Boolean isActive) {
        this.liveNeighbors = liveNeighbors;
        this.evalCell = isActive ? this ::evalActiveCell : this :: evalInActiveCell;
    }

    private boolean evalActiveCell() {
        return liveNeighbors == 2 || liveNeighbors == 3;
    }

    private boolean evalInActiveCell() {
        return liveNeighbors == 3;
    }

}
