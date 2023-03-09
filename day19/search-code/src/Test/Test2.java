package Test;

public class Test2 {
    public static void main(String[] args) {

        System.out.println(getNum(12));

    }
    public static int getNum(int day) {
        if (day == 1 || day == 2) {
            return 1;
        }
        return getNum(day - 1) + getNum(day - 2);
    }
}
