package test;

public class Test3 {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(toBinaryString(num));
    }

    private static String toBinaryString(int num) {
        StringBuilder sb= new StringBuilder();
        
        while (true) {
            if (num == 0) {
                break;
            }
            int remainder = num % 2;
            sb.insert(0,remainder);
            num = num / 2;
        }
        return sb.toString();
    }
}
