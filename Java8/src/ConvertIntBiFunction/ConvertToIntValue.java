package ConvertIntBiFunction;

import java.util.*;
import java.util.function.*;

public class ConvertToIntValue {
    public static void main(String[] args) {
        ConvertIntBiFunction<String, String> func4 = (s1, s2)
                -> Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(func4.convertToIntValue("100", "200"));

        Consumer<String> c = text -> System.out.println(text);
        c.accept("hahaha");

        BiConsumer<String, String> bc = (text1, text2) ->
                System.out.println(text1 + " " + text2);
        bc.accept("a", "b");

        IntConsumer ic = i -> System.out.println(i);
        ic.accept(123);

        ObjIntConsumer oic = (text, i) -> System.out.println(text + "->" + i);
        oic.accept("coffee", 1000);

        Comparator<Integer> com = (i1, i2) -> i1 < i2 ? i2 : i1;

        Function<String, Integer> f = text -> Integer.parseInt(text);
        int num = f.apply("500");
        System.out.println(num);


    }
}
