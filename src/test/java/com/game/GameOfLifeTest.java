package com.game;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameOfLifeTest {

    // 1 - Birth rule
    /**Given we have an empty cell with exact 3 live neighbors.
     * Then this cell become alive
     * Verify This cell is alive
     */
    @Test
    public void testBirthOfACell() {
        boolean[][] initialGrid = {
                {false, true, false},
                {true, false, true},
                {false, false, false}
        };

        boolean[][] expectedGrid = {
                {false, true, false},
                {false, true, false},
                {false, false, false}
        };
        GameOfLife game = new GameOfLife(initialGrid);
        assertArrayEquals(expectedGrid, game.nextGeneration());

    }
    // 2 - death rule
    /**
     * Given we have an active or alive cell
     * if this cell has fever than 2 and more than 3 neighbors it will die
     * Verify this is not active in next generation
     */
    @Test
    public void testDeathOfACellDueToUnderPopulation() {
        boolean[][] initialGrid = {
                {false, false, false},
                {false, true, false},
                {false, false, false}
        };

        boolean[][] expectedGrid = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };
        GameOfLife game = new GameOfLife(initialGrid);
        assertArrayEquals(expectedGrid, game.nextGeneration());
    }

    @Test
    public void testDeathOfACellDueToOverPopulation() {
        boolean[][] initialGrid = {
                {false,true,false},
                {true,true,true},
                {false,true,false}
        };

        boolean[][] expectedGrid = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        GameOfLife game = new GameOfLife(initialGrid);
        assertArrayEquals(expectedGrid, game.nextGeneration());
    }
    // 3 - Survival rule
    /**
     * Given we have an active cell with exact 2 or 3 live neighbors
     * Then this cell remains alive
     * Verify this cell is alive.
     */
    @Test
    public void  testCellSurviveWithTwoAliveNeighbors() {
        boolean[][] initialGrid = {
                {true, false, false},
                {false, true, false},
                {false, false, true}
        };

        boolean[][] expectedGrid = {
                {false, false, false},
                {false, true, false},
                {false, false, false}
        };
        GameOfLife game = new GameOfLife(initialGrid);
        assertArrayEquals(expectedGrid, game.nextGeneration());
    }

    @Test
    public void  testCellSurviveWithThreeAliveNeighbors() {
        boolean[][] initialGrid = {
                {true, true, false},
                {true, true, false},
                {false, false, false}
        };

        boolean[][] expectedGrid = {
                {true, true, false},
                {true, true, false},
                {false, false, false}
        };
        GameOfLife game = new GameOfLife(initialGrid);
        assertArrayEquals(expectedGrid, game.nextGeneration());
    }
}
