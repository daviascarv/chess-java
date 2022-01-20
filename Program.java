package Jogo_de_Xadrez;
import java.util.Date;
import java.util.Locale;

import Jogo_de_Xadrez.boardGame.Position;

public class Program {
    public static void main(String[] args) {
        Position pos = new Position(3, 5);
        Locale.setDefault(new Locale("pt-br"));
        Date now = new Date();
        System.out.println("Hello World!");

    }
    
}
