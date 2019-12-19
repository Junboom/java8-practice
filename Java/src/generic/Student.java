package generic;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Student {

    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        list.add(1);
        list2.add(1);
        System.out.println(list);
        System.out.println(list2);

        List integerList = Arrays.asList(1, 2, 3);
        List stringList = Arrays.asList("1", "2", "3");
        integerList = stringList;
        System.out.println(integerList.toArray());

        Stack stack = new Stack();
        stack.add("aa");

        max1(Arrays.asList(1, 2, 3, 2));
        max2(Arrays.asList("a", "b", "c", "a"));
    }

    public <T> void add(T t) {
        System.out.println(t);
    }

    public <T extends Comparable<T>> void max3(List<T> list) {
        T maxValue = list.stream()
                .reduce((a, b) -> a.compareTo(b) > 0 ? a : b)
                .orElseThrow(RuntimeException::new);
        System.out.println(maxValue);
    }

    public static void max1(List<Integer> list) {
        Integer maxValue = list.stream()
                .reduce((a, b) -> a > b ? a : b).orElse(0);
        System.out.println(maxValue);
    }

    public static void max2(List<String> list) {
        String maxValue = list.stream()
                .reduce((a, b) -> a.compareTo(b) > 0 ? a : b).orElse("");
        System.out.println(maxValue);
    }

}
