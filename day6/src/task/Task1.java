package task;

import java.util.Scanner;

public class Task1 {
    //在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，
    // 在方法中从大到小依次打印三个变量。执行效果如下：
    //```
    //请输入第一个整数：10
    //请输入第二个整数：30
    //请输入第三个整数：20
    //从大到小的顺序是： 30 20 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int number = sc.nextInt();
        System.out.println("请输入数字");
        int number1 = sc.nextInt();
        System.out.println("请输入数字");
        int number2 = sc.nextInt();
        getThree(number,number1,number2);
    }
    public static void getThree(int number,int number1,int number2) {
        int max = number > number1 ? number : number1;
        max = max>number2?max:number2;
        int min = number < number1 ? number : number1 ;
        min = min<number2?min:number2;
        int mid = (number + number1 + number2) - (max + min);
        System.out.print(max + " ");
        System.out.print(mid + " ");
        System.out.print(min);
    }
}
