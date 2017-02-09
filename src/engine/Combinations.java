package engine;

import java.util.ArrayList;

public class Combinations {

    public boolean resultSlotGame(ArrayList<Integer> listCombination) {
        int firstSlot = listCombination.get(0);
        int secondSlot = listCombination.get(1);
        int thirdSlot = listCombination.get(2);
        return firstSlot == secondSlot && firstSlot == thirdSlot;
    }

    public boolean resultRoulette(String CHOOSEN_COLOR,String RANDOM_COLOR) {return CHOOSEN_COLOR.equals(RANDOM_COLOR);
    }
}
