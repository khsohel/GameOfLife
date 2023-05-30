package com.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellEvaluatorTest {

    @Test
    public void testActiveCellWithThreeLiveNeighbors() {
        CellEvaluator evaluator = new CellEvaluator(3, true);
        assertTrue(evaluator.evalCell.apply());
    }

    @Test
    public void testActiveCellWithTwoLiveNeighbors() {
        CellEvaluator evaluator = new CellEvaluator(2, true);
        assertTrue(evaluator.evalCell.apply());
    }

    @Test
    public void testActiveCellWithNoLiveNeighbors() {
        CellEvaluator evaluator = new CellEvaluator(0, true);
        assertFalse(evaluator.evalCell.apply());
    }

    @Test
    public void testInActiveCellWithNoLiveNeighbors() {
        CellEvaluator evaluator = new CellEvaluator(0, false);
        assertFalse(evaluator.evalCell.apply());
    }

    @Test
    public void testInActiveCellWithTwoLiveNeighbors() {
        CellEvaluator evaluator = new CellEvaluator(2, false);
        assertFalse(evaluator.evalCell.apply());
    }

    @Test
    public void testInActiveCellWithThreeLiveNeighbors() {
        CellEvaluator evaluator = new CellEvaluator(3, false);
        assertTrue(evaluator.evalCell.apply());
    }
}
