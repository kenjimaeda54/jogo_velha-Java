package hash.menu;


import hash.play.Play;


public class Menu {
    protected int row;
    protected int column;

    Play play = new Play();

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }


    public void mode(int chose) {
        try {
            if (chose == 1) {
                play.showGame(row, column);
                play.easy();
            } else {

            }

        } catch (Exception e) {
            System.out.println("");
            System.out.println("Voce possivelmente digitou linha ou coluna invalida");
            System.out.println("\nAs colunas e linhas começam no zero e terminam no 2");

        }

    }

}
