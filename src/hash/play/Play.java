package hash.play;

import hash.board.Board;
import hash.menu.Menu;

public class Play {
    private String game[][] = new String[3][3];

    Board board = new Board();
    public void showGame(int row, int column) {
        try {
            game[row][column] = "";
            board.UserBoard(row, column);
        } catch (Exception e) {
            System.out.println("Voce possivelmente digitou uma linha ou coluna que nao corresponde ao tabuleiro");
            System.out.println("Linhas e colunas começam no zero e terminam no 2");
        }

    }


}
