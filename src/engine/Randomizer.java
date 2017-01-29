package engine;

import slots.Apple;
import slots.Cherry;
import slots.Plam;
import slots.SlotShape;

import java.util.Random;

public class Randomizer {
    private Random random = new Random();

    protected SlotShape getSlot() {
        SlotShape slot;
        if (random.nextInt(2) == 1) {
            slot = new Apple();
        } else if (random.nextInt(2) == 0) {
            slot = new Cherry();
        } else {
            slot = new Plam();
        }
        return slot;
    }
}
