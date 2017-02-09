package games;

import engine.Combinations;
import engine.GameScore;


import java.io.BufferedReader;
import java.io.IOException;

public class Roulette extends Game {
    private String RED = "Red";
    private String BLACK = "Black";
    private int CHOSEN_COLOR;
    private String RANDOM_COLOR;
    private  String getColor() {
        if (CHOSEN_COLOR == 1) {
            return RED;
        } else {
            return BLACK;
        }
    }

    @Override
    public void betResult(Combinations combinations, GameScore gameScore) {
        if (combinations.resultRoulette(getColor(), RANDOM_COLOR)) {
            gameScore.winBet();
            System.out.println("You win 20 points");
        } else {
            gameScore.loseBet();
            System.out.println("You loose");
        }
    }

    @Override
    public void play(BufferedReader reader) throws IOException {
        System.out.println("Please choose the color: 1 - red,2 - black");
        while (!((CHOSEN_COLOR = Integer.parseInt(reader.readLine())) == 0)) {
            RANDOM_COLOR = getRandomCombination().getRandomColor(RED,BLACK);
            betResult(getCombinations(), getGameScore());
            System.out.println("Your score:" + getGameScore().getSCORE());
            System.out.println("Please choose the color: 1 - red,2 - black");
        }
    }
}
