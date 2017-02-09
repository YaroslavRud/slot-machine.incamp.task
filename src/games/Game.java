package games;

import engine.Combinations;
import menu.GameScore;
import engine.Randomizer;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class Game {
   private Randomizer randomCombination = new Randomizer();
   private GameScore gameScore = new GameScore();
   private Combinations combinations = new Combinations();

    public abstract void betResult(Combinations combinations, GameScore gameScore);

    public GameScore getGameScore() {
        return gameScore;
    }

    public Combinations getCombinations() {
        return combinations;
    }

    public abstract void play(BufferedReader reader) throws IOException;

    public Randomizer getRandomCombination() {
        return randomCombination;
    }
}
