package com.company;

import java.util.ArrayList;
import java.util.Random;


public class STDeck {
    private static final int NUM_CARDS_INIT = 60;
    private ArrayList <STCard> cards;

    public STDeck(){
       cards = new  ArrayList <STCard>(NUM_CARDS_INIT);
        for (int i = 0; i < cards.size(); i++) {
             cards.add(new STCard(i));

        }
    }

    public ArrayList<STCard> dealCard(int numCards)
    {  
        ArrayList <STCard> res = new ArrayList <STCard>();

        for (int i = 0; i < numCards; ++i) {
            int idx;
            idx = new Random().nextInt(cards.size());
            System.out.println(idx);
            STCard card = cards.remove(idx);
            res.add(card);
            System.out.println(" Card" + card);
        }
        return cards;
    }
    }
