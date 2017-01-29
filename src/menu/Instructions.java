package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Instructions {
    private String name;
    private String originalName;
    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Instructions() throws IOException {
        System.out.println("Enter your name,please");
        originalName = reader.readLine();
        while (originalName.equals("")) {
            System.out.println("Enter your name,please");
            originalName = reader.readLine();
        }
        name = originalName.substring(0, 1).toUpperCase() + originalName.substring(1);
        information();
    }

    private void information() {
        String[] rules = {name + ",welcome to the slots machines\n" +
                "you will be credited 500 points\n" +
                "you can choose one of the bets:10,20,50 or 100 points\n" +
                "Winning combination:\n" +
                "3 the same slots in a row = your bet x3\n" +
                "2 the same slots in a row + slot cherry = your bet x3\n" +
                "2 the same slots in a row = your bet x2 \n" +
                "to end the game, press 0 and press Enter\n" +
                "if you want change bet,enter a new bet during the game\n" +
                "the game will start after you do choose to bet and press Enter"};
        for (String s : rules) {
            System.out.println(s);
        }
    }
}
