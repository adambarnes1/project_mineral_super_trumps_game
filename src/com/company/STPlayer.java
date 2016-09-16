package com.company;

import java.util.ArrayList;


public class STPlayer {
    private ArrayList<STCard> Cards;
    private String playerId;

    public STPlayer(String playerId) {
        this.playerId = playerId;
    }

    public void setCards(ArrayList<STCard> Cards) {
        this.Cards = Cards;
    }
    public String toString(){
        return "Player id "+ playerId;

}}
