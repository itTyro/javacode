package Demo;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {
                1, 2, 3, 4
        };
        String newArr = splicStr(arr);
        System.out.println(newArr);
    }

    public static String splicStr(int[] arr) {
        String rails = "[";
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                rails += arr[i];
            } else {
                rails += arr[i] + ",";
            }
        }
        rails += "]";
        return rails;
    }
}
