package org.example;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
    }

    private static void printBaordStatus(Character[][] playingBoard){
        for(int i=0;i<playingBoard.length ;i++){
            for(int j=0;j< playingBoard[0].length;j++){
                if(playingBoard[i][j]==null){
                    System.out.print(" ");
                }
                else{
                    System.out.print(playingBoard[i][j]);
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