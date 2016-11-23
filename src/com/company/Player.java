package com.company;

import javax.lang.model.element.Name;

/**
 * Created by falyanguzov on 09.11.2016.
 */
public abstract class Player {
    public int bet;
    public int activeBet;
    Hand hand = new Hand();
    PlayerState state;
    String name = new String();
    private Intellect intellect;

    public Player(Intellect intellect, String name) {
        this.intellect = intellect;
        this.name = name;
    }

    public void take(Card current) {
        hand.add(current);
    }


    public Command decision() {

        return intellect.decideWithoverdraftCheck(hand.countScore());
    }
}
