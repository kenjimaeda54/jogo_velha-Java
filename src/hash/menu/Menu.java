package hash.menu;


import hash.play.Play;

public class Menu {
    private   int  row;
    private   int column;

    Play play = new Play();

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void buildGame() {
        play.showGame(row,column);

    }


}
