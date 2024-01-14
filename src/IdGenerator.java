import java.util.Random;

public class IdGenerator {
    public static int generateId() {
        Random random = new Random();

        return 100000 + random.nextInt(900000);
    }
}
