package regex;

public class Demo2 {
    public static void main(String[] args) {
        String regex1 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[0-1])\\d{3}([0-9]|(?i)x)";
        System.out.println("350629200305283518".matches(regex1));
    }
}
