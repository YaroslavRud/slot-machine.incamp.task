package engine;


import java.util.Random;

public  class Randomizer {
    private Random random = new Random();

    public String getRandomSlot(String apple,String plum,String cherry) {
        String slot;
        if (random.nextInt(2) == 1) {
           slot = apple;
        } else if (random.nextInt(2) == 0) {
            slot = cherry;
        } else {
            slot = plum;
        }
        return slot;
    }
    public String getRandomColor(String RED,String BLACK){
        String color;
        if (random.nextInt(1) == 1) {
            color = RED;
        }
        else {
            color = BLACK;
        }
        return color;

    }
}
