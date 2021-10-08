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
        try {
            mode(chose, row, column);

        } catch (Exception e) {

            System.out.println("");
            System.out.println("Voce possivelmente digitou linha ou coluna invalida");
            System.out.println("As colunas e linhas começam no zero e terminam no 2");
            System.out.println("\nJa que e sua primeira interiracao,precisara iniciar novamente o jogo");
            updateCycle(3);
        }

    }

    public void updateCycle(int statusGame) {
        if (statusGame == 3) {
            this.updateGame = 7;
            return;
        }
        ;
        if (this.updateGame < 4) {
            try {
                System.out.println("Insira proxima coluna");
                int nextColumn = sc.nextInt();
                System.out.println("Insira proxima linha");
                int nextRow = sc.nextInt();
                this.updateGame += 1;
                mode(statusGame, nextRow, nextColumn);
            } catch (Exception e) {
                System.out.println("Digitou coluna ou linha invalida precisa repetir");
                updateCycle(statusGame);
            }
        } else if(this.updateGame == 4 ) {
//            if (play.haveWin() != "") {
////                String winner = play.haveWin();
////                endCycLe(winner);
//                return;
//            }
            System.out.println("Sem nenhum vencedor");
            return;
        }


    }


    private void mode(int chose, int row, int column) {
        if (chose == 1) {
            play.showGame(row, column);
            if (play.easy() != "") {
                String winner = play.haveWin();
                endCycLe(winner);
                return;
            } else {
                updateCycle(1);
            }

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
