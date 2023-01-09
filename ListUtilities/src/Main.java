import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1,2,18,2, -1);

        Integer maxInteger = ListUtilities.getMax(integers);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", "b", "c");

        String minsString = ListUtilities.getMin(strings);

        System.out.println(maxInteger);
        System.out.println(minsString);

    }
}