public class intPractice {
    public static void main(String[] args) {
        Integer a = 12;
        Integer b = 12;
        int a2 = 12;
        int b2 = 12;

        System.out.println(a == b);     // true
        System.out.println(a2 == b2);   // true

        Integer c = new Integer(12);
        Integer d = new Integer(12);

        System.out.println(c == d);     // false

        System.out.println(a == c);     // false
        System.out.println(a == d);     // false
        System.out.println(a2 == c);    // true
        System.out.println(a2 == d);    // true

        Integer aa = 128;
        Integer bb = 128;

        System.out.println(aa == bb);     // false

    }
}
