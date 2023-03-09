package test;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int j : arr) {
            if (j % 3 == 0) {
                sum++;
                System.out.println(j);
            }
        }
        System.out.println("能被3整除的有" + sum + "个");
    }
}
