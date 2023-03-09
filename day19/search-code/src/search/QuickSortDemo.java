package search;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i + 1;
        int end = j;
        int baseNumber = arr[i];

        if (start > end) {
            return;
        }
        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            //把end和start位置进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //进行到这里证明循环结束,基准数找到对应的位置
        //基准数归为
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;

        //确定6左边的范围,重复刚刚的事情
        quickSort(arr, i, start - 1);

        //确定6右边的范围
        quickSort(arr, end + 1, j);
    }
}
