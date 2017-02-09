import games.Game;

import menu.GameMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        GameMenu menu = new GameMenu(reader);
        Game game = menu.game();
        game.play(reader);
    }
}
