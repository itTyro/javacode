package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("输入一个整数");
        int a = number.nextInt();
        int i ;
        for (i = 1;i < a; i++){
            if (i * i>a){

                break;
            }
            System.out.println(i);
        }
    }
}
