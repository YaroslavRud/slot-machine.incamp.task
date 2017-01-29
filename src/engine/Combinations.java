package engine;

import slots.Apple;
import slots.Cherry;
import slots.Plam;
import slots.SlotShape;

import java.util.ArrayList;

public class Combinations {
    protected ArrayList<Integer> listCombination = new ArrayList<>();
    private int looseBet = 0;
    private int firstSlot;
    private int secondSlot;
    private int thirdSlot;

    public int resultBet(int bet) {
        firstSlot = listCombination.get(0);
        secondSlot = listCombination.get(1);
        thirdSlot = listCombination.get(2);
        if (firstSlot == secondSlot && firstSlot == thirdSlot) {
            return bet * 3;
        }
        if ((firstSlot == 3 && secondSlot == thirdSlot) || (firstSlot == secondSlot && thirdSlot == 3)) {
            return bet * 3;
        }
        if ((firstSlot != secondSlot && secondSlot == thirdSlot) || (firstSlot != thirdSlot && firstSlot == secondSlot)) {
            return bet * 2;
        }
        else {
            return looseBet;
        }
    }

    protected void writeCombination(SlotShape slot) {
        if (slot instanceof Apple) {
            listCombination.add(1);
        }
        if (slot instanceof Plam) {
            listCombination.add(2);
        }
        if (slot instanceof Cherry) {
            listCombination.add(3);
        }
    }
}
