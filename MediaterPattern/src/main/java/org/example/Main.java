package org.example;

public class Main {
    public static void main(String[] args) {
        AuctionBid auction1 = new AuctionMediater();
        Bidder bidder1 = new Bidder(auction1,"Sher");
        Bidder bidder2 = new Bidder(auction1,"Vinod");
        Bidder bidder3 = new Bidder(auction1,"Veer");
        bidder1.placeBid(20);
        bidder3.placeBid(30);
        bidder2.placeBid(50);
    }
}