package Jogo_de_Xadrez.boardGame;

    public class Position{
    private int row;
    private int colum;

    public Position(){

    }
    public Position(int row, int colum){
        this.row = row;
        this.colum = colum;
    }
    public void setColum(int colum) {
        this.colum = colum;
    }
    public int getColum() {
        return colum;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getRow() {
        return row;
    }
    @Override
    public String toString(){
        return row + "," + colum;
    }
}