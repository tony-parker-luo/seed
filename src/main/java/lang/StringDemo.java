package lang;

public class StringDemo {
    public static void main(String[] args) {
        String a = "dream";
        String b = "dream";
        String c = "d" + "ream";
        String d = new String("dream");
        String e = "d" + new String("ream");

        System.out.println(a == b); // true
        System.out.println(a == c); // true
        System.out.println(a == d); // false
        System.out.println(a.equals(d)); // true
        System.out.println(c == e); // false
        System.out.println(c.equals(e)); // true

    }
}
