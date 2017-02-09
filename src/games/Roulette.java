package games;

import engine.Combinations;
import engine.GameScore;


import java.io.BufferedReader;
import java.io.IOException;


/**
 * Created by Ярослав on 08.02.2017.
 */
public class Roulette extends Game {
    private String RED = "Red";
    private String BLACK = "Black";
    private int CHOSEN_COLOR;

    @Override
    public void betResult(Combinations combinations, GameScore gameScore) {
        if (combinations.resultRoulette(CHOSEN_COLOR, random_combination.getRandomColor(RED, BLACK))) {
            gameScore.winBet();
            System.out.println("You win 20 points");
        } else gameScore.loseBet();
        System.out.println("You loose");
    }

    @Override
    public void play(BufferedReader reader) throws IOException {
        System.out.println("Please choise the color: 1 - red,2 - black");
        while (!((CHOSEN_COLOR = Integer.parseInt(reader.readLine())) == 0)) {
            betResult(combinations, gameScore);
            System.out.println("Your score:" + gameScore.getSCORE());
        }
    }
}
