package hash;

import hash.board.Board;
import hash.menu.Menu;


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
        System.out.println("Agora escolha a linha que deseja jogar -->");
        int row = sc.nextInt();
        System.out.println("Escolha o modo de jogo, 1 para facil 2 para dificil");
        int chose = sc.nextInt();
        menu.startCycle(chose,row,column);
        System.out.println("Linhas e colunas começam em 0 e terminam no 2");
        System.out.println("Escolha novamente uma coluna para jogar --> ");
        int nextColumn = sc.nextInt();
        System.out.println("Agora escolha a linha que deseja jogar -->");
        int nextRow = sc.nextInt();
        menu.updateCycle(chose,nextRow,nextColumn);

        sc.close();
    }

}