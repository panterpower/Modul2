import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework2 {
    public static void main(String[] args) {
        //Дан лист
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 8, 8, 9);
        Random random = new Random(1);

        integers.stream()
                .filter(e -> e > 4)
                .distinct()
                .map(e -> new User(e))
                .map(e -> {
                    e.setIntegers(
                            Stream.generate(() -> random.nextInt(10))
                                                        .limit(e.getId())
                                                        .collect(Collectors.toList())
                    );
                    return e;})
                .flatMap(e ->e.getIntegers().stream())
                .map(e -> e * 10)
                .reduce((a, b) -> a +b)
                .ifPresentOrElse(e -> System.out.println(e), () -> System.out.println(0));

    }

}
