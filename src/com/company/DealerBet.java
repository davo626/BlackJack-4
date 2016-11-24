package com.company;

/**
 * Created by student4 on 24.11.16.
 */
public class DealerBet extends Bet{
    public int DealerBet() {
        this.bet=bet;
        this.activeBet=bet/2;
        return activeBet;
    }
}
