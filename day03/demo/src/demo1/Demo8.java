package demo1;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("输入一个整数");
        int a = number.nextInt();
        int temp = a;
        int sum = 0;
        while (a !=0){
            int ge = a%10;
            a = a/10;
            sum = sum*10+ge;
        }
        System.out.println(sum == temp);
    }
}
