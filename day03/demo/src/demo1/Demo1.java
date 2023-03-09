package demo1;

import java.util.Scanner;
//键盘录入三位数，分别输出个十百位数
public class Demo1 {
    public static void main(String[] args) {
        //提示用户输入
        System.out.println("请输入一个三位数");
        //获取键盘录入
        Scanner n = new Scanner(System.in);
        //使用键盘录入
        int a = n.nextInt();
        //百位数
        System.out.println("百位数是："+ a/100);
        //个位数
        System.out.println("个位数是："+ (a%10));
        //十位数
        System.out.println("十位数是："+ (a/10%10));
    }
}
