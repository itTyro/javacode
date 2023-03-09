package demo1;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("输入一个整数");
        int a = number.nextInt();
        if (a > 0 && a <= 100) {

            if (a % 2 == 1) {
                System.out.println("左侧");
            } else
                System.out.println("右侧");
        }else
            System.out.println("假票");
    }
}
