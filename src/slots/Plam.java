package slots;

public class Plam extends SlotShape {
    private String plam = "       *    *  *\n" +
            "    *              *       * *\n" +
            "  *               *   ****\n" +
            "     *    *   *           ****\n";

    @Override
    public String picture() {
        return plam;
    }
}
