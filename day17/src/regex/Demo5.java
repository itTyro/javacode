package regex;

public class Demo5 {
    public static void main(String[] args) {
        String str = "我要学学编编编程程程程程";
        String regex1 = "(.)\\1+";
        String result = str.replaceAll(regex1, "$1");
        System.out.println(result);
    }
}
