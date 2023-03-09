package search;

public class InsertDemo {
    public static void main(String[] args) {
        int[] arr= {32,53,23,12,54,32,76,23,76,14,52,84,58};
        
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                index = i + 1;
                break;
            }
        }
        for (int i = index; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
