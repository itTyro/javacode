package test;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int temp;

        //冒泡排序
        /* for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <arr.length ; j++) {

                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }*/

        for(int i = 0,j = arr.length - 1;i<j; i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
