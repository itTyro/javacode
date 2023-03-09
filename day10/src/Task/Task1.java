package Task;

import java.util.Scanner;
import java.util.StringJoiner;

public class Task1 {
    public static void main(String[] args) {
        //键盘录入字符串
        //长度小于9,只能是数字,将内容变成罗马数字
        //Ⅰ,Ⅱ,Ⅲ,Ⅳ,Ⅴ,Ⅶ... 包含0的话变成""
        Scanner sc = new Scanner(System.in);

        String str = "";
        while (true) {
            System.out.println("输入一个长度小于9的数字字符串");
            str = sc.next();
            //判断长度是否小于9
            if (str.length() < 9) {
                //定义一个变量,根据最后结果是否符合要求来break跳出循环
                boolean flag = true;
                //遍历每一个字符进行判断
                for (int i = 0; i < str.length(); i++) {
                    //判断每一个字符是否都为1-9的数字
                    if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {

                    } else {
                        System.out.println("输入的不是数字");
                        //不符合题目要求赋false
                        flag = false;
                        break;
                    }
                }
                //符合要求则退出循环
                if (flag) {
                    break;
                }

            } else {
                System.out.println("输入长度不符合,请重新输入");
            }
        }
        System.out.println("键盘录入的字符串为:" + str);

        //定义StringJoiner容器来接收字符串节省内存,提高效率,不使用StringBuilder是因为
        //在每个字符中加符号Joiner方便,代码量少
        StringJoiner sb = new StringJoiner(", ");

        //遍历str中的每个字符转换成罗马数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //调用方法将每个字符依次转化为罗马数字并进行添加到容器
            sb.add(number(c));
        }
        //将容器里的转为字符串
        String result = sb.toString();
        System.out.println(result);
    }

    //定义方法将传过来的字符转换为数字作为索引方便转化成罗马数字
    public static String number(char i) {
        int index = i - 48;
        return rome(index);
    }

    //每个数字索引值对应相对应的罗马数字,利用查表法
    public static String rome (int index) {
        String[] romeArr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return romeArr[index];
    }
}
