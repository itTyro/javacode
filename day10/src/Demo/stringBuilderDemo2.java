package Demo;

public class stringBuilderDemo2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        String result = str(arr);
        System.out.println(result);
    }

    public static String str(int[] arr) {

        int sum;
        String newStr = "";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            if (i == arr.length - 1) {
                sb.append(sum + "]");
            } else {
                sb.append(sum + ", ");
            }
        }
        newStr = sb.toString();
        return newStr;
    }
}
