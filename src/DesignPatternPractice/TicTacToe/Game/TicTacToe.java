package DesignPatternPractice.TicTacToe.Game;

import DesignPatternPractice.TicTacToe.Board.Board;
import DesignPatternPractice.TicTacToe.Board.Pos;
import DesignPatternPractice.TicTacToe.Player.Player;

import java.util.List;

public class TicTacToe implements  GameRule{

    @Override
    public boolean checkWin( Player player,Board board) {
       return (checkDiagonally(player,board)||checkVertically(player,board)||checkHorizontally(player,board));
    }

    @Override
    public boolean checkMove(Pos pos, Board board){
        if(pos.x<0||pos.y<0||pos.x>= board.getN()||pos.y>=board.getM())throw new IllegalArgumentException();
        if(board.getChar(pos.x,pos.y)!=board.getEmptyCell())throw new IllegalArgumentException();
        return true;
    }


    @Override
    public int allowedPlayers() {
        return 2;
    }

    public boolean checkHorizontally(Player player,Board board){
        int n=board.getN();
        int m=board.getM();

        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                if(board.getChar(i,j)==player.getSymbol())cnt++;
            }
            if(cnt==m)return true;
        }
        return false;
    }
    public boolean checkVertically(Player player,Board board){
        int n=board.getN();
        int m=board.getM();
        for(int i=0;i<m;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(board.getChar(j,i)==player.getSymbol())cnt++;
            }
            if(cnt==n)return true;
        }
        return false;
    }
    public boolean checkDiagonally(Player player,Board board){
        int n=board.getN();
        int m=board.getM();
        int diaglr=0,diagrl=0;
        for(int i=0;i<n;i++){
           if(board.getChar(i,i)==player.getSymbol())diaglr++;
           if(board.getChar(i,n-1-i)==player.getSymbol())diagrl++;
        }
        if(diaglr==n||diagrl==n)return true;
        return false;
    }
}
