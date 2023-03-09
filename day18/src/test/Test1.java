package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {

            System.out.println("请输入一个数");
            String str = sc.nextLine();
            int i = Integer.parseInt(str);

            if (i < 1 || i > 100) {
                System.out.println("输入数据异常重新输入");
                continue;
            }

            sum += i;
            if (sum  < 200) {
                list.add(i);
            }else{
                list.add(i);
                System.out.println("集合的总和超过两百");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
