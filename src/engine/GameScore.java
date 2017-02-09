package engine;

/**
 * Created by Ярослав on 08.02.2017.
 */
public class GameScore {
    public int getSCORE() {
        return SCORE;
    }

    private int SCORE = 500;
    private int BET = 20;

    public void winBet() {
        this.SCORE = this.SCORE + BET;
    }

    public void loseBet() {
        if (SCORE != 0) {
            this.SCORE = this.SCORE - BET;
        }
        else {
            System.out.println("Game over");
            System.exit(0);
        }
    }
}
