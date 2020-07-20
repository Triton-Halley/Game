package com.example.myapplication.Model;

import com.example.myapplication.Enums.GameResult;

public class TicTacToe {
    public static char[][] page = new char[3][3];

    public TicTacToe() {
        for (int i = 0; i < page.length; i++) {
            for (int j = 0; j < page.length; j++) {
                // ' - ' mean E empty
                page[i][j] = ' ';
            }
        }
    }
    //Finish game and Empty page Array
    public void empty() {
        for (int i = 0; i < page.length; i++) {
            for (int j = 0; j < page.length; j++) {
                // ' - ' mean E empty
                page[i][j] = ' ';
            }
        }
    }

    public void enterValue(char Operator, int rows, int columns) {
        page[rows][columns] = Operator;
    }

    public GameResult isGameFinished() {
        int CounterRowsX = 0;
        int CounterRowsO = 0;
        int CounterColumnsO = 0;
        int CounterColumnsX = 0;

        GameResult gameResult = null;
        if (page[0][0] == 'X' && page[1][1] == 'X' && page[2][2] == 'X') {
            gameResult = GameResult.X_WINS;
        } else if (page[0][0] == 'O' && page[1][1] == 'O' && page[2][2] == 'O') {
            gameResult = GameResult.O_WINS;
        } else if (page[0][2] == 'O' && page[1][1] == 'O' && page[2][0] == 'O') {
            gameResult = GameResult.O_WINS;
        } else if (page[0][2] == 'X' && page[1][1] == 'X' && page[2][0] == 'X') {
            gameResult = GameResult.X_WINS;
        } else {
            for (int i = 0; i < page.length; i++) {
                for (int j = 0; j < page.length; j++) {
                    if (page[i][j] == 'X') {
                        CounterRowsX++;
                    }

                    if (page[i][j] == 'O') {
                        CounterRowsO++;
                    }
                }
                gameResult = gameResultColumnsAndRows(CounterColumnsO, CounterColumnsX,CounterRowsX,CounterRowsO);
                if (gameResult== GameResult.O_WINS||gameResult==GameResult.X_WINS){
                    CounterRowsX = 0;
                    CounterRowsO = 0;
                    return gameResult ;
                }else{
                    CounterRowsX = 0;
                    CounterRowsO = 0;
                }

            }
            for (int i = 0; i < page.length; i++) {
                for (int j = 0; j < page.length; j++) {
                    if (page[j][i] == 'X') {
                        CounterColumnsX++;
                    }

                    if (page[j][i] == 'O') {
                        CounterColumnsO++;
                    }
                }
                gameResult = gameResultColumnsAndRows(CounterColumnsO, CounterColumnsX,CounterRowsX,CounterRowsO);
                if (gameResult== GameResult.O_WINS||gameResult==GameResult.X_WINS){
                    CounterColumnsO = 0;
                    CounterColumnsX = 0;
                    return gameResult ;
                }else{
                    CounterColumnsO = 0;
                    CounterColumnsX = 0;
                }


            }

        }
        return gameResult;
    }

    private GameResult gameResultColumnsAndRows(int counterColumnsO, int counterColumnsX, int counterRowsX, int counterRowsO) {
        GameResult gameResult;
        if (counterColumnsX == 3) {
            gameResult = GameResult.X_WINS;
        } else if (counterColumnsO == 3) {
            gameResult = GameResult.O_WINS;
        }
        else if (counterRowsX == 3) {
            gameResult = GameResult.X_WINS;
        } else if (counterRowsO == 3) {
            gameResult = GameResult.O_WINS;
        } else {
            gameResult = GameResult.DRAW;
        }
        return gameResult;
    }

/*    public void print() {
        for (int i = 0; i < page.length; i++) {
            for (int j = 0; j < page.length; j++) {
                System.out.print(page[i][j] + " ");
            }
            System.out.println();
        }
    }*/
}
