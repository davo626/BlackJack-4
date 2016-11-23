package com.company;

import java.util.Scanner;

/**
 * Created by student4 on 23.11.16.
 */
public class HumanBet extends Bet {
    static Scanner in = new Scanner(System.in);
    public Command makeBet(int bet){
        do {
            System.out.println("Your bet: ");
            int activeBet = in.nextInt();
            if(activeBet<=bet){
                return activeBet
            }else
                System.out.println("Uncorrect bet");
        }while(true)
    }
}
