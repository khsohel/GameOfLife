package com.game;

import java.util.Arrays;

public class CellNeighbors {

    private static final int[][] neighbors = {
            {-1,-1},{-1,0},{-1,1},
            {0,-1}       ,{0,1},
            {1,-1}, {1,0} ,{1,1}
    };

    private boolean[][] grid;
    public CellNeighbors(boolean[][] grid) {
        this.grid = grid;
    }

    public int countOfLiveNeighbors(int row, int column) {
        return (int) Arrays.stream(neighbors)
                .filter(offset -> isValidCell(row + offset[0], column +offset[1]))
                .filter(offset -> this.grid[row + offset[0]][column + offset[1]])
                .count();
    }

    private boolean isValidCell(int row, int column) {
        return row >= 0 && row < this.grid.length && column >= 0 && column < this.grid[0].length;
    }
}
