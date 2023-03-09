package Demo;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        //判断输入的金额是否符合条件
        while (true) {
            System.out.println("输入金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("错误参数");
            }
        }

        //将数字转换成大写的
        String uppStr = "";
        while (true) {
            int ge = money % 10;
            money = money / 10;
            uppStr = upp(ge) + uppStr;
            if (money == 0) {
                break;
            }
        }


        //不够七位数的前面补零
        if (uppStr.length() < 7) {
            //定义一个变量记录需要加几个零,不能直接使用uppStr.length(),
            // 因为每次循环做完补零操作之后长度都在发生变化
            int count = 7 - uppStr.length();
            for (int i = 0;i <count;i++) {
                uppStr = "零" + uppStr;
            }
        }

        //最后的结果
        //定义一个字符串数组,抽出需要的
        String[] comp = {"佰","拾","万","仟","佰","拾","元"};
        //定义变量接收
        String result = "";
        //数字的长度和单位的长度一样,所以都用i作为索引
        for (int i = 0; i < comp.length; i++) {
            //charAt()方法从字符串取出字符再进行拼接
            char c = uppStr.charAt(i);
            result = result + c + comp[i];
        }

        System.out.println(result);
    }

    //定义方法将数字转为大写并返回
    //传进来的i对应相对应的索引值
    public static String upp(int i) {
        String[] str = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return str[i];
    }
}
