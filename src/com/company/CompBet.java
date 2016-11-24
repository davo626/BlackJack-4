package com.company;

import java.util.Scanner;

/**
 * Created by student4 on 24.11.16.
 */
public class CompBet extends Bet {
    static Scanner in = new Scanner(System.in);

    public int CompBet() {
        this.bet=bet;
        this.activeBet=bet/2;
        return  activeBet;
    }
}
