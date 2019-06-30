import java.io.FileNotFoundException;
import java.io.IOException;

public class SystemsProj {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Logic logic = new Logic();
        logic.start();
        logic.readInput();
    }
}
