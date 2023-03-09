package Demo;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int max = 0;
        int min = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 97 && c <= 122) {
                min++;
            }else if (c >= 65 && c <=90) {
                max++;
            }else num++;
        }
        System.out.println("大写出现" + max);
        System.out.println("小写出现" + min);
        System.out.println("数字出现" + num);
    }
}
