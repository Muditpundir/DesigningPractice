package DesignPatternPractice.TicTacToe.Board;

import DesignPatternPractice.TicTacToe.Game.GameRule;
import DesignPatternPractice.TicTacToe.Player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {

    private int n,m;
    private final char emptyCell='#';



    private char grid[][];

    public Board(int n,int m){
        this.n=n;this.m=m;
       this.grid=new char[n][m];

       for(int i=0;i<n;i++)for(int j=0;j<m;j++)grid[i][j]=emptyCell;
    }
    public  char getEmptyCell(){return this.emptyCell;}
    public  char getChar(int i, int j){return this.grid[i][j];}

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }


    public void markSymbol(Pos pos,Player player){
       grid[pos.x][pos.y]=player.getSymbol();
    }

}
