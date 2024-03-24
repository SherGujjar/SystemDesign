package org.example;

public class Player {
    private String name;
    public PlayingPiece piece;

   public Player(String name,PlayingPiece piece){
       this.name = name;
       this.piece = piece;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
