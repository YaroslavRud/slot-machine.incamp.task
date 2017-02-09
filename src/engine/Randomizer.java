package engine;

import java.util.Random;

public class Randomizer extends Random {

    public String getRandomSlot(String apple, String plum, String cherry) {
        String slot;
        if (nextInt(2) == 1) {
            slot = apple;
        } else if (nextInt(2) == 0) {
            slot = cherry;
        } else {
            slot = plum;
        }
        return slot;
    }

    public String getRandomColor(String RED, String BLACK) {
        String color;
        if (nextInt(2) == 1) {
            color = RED;
        } else {
            color = BLACK;
        }
        return color;
    }
}
