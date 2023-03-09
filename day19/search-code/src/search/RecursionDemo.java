package search;

public class RecursionDemo {
    public static void main(String[] args) {
//        int number = 100;




        System.out.println(getFactorial(30));
    }
    public static int getFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }
}
