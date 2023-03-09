package Demo;

public class Demo4 {
    //需求：
    //    某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
    //
    //规则如下：
    //	先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
    //举例：
    //```java
    //		1	9	8	3
    //+5		6   14  13  8
    //%10		6   4   3   8
    //反转	   8   3   4   6
    //加密后的结果就是：8346
    public static void main(String[] args) {
        int number = 1983;
        //定义临时变量记录number
        int temp = number;
        //定义一个变量为动态数组的长度
        int index = 0;
        //求动态数组长度
        while (number != 0){
            number = number / 10;
            index++;
        }
        int[] arr = new int[index];
        //存入数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp % 10;
            temp = temp / 10;
        }
        //加5并取模
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] % 10;
//        }
//        for (int i = 0,j = arr.length - 1;i < j;i++,j--) {
//            int tmp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = tmp;
//        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int ge = arr[i] % 10;
            sum = sum * 10 + ge;
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
