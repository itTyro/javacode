package studentSystemP;

public class text {
    public static void main(String[] args) {
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char)(65 + i);
            }else {
                arr[i] = (char)(97 + i - 26);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
