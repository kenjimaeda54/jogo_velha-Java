package hash.menu;


import hash.play.Play;

import java.util.Scanner;


public class Menu {
    protected int row;
    protected int column;
    protected int chose;
    protected int updateGame = 0;

    Play play = new Play();

    Scanner sc = new Scanner(System.in);


    public void startCycle(int chose, int row, int column) {
        try {
            mode(chose, row, column);

        } catch (Exception e) {

            System.out.println("");
            System.out.println("Voce possivelmente digitou linha ou coluna invalida");
            System.out.println("\nAs colunas e linhas começam no zero e terminam no 2");

        }

    }

    public void updateCycle(int chose, int row, int column) {
        mode(chose, row, column);
        if(this.updateGame < 3 ){
            System.out.println("Insira proxima coluna");
            int nextColumn = sc.nextInt();
            System.out.println("Insira proxima linha");
            int nextRow = sc.nextInt();
            mode(chose, nextRow, nextColumn);
            this.updateGame += 1;
        }else{
            this.updateGame = 0;
            return;
        }


    }


    private void mode(int chose, int row, int column) {
        if (chose == 1) {
            play.showGame(row, column);
            play.easy();
        } else {
            return;
        }

    }


}
