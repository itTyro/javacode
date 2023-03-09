package Demo;

import java.util.Scanner;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        String newStr = new StringBuilder(str).reverse().toString();

        //equals()比较字符串内容是否相等
        if (str.equals(newStr)) {
            System.out.println("当前字符串是对称字符串");
        } else {
            System.out.println("当前字符串不是对称字符串");
        }
    }
}
