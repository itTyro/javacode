package Demo;

public class Demo5 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number);
        number = change(number);
        System.out.println(number);
    }
    public static int change(int number) {
        number = 100;
        return number;
    }
}
