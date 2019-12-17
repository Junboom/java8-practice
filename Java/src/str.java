public class str {
    public static void main(String[] args) {
        String a = "hi";    // new String("hi").inter();
                            // 상수풀에 생성 후 주소를 반환

        String b = "hi";    // 주소를 반환

        String c = new String("hi");    // hi 생성

        System.out.println(a == b);         // true
        System.out.println(a == c);         // false
        System.out.println(a.equals(b));    // true
        System.out.println(a.equals(c));    // true

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        String aa = "hi";
        String bb = "hi";
        String cc = "hi@wemakeprice.com";

        System.out.println(aa==bb.substring(0, 2));     // true
        System.out.println(aa==cc.substring(0, 2));     // false
    }
}
