package games;

import engine.Combinations;
import engine.GameScore;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public class Slots extends Game {

    private ArrayList<Integer> listCombination = new ArrayList<>();
    GameScore gameScore = new GameScore();
    Combinations combinations = new Combinations();
    private String palm = "       *    *  *\n" +
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

    public void spinSlot() {
        String slot;
        for (int i = 0; i < 3; i++) {
            slot = random_combination.getRandomSlot(apple,palm,cherry);
            drawSlot(slot);
            writeCombination(slot);
        }

    }
    public void drawSlot(String a){
        System.out.println(a);

    }

    protected void writeCombination(String slot) {
        if (slot.equals(palm)) {
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
    public void betResult(Combinations e, GameScore a)  {
 if (e.resultSlotGame(listCombination)){
     a.winBet();
     System.out.println("You win 20 points");
 }
else {
    a.loseBet();
     System.out.println("You loose");
}
    }

    @Override
    public void play(BufferedReader reader) throws IOException {
        String exit;
        System.out.println("Welcome to slot-machine game!\n"+"Press enter and game will begin");
        while (!((exit = reader.readLine()).equals("0"))) {
            spinSlot();
            betResult(combinations,gameScore);
            System.out.println("Your score:"+gameScore.getSCORE());
            listCombination.clear();
        }
    }
}
