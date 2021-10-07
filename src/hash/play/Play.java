package hash.play;

import hash.board.Board;

import java.util.Random;
import java.util.Scanner;

public class Play {

    Board board = new Board();
    Scanner sc = new Scanner(System.in);


    public void showGame(int row, int column) {
        if (board.validateGame(row, column)) {
            System.out.println("Estado atual do jogo");
            board.UserBoard(row, column, false);
        } else {
            System.out.println("Esta linha e coluna ja esta  preenchidas");
            System.out.println("Insira uma nova coluna");
            int nextColumn = sc.nextInt();
            System.out.println("Insira uma nova lina");
            int nextRow = sc.nextInt();
            showGame(nextRow,nextColumn);
        }

    }


    public void easy() {
        int row = new Random().nextInt(3);
        int column = new Random().nextInt(3);

        if (board.validateGame(row, column)) {
            System.out.println("Maquina jogando");
            board.UserBoard(row, column, true);

        } else {
            easy();
        }

    }



}
