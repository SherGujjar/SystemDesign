package org.example;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediater implements AuctionBid{

    List<Colleague> biddersList = new ArrayList<>();

    @Override
    public void changeBidPrice(Colleague colleague, int price) {
        for(Colleague bidder : biddersList){
            if(!bidder.getName().equalsIgnoreCase(colleague.getName())){
                bidder.getNotification(price,colleague.getName());
            }
        }
    }

    @Override
    public void addCollege(Bidder bidder) {
        biddersList.add(bidder);
    }
}
