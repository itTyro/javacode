package regex;

public class Demo1 {
    public static void main(String[] args) {
        //校验手机号码
        String str1 = "17350634283";
        boolean result1 = str1.matches("1[3-9]\\d{9}");
        System.out.println(result1);

        String str2 = "020-35433";
        boolean result2 = str2.matches("[0]\\w{5,}");
        System.out.println(result2);
    }
}
