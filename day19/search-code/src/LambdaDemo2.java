import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    public static void main(String[] args) {
        Integer[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        Arrays.sort(arr,
                ( o1,  o2)-> o1 - o2
        );
        System.out.println(Arrays.toString(arr));
    }
}
