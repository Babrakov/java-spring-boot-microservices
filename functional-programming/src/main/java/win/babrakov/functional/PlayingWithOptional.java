package win.babrakov.functional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "banana", "grape", "kiwi");

        Predicate<String> predicate = fruit -> fruit.startsWith("c");

        Optional<String> optional = fruits.stream()
                .filter(predicate)
                .findFirst();

        System.out.println(optional);
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
        System.out.println(optional.get());

        Optional<String> of = Optional.of("apple");
        Optional<String> empty = Optional.empty();

    }

}
