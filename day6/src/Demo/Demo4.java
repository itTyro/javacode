package Demo;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int from = 3,to = 9;
        int[] brr = copyOfRange(arr,from,to);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] arr,int from,int to) {
        int[] brr = new int[to - from];
        for (int i = from,j = 0; i < to; i++,j++) {
            brr[j] = arr[i];
        }
        return brr;
    }
}
