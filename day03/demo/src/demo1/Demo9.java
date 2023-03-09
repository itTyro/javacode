package demo1;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("输入一个整数");
        int a = number.nextInt();
        System.out.println("在输入一个整数");
        int b = number.nextInt();
        int n = 1;
        int i = 0;
        while (a >= b) {

           a = a-b;
           i++;
            //System.out.println(a);
        }

        System.out.println(i);
        System.out.println(a);
    }
}
