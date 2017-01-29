package slots;
public abstract class SlotShape {
    public void draw(String[] a) {
        for (String q : a) {
            System.out.println(q);
        }
    }

    public abstract String[] picture();
}
