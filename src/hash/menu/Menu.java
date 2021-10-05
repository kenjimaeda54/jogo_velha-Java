package hash.menu;




import hash.play.Play;


public class Menu {
    protected    int  row;
    protected   int column;

    Play play = new Play();

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }


    public void mode(int chose  ) {
        if(chose == 1){
            play.showGame(row,column);
            play.easy();
        }else{

        }

    }


}
