package task;

public class Task5 {
    //需求：
    //
    //	定义一个方法fill(int[] arr,int value)
    //
    //功能：
    //
    //	将数组arr中的所有元素的值改为value
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int value = 6;
        fill(arr,value);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void fill(int[] arr,int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }
}
