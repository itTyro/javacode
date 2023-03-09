package Task;

public class Task6 {
    //请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
    // 例如："abcba"、"上海自来水来自海上"均为对称字符串。
    public static void main(String[] args) {
        String strA = "hdfafi";
        String strB = "上海自来水来自海上";
        boolean flag = symStr(strA);
        if (flag) {
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }

    }

    //判断字符串是否为对称字符串
    public static boolean symStr(String str) {
        //利用StringBuilder的reverse方法对字符串进行颠倒
        StringBuilder sb = new StringBuilder(str);
        String newStr = sb.reverse().toString();
        //再用字符串的equals方法对反转后的字符串和原字符串进行比较
        boolean flag = str.equals(newStr);
        return flag;
    }
}
