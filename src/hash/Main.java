package hash;

import hash.board.Board;
import hash.menu.Menu;
import hash.play.Play;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Board board = new Board();
        System.out.println("Seja bem vindo");
        System.out.println("No momento o tabuleiro se encontra assim");
        board.createBoard();
        board.showBoard(0);
        System.out.println("Linhas e colunas começam em 0 e terminam no 2");
        System.out.println("Escolha primeiro a coluna que deseja jogar --> ");
        int column = sc.nextInt();
        menu.setColumn(column);
        System.out.println("Agora escolha a linha que deseja jogar -->");
        int row = sc.nextInt();
        menu.setRow(row);
        menu.buildGame();

        sc.close();
    }

}