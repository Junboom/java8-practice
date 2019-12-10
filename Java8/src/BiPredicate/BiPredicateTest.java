package BiPredicate;

import java.util.*;
import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String[] args) {
        BiPredicate<String, String> bp = (text, prefix) -> text.startsWith(prefix);

        if (bp.test("Apple", "A"))
            System.out.println("Apple starts with 'A'");
        if (bp.test("apple", "A"))
            System.out.println("apple starts with 'A'");

        String[] strings = {"a", "b", "c", "d", "e"};
        List<String> list = Arrays.asList(strings);
        list.forEach(text -> System.out.println(text));
        list.forEach(System.out::println);
    }
}
