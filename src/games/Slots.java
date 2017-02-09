package games;

import engine.Combinations;
import menu.GameScore;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Slots extends Game {
    private ArrayList<Integer> listCombination = new ArrayList<>();
    private String plum = "       *    *  *\n" +
            "    *              *       * *\n" +
            "  *               *   ****\n" +
            "     *    *   *           ****\n";
    private String cherry = " ****        ****\n" +
            "       **  *\n" +
            "         **\n" +
            "            * \n" +
            "             **\n" +
            "          *      *\n" +
            "     *  * *       *  * *      \n" +
            "   *      * \t *      *\n" +
            "     ** *         * * *\n";
    private String apple = "        ***\n" +
            "            *\n" +
            "    *    *   *    *\n" +
            "  *                  *\n" +
            "  *                  *\n" +
            "   *              *\n" +
            "      *   *   *      \n";

    private void spinSlot() {
        String slot;
        for (int i = 0; i < 3; i++) {
            slot = getRandomCombination().getRandomSlot(apple, plum, cherry);
            drawSlot(slot);
            writeCombination(slot);
        }
    }

    private void drawSlot(String a) {
        System.out.println(a);
    }

    private void writeCombination(String slot) {
        if (slot.equals(plum)) {
            listCombination.add(1);
        }
        if (slot.equals(apple)) {
            listCombination.add(2);
        }
        if (slot.equals(cherry)) {
            listCombination.add(3);
        }
    }

    @Override
    public void betResult(Combinations e, GameScore a) {
        if (e.resultSlotGame(listCombination)) {
            a.winBet();
            System.out.println("You win 20 points");
        } else {
            a.loseBet();
            System.out.println("You loose");
        }
    }

    @Override
    public void play(BufferedReader reader) throws IOException {
        System.out.println("Welcome to slot-machine game!\n" + "Press enter and game will begin");
        while (!((reader.readLine()).equals("0"))) {
            spinSlot();
            betResult(getCombinations(), getGameScore());
            System.out.println("Your score:" + getGameScore().getSCORE());
            listCombination.clear();
        }
    }
}
