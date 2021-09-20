package hash.board;

public class Board {
    private String game[][] = new String[3][3];
    private int i = 0;
    private int j = 0;


    public void UserBoard(int row, int column) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (row == i && column == j) {
                    game[row][column] = "x";
                    System.out.print(game[row][column] + " ");
                } else {
                    game[i][j] = "---";
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
