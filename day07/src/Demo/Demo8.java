package Demo;

public class Demo8 {
    public static void main(String[] args) {
        int[][] arr = {
                {22,64,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int yearSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] quarterArr = arr[i];
            int quarterSum = quarterSum(quarterArr);
            yearSum += quarterSum;
            System.out.println("第" + (i + 1) + "季度的总销售额是：" + quarterSum);
        }
        System.out.println("一年的总销售额是" + yearSum);

    }
    public static int quarterSum(int[] quarterArr) {
        int sum = 0;
        for (int i = 0; i < quarterArr.length; i++) {
            sum += quarterArr[i];
        }
        return sum;
    }
}
