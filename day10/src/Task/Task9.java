package Task;

public class Task9 {
    public static void main(String[] args) {
        //给定两个字符串表示非负整数,,返回两个字符串的乘积,乘积也用字符串表示

        String num1 = "12345";
        String num2 = "6789";

        System.out.println(product(num1,num2));
        System.out.println(product2(num1,num2));

    }
    //利用字符数组
    public static String product(String num1,String num2) {
        //转为字符数组
        char[] c1 = num1.toCharArray();
        char[] c2 = num2.toCharArray();
        int nub1 = 0;
        int nub2 = 0;
        for (int i = 0; i < c1.length; i++) {
            //转为数字
            int ge = c1[i] - 48;
            nub1 = nub1 * 10 + ge;
        }
        for (int i = 0; i < c2.length; i++) {
            //转为数字
            int ge = c2[i] - 48;
            nub2 = nub2 * 10 + ge;
        }

        int sum = nub1 * nub2;

        //利用StringBuilder的append方法和toString将数字转为字符串
        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        String str = sb.toString();

        //or
        //String str = sum + "";
        return str;
    }

    public static String product2(String num1, String num2) {
        int nub1 = 0;
        int nub2 = 0;
        for (int i = 0; i < num1.length(); i++) {
            int ge = num1.charAt(i) - 48;
            nub1 = nub1 * 10 + ge;
        }

        for (int i = 0; i < num2.length(); i++) {
            int ge = num2.charAt(i) - 48;
            nub2 = nub2 * 10 + ge;
        }

        int sum = nub1 * nub2;

        String str = sum + "";

        return str;
    }
}
