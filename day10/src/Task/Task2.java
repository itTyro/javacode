package Task;

import java.sql.SQLOutput;

public class Task2 {
    public static void main(String[] args) {
        //将字符串A最左边的一位数放到最右边,循环翻转,如果反转后的A字符串与字符串B相同
        //则返回true,否则返回false
        String A = "abcd";
        String B = "ABC";


        for (int i = 0;i < A.length();i++) {
            A = newStr(A);
//             boolean flag = compare(A,B);
//            if (flag) {
//                System.out.println(flag);
//                    break;
//            }
                     boolean flag = compare(A,B);
            if (flag) {
                System.out.println(flag);
                break;
            }
            System.out.println(A);
            
        }
    }

    public static String newStr(String A) {
        char fiend = A.charAt(0);
        String end = A.substring(1);
        return end + fiend;
    }

    public static boolean compare(String A,String B) {
       if (A.equals(B)) {
           return true;
       }
       return false;
    }
}
