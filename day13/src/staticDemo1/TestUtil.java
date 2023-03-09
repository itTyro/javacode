package staticDemo1;

public class TestUtil {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        double[] arr2 = {21.2,43.5,65.3,99.9,34.1};

        String s = ArrayUtil.printArr(arr);

        double avg = ArrayUtil.getAerage(arr2);

        System.out.println(s);
        System.out.println(avg);
    }
}
