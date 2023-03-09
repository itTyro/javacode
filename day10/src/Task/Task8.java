package Task;

import java.util.StringJoiner;

public class Task8 {
    public static void main(String[] args) {
        //定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
        //
        //要求：
        //
        //	1、如果传递的参数为空，返回null
        //
        //	2、如果传递的数组元素个数为0，返回[]
        //
        //	3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]

        int[] arr = new int[0];
        String str = arrToStr(arr);

        System.out.println(str);
    }

    public static String arrToStr(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0){
            return "[]";
        }
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i] + "";
            sj.add(s);
        }
        return sj.toString();
    }
}
