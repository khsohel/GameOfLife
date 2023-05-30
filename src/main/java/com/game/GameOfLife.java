package com.game;

import java.util.stream.IntStream;

public class GameOfLife {

    private int rows;
    private int colums;
    private boolean[][] currentGen;
    public GameOfLife(boolean[][] grid) {
        this.rows = grid.length;
        this.colums = grid[0].length;
        this.currentGen = grid;
    }

    public boolean[][] nextGeneration() {
        boolean[][] nextGen = new boolean[this.rows][this.colums];
        IntStream.range(0, this.rows).forEach(row -> {
            IntStream.range(0, this.colums).forEach(column -> {
                int liveNeighbors = new CellNeighbors(this.currentGen).countOfLiveNeighbors(row, column);
                nextGen[row][column] = new CellEvaluator(liveNeighbors, this.currentGen[row][column]).evalCell.apply();
            });
        });
        this.currentGen = nextGen;
        return this.currentGen;
    }
}
