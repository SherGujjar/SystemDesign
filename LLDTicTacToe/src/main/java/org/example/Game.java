package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    Deque<Player> players;

    Board board;

    public Game(){
        players = new LinkedList<>();
        initialiseGame();
    }


    private void initialiseGame(){
        board = new Board(3);
        Player p1 = new Player("Palyer1",new PieceX());
        Player p2 = new Player("Player2",new PieceO());
        players.addFirst(p1);
        players.addLast(p2);
        startGame(board.playingBoard);
    }


    public void startGame(PlayingPiece[][] playingBoard){
        boolean noWinner = true;

        while(noWinner){
            printBaordStatus(playingBoard);
            Player currentPlayer = players.getFirst();
            players.pop();
            System.out.println(currentPlayer.getName()+" Please enter row and col");
            Scanner s = new Scanner(System.in);
            int x = s.nextInt();
            int y = s.nextInt();
            if(isValidPlace(x,y,playingBoard)){
                playingBoard[x][y] = currentPlayer.piece;
                players.addLast(currentPlayer);
            }
            else{
                players.addFirst(currentPlayer);
                continue;
            }
            if(checkIsThereSomeWinner(playingBoard)){
                System.out.println(currentPlayer.getName()+" is the winner");
                noWinner = false;
            }
            else if(allPlacesOccupied(playingBoard)){
                System.out.println("Game is Tied");
                noWinner = false;
            }
        }
    }

    private boolean allPlacesOccupied(PlayingPiece[][] playingBoard) {
        for(int i=0;i<playingBoard.length;i++){
            for(int j=0;j<playingBoard[0].length;j++){
                if(playingBoard[i][j]==null){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkIsThereSomeWinner(PlayingPiece[][] playingBoard) {
        // check if any row are same;
        for(int i=0;i<playingBoard.length;i++){
            int countX = 0;
            int countO = 0;
            for(int j=0;j<playingBoard[0].length;j++){
                if(playingBoard[i][j]!=null && playingBoard[i][j].pieceType==PieceType.X){
                    countX++;
                }
                else if( playingBoard[i][j]!=null && playingBoard[i][j].pieceType==PieceType.O){
                    countO++;
                }
            }
            if(countO==playingBoard.length || countX==playingBoard.length){
                return true;
            }
        }

        // check if any column are same
        for(int j=0;j<playingBoard.length;j++){
            int countX = 0;
            int countO = 0;
            for(int i=0;i<playingBoard[0].length;i++){
                if(playingBoard[i][j]!=null && playingBoard[i][j].pieceType==PieceType.X){
                    countX++;
                }
                else if(playingBoard[i][j]!=null && playingBoard[i][j].pieceType==PieceType.O){
                    countO++;
                }
            }
            if(countO==playingBoard.length || countX==playingBoard.length){
                return true;
            }
        }

        // check if any diagonal are same
        // main diagonal
        for(int i=0,j=0;i< playingBoard.length;i++,j++){
            int countX = 0;
            int countO = 0;
            if(playingBoard[i][j]!=null && playingBoard[i][j].pieceType==PieceType.X){
                countX++;
            } else if (playingBoard[i][j]!=null && playingBoard[i][j].pieceType==PieceType.O) {
                countO++;
            }
            if(countO==playingBoard.length || countX==playingBoard.length){
                return true;
            }
        }

        // another diagonal
        for(int i=0,j=playingBoard.length-1;j>=0;i++,j--){
            int countX = 0;
            int countO = 0;
            if(playingBoard[i][j]!=null && playingBoard[i][j].pieceType==PieceType.X){
                countX++;
            } else if (playingBoard[i][j]!=null && playingBoard[i][j].pieceType==PieceType.O) {
                countO++;
            }
            if(countO==playingBoard.length || countX==playingBoard.length){
                return true;
            }
        }

        return false;
    }

    private boolean isValidPlace(int row,int col,PlayingPiece[][] playingBoard) {
        if(playingBoard[row][col]!=null){
            return false;
        }
        return true;
    }

    private void printBaordStatus(PlayingPiece[][] playingBoard){
        for(int i=0;i<playingBoard.length ;i++){
            for(int j=0;j< playingBoard[0].length;j++){
                if(playingBoard[i][j]==null){
                    System.out.print(" ");
                }
                else{
                    System.out.print(playingBoard[i][j].pieceType);
                }
                if(j!=playingBoard[0].length-1)
                    System.out.print("|");

            }
            System.out.println();
            if(i!=playingBoard.length-1)
                System.out.println("--------");
        }
    }


}
