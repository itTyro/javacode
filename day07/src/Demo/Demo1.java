package Demo;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //计算飞机票价，5-10月，头等舱打九折，经济舱打八五折，11-来年4月，头等舱打七折，经济舱六五折
        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份");
        int match = sc.nextInt();
        System.out.println("输入机票原价");
        int stick = sc.nextInt();
        System.out.println("输入舱位：0表示头等舱，1表示经济舱");
        int seat = sc.nextInt();
    }
    public static int money(int stick,int seat,double v0,double v1) {
        int sum = stick;
        if (seat == 0){
            sum = (int)(stick * v0);
            return sum;
        }else if(seat == 1){
            sum = (int)(stick * v1);
            return sum;
        }
        return sum;
    }
}
