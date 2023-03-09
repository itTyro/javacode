package Demo;

public class Demo2 {
    public static void main(String[] args) {
        compare((byte) 2,(byte) 3);
    }
    public static void compare(byte a1,byte a2) {
        System.out.println(a1 == a2);
    }
    public static void compare(short a1,short a2) {
        System.out.println(a1 == a2);
    }
}
