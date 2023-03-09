package Demo;

import java.util.Random;
import java.util.Scanner;
//双色球中奖系统
public class Demo6 {
    public static void main(String[] args) {
        int[] arr = createNumber();
        System.out.print("中奖号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] userArr = userNumber();
        System.out.print("用户输入的双色球组合为：");
        for (int i = 0; i < userArr.length; i++) {
            System.out.print(userArr[i] + " ");
        }
        System.out.println();


        //定义两个变量接收中奖的球数
        int redCount = 0;
        int blueCount = 0;
        //判断红球中奖
        for (int i = 0; i < userArr.length - 1; i++) {
            int redNumber = userArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[i]) {
                    redCount++;
                    break;
                }
            }
        }

        //判断蓝球中奖
        if (arr[arr.length - 1] == userArr[userArr.length - 1]) {
            blueCount++;
        }

        System.out.println("红球中了" + redCount + "个");
        System.out.println("蓝球中了" + blueCount + "个，所以你");

        //判断中奖情况
        if (redCount == 6 && blueCount == 1) {
            System.out.println("中奖1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("中奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("中奖3000");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("中奖200");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("中奖10");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("中奖5");
        } else {
            System.out.println("啥都没有，还亏了两块钱哈哈哈");
        }
    }

    //获取用户输入的双色球
    public static int[] userNumber() {
        //获取红球
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "红球");
            int number = sc.nextInt();
            if (flag(arr, number) && number >= 1 && number <= 33) {
                arr[i] = number;
                i++;
            } else {
                System.out.println("输入有误重新输入");
            }
        }
        //获取蓝球
        for (int i = 0; ; i++) {
            System.out.println("请输入蓝球");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[6] = blueNumber;
                break;
            } else {
                System.out.println("输入有误，请重新输入");
            }
        }
        return arr;
    }

    //获取中奖号码
    public static int[] createNumber() {
        Random r = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length - 1; ) {
            int number = r.nextInt(33) + 1;
            if (flag(arr, number)) {
                arr[i] = number;
                i++;
            }
        }
        arr[6] = r.nextInt(16) + 1;
        return arr;
    }

    //判断产生的随机数是否在数组已经存在
    public static boolean flag(int[] arr, int Number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Number)
                return false;
        }
        return true;
    }
}
