package com.company;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class STGame {
    private static final int Num_Cards_to_Deal = 8;
    public int numPlayers;
    private int dealerID;
    public static STDeck deck = new STDeck();


    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;
        this.deck = new STDeck();


    }

    public static int getDealer(int numPlayers) {

        int dealerID;
        //int numPlayers;
        Random randdealerID = new Random();
        int n = randdealerID.nextInt((numPlayers) + 1);
        dealerID = n;
        JOptionPane.showMessageDialog(null, "Dealer is player " + dealerID);
        return dealerID;
    }

    public static void dealRandomCardsToEachPlayer(int numPlayers) {

        STPlayer[] players = new STPlayer[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new STPlayer("player ID = " + i);
        }

        for (STPlayer player : players) {
            ArrayList <STCard> Cards = deck.dealCard(8);
            player.setCards(Cards);
}


    }

}
