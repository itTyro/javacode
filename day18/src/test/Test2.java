package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入");
            String str = sc.nextLine();
            if (!str.matches("[1-9]\\d{0,9}")) {
                System.out.println("输入的位数不符合要求,请重新输入");
                continue;
            }



            int result = 0;
            for (int i = 0; i < str.length(); i++) {
                int number = str.charAt(i) - '0';
                result = result * 10 + number;
            }
            System.out.println(result);
            break;
        }
    }
}
