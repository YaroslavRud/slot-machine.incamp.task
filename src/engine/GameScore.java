package engine;

public class GameScore {
    private int SCORE = 500;
    private int BET = 20;

    public int getSCORE() {
        return SCORE;
    }

    public void winBet() {
        SCORE = SCORE + BET;
    }

    public void loseBet() {
        if (SCORE != 0) {
            SCORE = SCORE - BET;
        } else {
            System.out.println("Game over");
            System.exit(0);
        }
    }
}
