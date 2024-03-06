package org.example;

public class Bidder implements Colleague{

    private String name;

    public AuctionBid auctionBid;

    Bidder(AuctionBid auctionBid,String name){
        this.auctionBid = auctionBid;
        auctionBid.addCollege(this);
        this.name = name;
    }

    @Override
    public void placeBid(int price) {
        auctionBid.changeBidPrice(this,price);
    }

    @Override
    public void getNotification(int newPrice,String name) {
        System.out.println("Hello "+this.name+" Bid is changed and the new price is "+newPrice+" and placed by "+name);
    }

    public String getName(){
        return this.name;
    }
}
