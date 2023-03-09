package test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int sum = 0;
        double average;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        average = (double) sum/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < average){
                count++;
                System.out.println("比平均数小的数：" + arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(average);
        System.out.println(count);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
