package homeWork.homeWork9.task3;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task3Main {

    public static void main(String[] args) {
        System.out.println(arrayToMap(new Integer[]{1, 2, 4, 4, 5}));
    }

    private static <K> Map<K, Integer> arrayToMap (K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        Arrays.stream(ks).forEach(x -> map.compute(x, (k, v) -> v == null ? 1 : v + 1));
        return map;
    }
}
