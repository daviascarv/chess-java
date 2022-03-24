package Jogo_de_Xadrez.application;
import java.util.Date;
import java.util.Locale;

import Jogo_de_Xadrez.Chess.ChessMatch;
import Jogo_de_Xadrez.boardGame.Board;
import Jogo_de_Xadrez.boardGame.Position;

public class Program {
    public static void main(String[] args) {
        
        ChessMatch chessMatch = new ChessMatch();
        Ui.printBoard(chessMatch.getPiece());
    }
}
