import engine.SpinSlot;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        SpinSlot spin = new SpinSlot();
        spin.work();
    }
}
