package hash.play;

import hash.board.Board;

import java.util.Random;
import java.util.Scanner;

public class Play {
    private int repeatCycle;

    Board board = new Board();
    Scanner sc = new Scanner(System.in);


    public void showGame(int row, int column) {
        if (board.validateBoard(row, column)) {
            System.out.println("Estado atual do jogo");
            board.UserBoard(row, column, false);
        } else {
            System.out.println("Esta linha e coluna ja esta  preenchidas");
            System.out.println("Insira uma nova coluna");
            int nextColumn = sc.nextInt();
            System.out.println("Insira uma nova lina");
            int nextRow = sc.nextInt();
            showGame(nextRow, nextColumn);
        }

    }

    public String haveWin() {
        if (board.validateWinBoard() != "") {
            String winner = board.validateWinBoard();
            return winner;
        }
        return "";
    }


    public String easy() {
        int row = new Random().nextInt(3);
        int column = new Random().nextInt(3);

        if (board.validateBoard(row, column)) {
            System.out.println("Maquina jogando");
            board.UserBoard(row, column, true);
            if (haveWin() != "") {
                String winner = board.validateWinBoard();
                return winner;
            }
        } else {
            if (haveWin() != "") {
                String winner = haveWin();
                return winner;

            }
            if (this.repeatCycle < 50) {
                this.repeatCycle += 1;
                easy();

            } else {
                this.repeatCycle = 0;
                return "";
            }

        }
        return "";
    }


}
