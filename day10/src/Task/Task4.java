package Task;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        //生成验证码
        //
        //内容：可以是小写字母，也可以是大写字母，还可以是数字
        //
        //规则：
        //
        //  	长度为5
        //
        //  	内容中是四位字母，1位数字。
        //
        //  	其中数字只有1位，但是可以出现在任意的位置。

        char[] arr = new char[52];
        //把A~Z,a~z传到数组中
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char)(97 + i);
            } else arr[i] = (char)(65 + i - 26);
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        Random r = new Random();
        //产生1~9的随机数
        int number = r.nextInt(10);

        //转为字符
        char num = (char)(number + 48);



        char[] si = new char[5];

        //把数字字符赋值进去
        si[4] = num;
        //依次从arr数组随机抽取值赋值给字符数组
        for (int i = 0;i < 4;i++) {
            int index = r.nextInt(arr.length) + 1;
            si[i] = arr[index];
        }

        //将字符数组里的值打乱顺序
        for (int i = 0; i < si.length; i++) {
            int index = r.nextInt(si.length - 1);
            char c = si[i];
            si[i] = si[index];
            si[index] = c;
        }
        //转换成字符串
        String result = new String(si);
        System.out.println(result);

    }
}
