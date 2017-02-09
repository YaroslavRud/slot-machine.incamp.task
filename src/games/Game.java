package games;

import engine.Combinations;
import engine.GameScore;
import engine.Randomizer;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Ярослав on 08.02.2017.
 */
public abstract class Game {
    Randomizer random_combination = new Randomizer();
    GameScore gameScore = new GameScore();
    Combinations combinations = new Combinations();
    public abstract void betResult(Combinations combinations, GameScore gameScore);

    public abstract void play(BufferedReader reader) throws IOException;

}
