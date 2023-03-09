package jigsawgame.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //把一个一维数组中的数据:0~15打乱 并添加到二维数组
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        int[][] arr1 = new int[4][4];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0 ;j < 4; j++) {
                arr1[i][j] = arr[index];
                index++;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0 ;j < 4; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
