package BiFunction;

import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> bf = (text, repeat) -> {
            StringBuilder sb = new StringBuilder();
            for (int n = 0; n < repeat; ++n) {
                sb.append(text);
                sb.append("\n");
            }
            return sb.toString();
        };
        System.out.println(bf.apply("100", 5));
    }
}
