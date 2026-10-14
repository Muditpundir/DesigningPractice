package DesignPatternPractice.TicTacToe.Game;

import DesignPatternPractice.TicTacToe.Board.Board;
import DesignPatternPractice.TicTacToe.Board.Pos;
import DesignPatternPractice.TicTacToe.Player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameConsole {

    Scanner sc;
    GameRule rule;
    Board board;
    private List<Player> players;

   public GameConsole(GameRule rule,Board board){
        sc=new Scanner(System.in);
        this.rule=rule;
        this.board=board;
        players=new ArrayList<>();
    }

    public Pos takePlayerInput(Player player){
        System.out.println("Please enter cordinates "+ player.getSymbol());
        return new Pos(sc.nextInt(),sc.nextInt());
    }
    public void gamePlay(){
        addPlayer();
        int n=players.size();
        int totalMoves=board.getM()*board.getN();
        for(int i=0;i<totalMoves;i++){
            Player turn=players.get(i%n);

            while(true){
                Pos pos=takePlayerInput(turn);

                try{
                    rule.checkMove(pos,board);
                    board.markSymbol(pos,turn);
                    if(rule.checkWin(turn,board)){
                        System.out.println(turn.getName()+" won with symbol "+turn.getSymbol());
                        return ;
                    }
                    break;

                }catch (Exception e){
                    System.out.println("Invalid move");
                }
            }
        }
        System.out.println("Draw no one won");
    }
    public void addPlayer(){
        while(players.size()<rule.allowedPlayers()){
            System.out.println("Please enter name for player "+(players.size()+1)+" :");
            String name=sc.nextLine();
            System.out.println("Please enter Symbol for player "+(players.size()+1)+" :");
            char ch=sc.next().charAt(0);
            players.add(new Player(name,ch));
            sc.nextLine();

        }
    }
}
