package menu;

import games.Game;
import games.Roulette;
import games.Slots;

import java.io.BufferedReader;
import java.io.IOException;

public class GameMenu {
    private int gameMode;

    public GameMenu(BufferedReader reader) throws IOException {
        rules();
        gameMode = Integer.parseInt(reader.readLine());
    }

    public Game game() {
        if (gameMode == 1) {
            return new Roulette();
        } else {
            return new Slots();
        }
    }

    private void rules() {
        String rules = "welcome to the games machines\n" +
                "you will be credited 500 points\n" +
                "Winning combination:\n" +
                "Slots game:\n"+
                "3 the same slots in a row = your bet x2\n" +
                "Roulette game:\n"+
                "if the color is played = your bet x2\n"+
                "to end the game, enter 0 and press Enter\n" +
                "Select a game from the proposed\n" + "Press 1 - Roulette," + "2 - Slots.Select nummber and press Enter:";
        System.out.println(rules);
    }
}

