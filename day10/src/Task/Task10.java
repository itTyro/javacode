package Task;

public class Task10 {
    public static void main(String[] args) {
        String s = "hello worldkl";
        int len = countLen(s);
        System.out.println(len);
    }
    public static int countLen(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >=0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                break;
            } else count++;
        }
        return count;
    }
}
