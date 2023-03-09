package Demo;

public class Demo7 {
    public static void main(String[] args) {
        int[][] arr = {
                {2,2},
                {3,3,3}
        };
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3};
        arr[0] = arr1;
        arr[1] = arr2;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.print(arr[i][i1] + " ");
            }
            System.out.println();
        }
    }
}
