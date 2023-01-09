import java.util.Collections;
import java.util.List;

public class ListUtilities<T> {
    public static <T extends Comparable<T>> T getMin(List<T> list){
        ensureNonEmpty(list.isEmpty());
        return Collections.min(list);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        ensureNonEmpty(list.isEmpty());
        return Collections.max(list);
    }

    private static void ensureNonEmpty(boolean empty){
        if (empty){
            throw new IllegalArgumentException();
        }
    }
}
