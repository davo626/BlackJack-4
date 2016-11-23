package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student4 on 17.11.16.
 */
public class Table {
    private Dealer dealer;
    private LinkedList<Player> players;
    public void playerName(){
    }
    public void iniTable(){
        System.out.println("Enter your name");
        String name = HumanIntellect.in.nextLine();
        players = new LinkedList<Player>();
        dealer = new Dealer();

        players.add(new Computer(new LimitIntellect(14)));
        players.add(new Computer(new LimitIntellect(19)));
        players.add(new Human(name));
        players.add(dealer);
    }
    public void  creatingBets(){
        for (Player player : players) {
            player.bet=200;
        }
    }
    public void  makingBets() {

    }
    public void  startRound(){
        for (Player player : players) {
            dealer.deal(player);
            dealer.deal(player);
        }
    }
    public void playRound(){
        for (Player player : players) {
            Command command;
            do {
                System.out.println(player.name + " "+player.activeBet+" "+ player.bet+" " + player.hand.countScore() + ": " + player.hand);
                command = player.decision();
                switch (command) {
                    case HIT:
                        dealer.deal(player);
                        break;
                    case EXIT:
                        System.out.println("Thank you for playing");
                        System.exit(0);
                }
            } while (command != Command.STAND);
        }
    }
    public void decideWinners(){
        for (Player player:players){
            if(player!=dealer) {
                if (player.hand.countScore() > 21)
                    player.state = PlayerState.LOSS;
                else if (dealer.hand.countScore() > 21) {
                    player.state = PlayerState.WIN;

                } else if (dealer.hand.countScore() > player.hand.countScore())
                    player.state = PlayerState.LOSS;
                else {
                    player.state = PlayerState.WIN;

                }
            }



        }
    }
    public void restartGame(){
        System.out.println("Play again?");
    }

}
