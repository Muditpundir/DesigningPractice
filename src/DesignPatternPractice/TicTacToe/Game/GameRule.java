package DesignPatternPractice.TicTacToe.Game;

import DesignPatternPractice.TicTacToe.Board.Board;
import DesignPatternPractice.TicTacToe.Board.Pos;
import DesignPatternPractice.TicTacToe.Player.Player;

import java.util.List;

public interface GameRule {

    public boolean checkWin(Player player, Board board);
    public boolean checkMove(Pos pos, Board board);
    public int allowedPlayers();
}
