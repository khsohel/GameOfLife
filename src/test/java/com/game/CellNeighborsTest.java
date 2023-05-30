package com.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellNeighborsTest {

    public static boolean[][] initialGrid = {
            {true, true, false},
            {false, true, false},
            {false, false, false},
            {false, false, false}
    };

    @Test
    public void testCellHasTwoLiveNeighbors() {
        CellNeighbors neighbors = new CellNeighbors(initialGrid);
        assertTrue(neighbors.countOfLiveNeighbors(1,1) == 2);
    }

    @Test
    public void testCornerCellHasOneLiveNeighbors() {
        CellNeighbors neighbors = new CellNeighbors(initialGrid);
        assertTrue(neighbors.countOfLiveNeighbors(0,0) == 2);
    }

    @Test
    public void testBorderCellHasOneLiveNeighbors() {
        CellNeighbors neighbors = new CellNeighbors(initialGrid);
        assertTrue(neighbors.countOfLiveNeighbors(1,2) == 2);
    }

    @Test
    public void testCornerCellHasNoLiveNeighbors() {
        CellNeighbors neighbors = new CellNeighbors(initialGrid);
        assertTrue(neighbors.countOfLiveNeighbors(3,3) == 0);
    }
}
