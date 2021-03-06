package hash;

import hash.board.Board;
import hash.menu.Menu;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
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
        System.out.println("Agora escolha a linha que deseja jogar -->");
        int row = sc.nextInt();
        System.out.println("Escolha o modo de jogo, 1 para fácil 2 para difícil");
        int chose = sc.nextInt();
        menu.startCycle(chose, row, column);
        menu.updateCycle(chose);


        sc.close();
    }

}