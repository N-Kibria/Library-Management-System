import java.util.HashMap;
import java.util.Map;

public class IdGenerator {
    private static final Map<Class<?>, Integer> lastIds = new HashMap<>();

    public static synchronized int generateId(Class<?> classes) {
        Integer lastId = lastIds.getOrDefault(classes, 100);
        lastId++;
        lastIds.put(classes, lastId);
        return lastId;
    }
}
