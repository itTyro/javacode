package Demo;

import java.util.Random;

public class Demo3 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            int number = r.nextInt(101);
            arr[i] = number;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum = sum - max - min;
        int avg = sum / 4;
        System.out.println("平均分数是" + avg);
        System.out.println("最高分是" + max);
        System.out.println("最低分是" + min);
        System.out.print("各个分数是");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
