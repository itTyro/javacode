package test;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2;
                System.out.println(arr[i]);
            }else {
                arr[i] = arr[i] / 2;
                System.out.println(arr[i]);
            }
        }
    }
}
