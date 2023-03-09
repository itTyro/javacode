package task;

import java.util.Random;

public class Task6 {
    //一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖，
    // 打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）
    //
    //```
    //888元的奖金被抽出
    //588元的奖金被抽出
    //10000元的奖金被抽出
    //1000元的奖金被抽出
    //2元的奖金被抽出
    //```
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] brr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int number = r.nextInt(arr.length);
            int prove = arr[number];
            if (contains(brr,prove)){
                brr[i] = arr[number];
                System.out.println(prove + "的奖金被抽出");
                i++;
            }
        }
    }

    public static boolean contains(int[] arr, int prove) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prove)
                return false;

        }
        return true;
    }
}



//    public static void main(String[] args) {
//        int[] arr = {2,588,888,1000,10000};
//        int[] arr1 = new int[arr.length];
//        draw(arr,arr1);
//    }
//    public static void draw(int[] arr,int[] arr1) {
//        Random r = new Random();
//        for (int i = 0,j=0;arr1[arr1.length - 1] == 0;i++){
//        int index = r.nextInt(arr.length);
//        if(arr[index] != 0){
//        arr1[j++] = arr[index];
//        arr[index] = 0;
//        }else continue;
//            System.out.println(arr1[j]);
//        }
//    }


