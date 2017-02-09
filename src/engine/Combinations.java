package engine;


import java.util.ArrayList;


public class Combinations {

    public boolean resultSlotGame(ArrayList<Integer> listCombination) {

        int firstSlot = listCombination.get(0);
        int secondSlot = listCombination.get(1);
        int thirdSlot = listCombination.get(2);
        boolean result;
        if (firstSlot == secondSlot && firstSlot == thirdSlot) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean resultRoulette(int choise, String color) {
        String RED = "Red";
        String BLACK = "Black";
        if (choise == 1) {
            if (RED.equals(color)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (BLACK.equals(color)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
