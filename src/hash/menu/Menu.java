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

    public void updateCycle(int chose) {
        if(chose == 3){
            this.updateGame = 5;
            return;
        };
        if (this.updateGame < 4) {
            System.out.println("Insira proxima coluna");
            int nextColumn = sc.nextInt();
            System.out.println("Insira proxima linha");
            int nextRow = sc.nextInt();
            if(play.haveWin()){
                String win = "Parabens voce e o nosso vencedor";
                endCycLe(win);
                return;
            }else{
                mode(chose, nextRow, nextColumn);
            }

            this.updateGame += 1;
            updateCycle(chose);
        } else {
            this.updateGame = 0;
            return;
        }

    }


    private void mode(int chose, int row, int column) {
        if (chose == 1) {
            play.showGame(row, column);
            if(play.easy()){
                String win = "Infelizmente voce perdeu";
                endCycLe(win);
            }
        } else {
            return;
        }

    }

    private void endCycLe(String win){
        System.out.println(win);
        updateCycle(3);
    }



}
