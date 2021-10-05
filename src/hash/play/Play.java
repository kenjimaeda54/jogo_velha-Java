package hash.play;

import hash.board.Board;
import hash.menu.Menu;

import java.util.Random;

public class Play {

    Board board = new Board();

    public  void showGame(int row, int column) {
        try{

            if(board.validateGame(row,column)){
                board.UserBoard(row,column);
            }else {
                System.out.println("Esta linha e coluna ja esta  preenchidas");
            }

        }catch (Exception e) {
            System.out.println("");
            System.out.println("Voce possivelmente digitou linha ou coluna invalida");
            System.out.println("\nAs colunas e linhas começam no zero e terminam no 2");

        }

    }


    public  void easy() {
        int row = new Random().nextInt(3);
        int column = new Random().nextInt(3);

        if(board.validateGame(row,column)){
            System.out.println("Linha e coluna escolhido pela maquina");
            board.UserBoard(row,column);
        }else {
            easy();
        }

    }



}
