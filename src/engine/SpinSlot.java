package engine;

import menu.Instructions;
import slots.Apple;
import slots.Cherry;
import slots.Plam;
import slots.SlotShape;

import java.io.IOException;
import java.util.ArrayList;

public class SpinSlot extends Combinations {
    private Instructions startingGame;
    private Randomizer randomizer = new Randomizer();
    private SlotShape slot = null;

    public SpinSlot() throws IOException {
        startingGame = new Instructions();
    }

    private void rotate() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            slot = randomizer.getSlot();
            writeCombination(slot);
            slot.draw(slot.picture());
            Thread.sleep(1000);
        }
    }

    public void work() throws InterruptedException, IOException {
        int gameScore = 500;
        int winnerBet;
        System.out.println("Enter bet:");
        int bet = checkBet(startingGame.reader.readLine());
        while (!(startingGame.reader.readLine()).equals("0")) {
            rotate();
            gameScore = gameScore - bet;
            winnerBet = resultBet(bet);
            gameScore = gameScore + winnerBet;
            System.out.println("You won:" + winnerBet);
            System.out.println("Total score:" + gameScore);
            listCombination.clear();
        }
        System.out.println("You win:" + gameScore + " points");
        startingGame.reader.close();
    }

    private int checkBet(String bet) throws IOException {
        String q;
        if (bet.equals("10") || bet.equals("20") || bet.equals("30") || bet.equals("50") || bet.equals("100")) {
            System.out.print("Bet is adopted.To start the game, press Enter");
            q = bet;
        } else {
            String wrongBet;
            System.out.println("Wrong bet.Please enter one of the proposed bets:10,20,30,50 or 100");
            while (!((wrongBet = startingGame.reader.readLine()).equals("10") || wrongBet.equals("20")
                    || wrongBet.equals("30") || wrongBet.equals("50") || wrongBet.equals("100"))) {
                System.out.println("Wrong bet.Please enter one of the proposed bets:10,20,30,50 or 100");
            }
            q = wrongBet;
            System.out.print("Bet is adopted.To start the game, press Enter");
        }
        return Integer.parseInt(q);
    }
}

