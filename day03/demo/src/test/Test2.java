package test;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你猜的数字");
        //int number1 = sc.nextInt();
        for (int i = 0; i < 100; i++) {
            int number1 = sc.nextInt();
            if(number > number1){
                System.out.println("输入的太小了");

            }else if(number < number1){
                System.out.println("您输入的数字太大了");

            }else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
