import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 1, 2, 2, 3, 4, 4, 4};
        showElementsAmount(array);
    }

    private static void showElementsAmount(Integer[] array) {
        Arrays.stream(array)
                .collect(Collectors.groupingBy(integer -> integer))
                .forEach((k, v) -> System.out.println(k + " size = " + v.size()));
    }
}
