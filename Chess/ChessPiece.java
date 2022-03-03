package Jogo_de_Xadrez.Chess;
import Jogo_de_Xadrez.boardGame.Piece;

public class ChessPiece extends Piece{

    private Color color;

    public ChessPiece(Color color, Board board){
        super(board);
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    
}
