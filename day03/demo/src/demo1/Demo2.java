package demo1;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //引用键盘录入
        Scanner a = new Scanner(System.in);
        System.out.println("输入一个数字");
        int b = a.nextInt();
        System.out.println("输入一个数字");
        int c = a.nextInt();
        //判断是否相亲成功并输出
//        if (b>c){
//            System.out.println("相亲成功");
//        }else{
//            System.out.println("相亲失败");
//        }
        //大于输出true，小于输出false
        System.out.println(b>c);
    }
}
