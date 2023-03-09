package Task;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
        // 比如：Hello12345World中字母：10个，数字：5个。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        char[] arr = str.toCharArray();
        int letterCount = 0;
        int numCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <='Z')) {
                letterCount++;
            }else if (arr[i] >= '0' && arr[i] <= '9') {
                numCount++;
            }
        }
        System.out.println("英文字母一共有:" + letterCount);
        System.out.println("数字一共有:" + numCount);
    }
}
