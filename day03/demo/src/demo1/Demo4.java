package demo1;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("输入一个整数");
        int a = number.nextInt();
        System.out.println("在输入一个整数");
        int b = number.nextInt();
        boolean c = a == 6 || b == 6;
        boolean sum = (a+b)%6==0;
        System.out.println(c);
        System.out.println(sum);
        System.out.println(11>12?11:12);
    }
}
