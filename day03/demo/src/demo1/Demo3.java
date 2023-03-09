package demo1;

public class Demo3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        boolean c = a++ < 9 & b++ < 9;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        boolean d = a++ > 9 && b++ < 9;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
    }
}
