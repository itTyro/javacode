package Task;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str = new String(sc.next());

        char[] chaeStr = str.toCharArray();

        Random r = new Random();


        for (int i = 0; i < chaeStr.length; i++) {
            int index = r.nextInt(chaeStr.length);
            char temp;
            temp = chaeStr[i];
            chaeStr[i] = chaeStr[index];
            chaeStr[index] = temp;
        }
       String result = new String(chaeStr);

        System.out.println(result);
    }
}
