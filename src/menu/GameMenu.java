package menu;

import games.Game;
import games.Roulette;
import games.Slots;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameMenu {
    private int result_choise;

    public GameMenu(BufferedReader reader) throws IOException {
        rules();
        result_choise = Integer.parseInt(reader.readLine());
    }

    public Game game() {
        if (result_choise == 1) {
            return new Roulette();
        } else {
            return new Slots();
        }
    }

    private void rules() {
        String rules = "welcome to the games machines\n" +
                "you will be credited 500 points\n" +
                "Winning combination:\n" +
                "3 the same games in a row = your bet x2\n" +
                "if the color is played = your bet x2\n"+
                "to end the game, press 0 and press Enter\n" +
                "the game will start after you do choose to bet and press Enter\n" +
                "Select a game from the proposed\n" + "Press 1 - Roulette," + "2 - Slots.Select nummber and press Enter:";
        System.out.println(rules);
    }
}

