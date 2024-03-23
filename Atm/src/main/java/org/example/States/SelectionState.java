package org.example.States;

import org.example.Atm;
import org.example.Card;
import org.example.TransactionType;

public class SelectionState extends AtmState{

    @Override
    public void optionSelectionState(Atm atm, Card card, TransactionType type) {
        switch (type){
            case CASH_WITHDRAW : atm.setCurrentState(new CashWithdrawState());
            break;
            case CHECK_BALANCE : atm.setCurrentState(new CheckBalanceState());
            break;
            default: {
                System.out.println("Invalid Option");
                exit(atm);
            }
        }
    }

    @Override
    public void exit(Atm atm){
        removeCardState(atm);
        atm.setCurrentState(new InsertState());
        System.out.println("Exit happens");
    }

    @Override
    public void removeCardState(Atm atm) {
        System.out.println("Please remove your card");
    }

    private void showOperations(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactions();
    }

}
