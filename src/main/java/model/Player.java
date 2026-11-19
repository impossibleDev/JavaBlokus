package model;

import shared.CardTypes;
import shared.GameConstants;
import shared.Team;

public class Player {
    Team team;
    CardTypes[] deck = new CardTypes[GameConstants.deckSize];
//    Card[] deck;
//    double time;

    public Player(Team team){
        deck[0] = CardTypes.SKIP;
//        deck[1] = CardTypes.BOMB;
        deck[2] = CardTypes.BOMB;
        deck[3] = CardTypes.SKIP;
    }

    public CardTypes[] getDeck(){
        return deck;
    }


}
