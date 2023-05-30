package com.game;

public class MainFunction {
    public static void main(String[] args) throws Exception {


        boolean[][] initialGrid = {
                {true, true, false},
                {true, true, false},
                {false, false, false}
        };


        GameOfLife game = new GameOfLife(initialGrid);
        print(initialGrid);
        System.out.println("=============");
        print(game.nextGeneration());
      //  print(game.nextGeneration());
       // print(game.nextGeneration());
      //  print(game.nextGeneration());


    }

    public static void print(boolean[][] grid) {

        for (int x = 0; x < grid.length; x++) {
            String line = "";
            for (int y = 0; y < grid[0].length; y++) {
                if (grid[x][y] == false) {
                    line += "| ";
                } else {
                    line += "|*";
                }
            }
            line += "|";
            System.out.println(line);
        }

        System.out.println("-------------");
    }
}