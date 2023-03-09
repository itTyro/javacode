package Task;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
        // 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
        // 规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你的身份证");
            String str = sc.next();
            if (judgeId(str)) {
                System.out.println("输入的身份证合法");
                break;
            }else{
                System.out.println("输入的身份证不合法,重新输入");
            }
        }
    }

    //判断身份证是否合法
    public static boolean judgeId(String str) {
        //字符串转为字符数组判断
        char[] id = str.toCharArray();
        //判断字符串长度是否是18为,是的话继续下一步判断不是的话直接返回false
        if (str.length() == 18) {
            //判断字符数组的第一位是否为0,和最后以为是否是数字或者X,否则直接返回false
            if (id[0] != '0' && ((id[id.length -1] <= '9' && id[id.length -1] >= '0') || (id[id.length - 1] == 'X'))) {
                //判断前17位是否为数字,是的话,所有条件判断完成,返回true,否则返回false
                for (int i = 0;i <id.length - 1;i++) {
                    if (id[i] >= '0' && id[i] <= '9'){

                    }else{
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
