package task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int number = sc.nextInt();
        int a = count(number);
        System.out.println(a);
    }
    public static int count(int number) {
        int sum = 0;
        for (int i = 0;number != 0;i++){
            number = number / 10;
            sum++;
        }
        return sum;
    }
}
