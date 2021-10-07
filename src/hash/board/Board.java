package hash.board;

import java.util.Arrays;

public class Board {
    protected final String[][] game = new String[3][3];


    private int i = 0;
    private int j = 0;

    public boolean validateWinBoard() {
        if (i < 3) {
            if (j < 3) {

                if (validateFieldWin(i, j)) {
                    return true;
                }
                j += 1;
            }
            i += 1;
            validateWinBoard();
        } else {
            i = 0;
            j = 0;
        }

        return false;

    }

    private boolean validateFieldWin(int row, int column) {
       if( row < 3 ){
           if(game[row][0]  == "X" && game[row][1] == "X" && game[row][2] == "X"){
              return true;
           }
           if(game[row][0] == "O"  && game[row][1] == "O" && game[row][2] == "O"){
               return true;
           }
           row += 1;
           validateFieldWin(row +=1,column);
       }
        if( column < 3 ){
            if(game[0][column]  == "X" && game[1][column] == "X" && game[2][column] == "X"){
                return true;
            }
            if(game[0][column] == "O"  && game[1][column] == "O" && game[2][column] == "O"){
                return true;
            }
            column += 1;
            validateFieldWin(row,column+=1);
        }

        return false;
    }

    public boolean validateBoard(int row, int column) {
        if (i < 3) {
            if (j < 3) {

                if (validateField(row, column, j) == false) {
                    return false;
                }
            }
            i += 1;
            validateBoard(row, column);
        } else {
            i = 0;
            j = 0;
        }

        return true;
    }

    private boolean validateField(int row, int column, int acc) {
        if (acc < 3) {
            if (game[row][column] == null || game[row][column] == "---") {
                validateField(row, column, acc + 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public void UserBoard(int row, int column, boolean isMachine) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (row == i && column == j) {
                    if (isMachine) {
                        game[row][column] = "O";
                    } else {
                        game[row][column] = "X";
                    }
                    System.out.print(game[row][column] + " ");
                } else {
                    if (game[i][j] == null) {
                        game[i][j] = "---";

                    }
                    System.out.print(game[i][j] + " ");
                }
            }
            System.out.println("");

        }


    }


    public void createBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game[i][j] = "---";
            }
        }

    }

    public void showBoard(int value) {
        if (value < 3) {
            if (i < 3) {
                printBoard(i, j);
            }
            System.out.println("");
            showBoard(value + 1);
        } else {
            i = 0;
            j = 0;
        }

    }

    private void printBoard(int oneDimension, int twoDimension) {
        if (twoDimension < 3) {
            System.out.print(game[oneDimension][twoDimension] + " ");
            printBoard(oneDimension, twoDimension + 1);
        }
    }


}
