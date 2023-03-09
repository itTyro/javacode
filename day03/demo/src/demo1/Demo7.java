package demo1;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("输入今天星期几");
        int week = day.nextInt();
        switch (week){
            case 1:
                System.out.println("跑步");break;
            case 2:
                System.out.println("游泳");break;
            case 3:
                System.out.println("慢走");break;
            case 4:
                System.out.println("动感单车");break;
            case 5:
                System.out.println("拳击");break;
            case 6:
                System.out.println("爬山");break;
            //case 7:
            default:
                System.out.println("好好吃一顿");break;
        }
    }
}
