package hash.menu;


import hash.board.Board;
import hash.play.Play;

import java.util.Scanner;


public class Menu {
    private int updateGame;

    Play play = new Play();
    Board board = new Board();

    Scanner sc = new Scanner(System.in);


    public void startCycle(int chose, int row, int column) {
        if (row > 2 || column > 2) {
            System.out.println("Digitou colunas ou linhas invalidas");
            updateCycle(3);
        } else {
            mode(chose, row, column);
        }

    }

    public void updateCycle(int statusGame) {
        if (statusGame == 3) {
            this.updateGame = 7;
            return;
        }
        ;
        if (play.haveWin() != "" && this.updateGame != 7) {
            String winner = play.haveWin();
            endCycLe(winner);
            return;
        } else if (this.updateGame < 4) {
            System.out.println("Insira proxima coluna");
            int nextColumn = sc.nextInt();
            System.out.println("Insira proxima linha");
            int nextRow = sc.nextInt();
            if(nextRow > 2 || nextColumn > 2){
                System.out.println("Digitou colunas ou linhas erradas");
                System.out.println("Linhas e colunas comecam no 0 e terminam no 2");
                updateCycle(statusGame);
                return;
            }
            this.updateGame += 1;
            mode(statusGame, nextRow, nextColumn);
        } else if (this.updateGame == 4) {
            String winner =  "Sem nenhum vencedor";
            endCycLe(winner);
            return;
        }


    }


    private void mode(int chose, int row, int column) {
        if (chose == 1) {
            play.showGame(row, column);
            play.easy();
            updateCycle(1);
        } else {
            if (chose == 2) {
                System.out.println("Por enquanto modo hard nao esta disponível");
                updateCycle(3);
                return;
            }
            System.out.println("Escolheu modo que nao existe ");
            updateCycle(3);
            return;
        }


    }

    private void endCycLe(String win) {
        System.out.println(win);
        updateCycle(3);
    }


}
