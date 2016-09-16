package com.company;
import javax.swing.*;
import java.util.Random;

public class  Main {

    public static void main(String[] args) {
        int startMenusChoice = 0;
        int getNumPlayers=1;


        showWelcome();
        startMenus();
        startNewGame();

       // getDealer();





    }

    public static void startNewGame() {

        int numPlayers = getNumPlayers();
        int dealerid  = STGame.getDealer(numPlayers);
        STGame game = new STGame(numPlayers);
        STGame.dealRandomCardsToEachPlayer(numPlayers);


    }

   /* public static int getDealer(int numPlayers) {
        int dealerID =0;
        //int numPlayers;
       Random randdealerID = new Random();
        int  n = randdealerID.nextInt((numPlayers) + 1);
        dealerID =n;
        JOptionPane.showMessageDialog(null,"Dealer is player " + dealerID);
        return dealerID;
    }*/

    public static int getNumPlayers() {
        String numPlayersString = null;
        numPlayersString = JOptionPane.showInputDialog(null, "Lets Begin \nEnter how many players");
        int numPlayers = Integer.parseInt(numPlayersString);
        return numPlayers;
    }

    private static boolean startMenus() {
        String startChoiceString = null;
        boolean startmenusStatus = false;
        while (startmenusStatus != true) {
            startChoiceString = JOptionPane.showInputDialog("(?)Instructions \n(N)New Game \n(E)Exit");
            if (startChoiceString.equalsIgnoreCase("?")) {
                showInstructions();
            }
            if (startChoiceString.equalsIgnoreCase("n")) {
                startmenusStatus = true;
                return startmenusStatus;
            }
            if (startChoiceString.equalsIgnoreCase("e")) System.exit(0);
            else {
            }
        }
        return startmenusStatus;
    }

    private static void showInstructions() {
        JOptionPane.showMessageDialog(null, "GO well is the instruction");
    }

    private static void showWelcome() {
        JOptionPane.showMessageDialog(null, "Welcome to Mineral Super Trumps Game");
    }
}
