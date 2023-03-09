package Test;

public class Test3 {
    public static void main(String[] args) {
        //有一堆桃子,一个猴子第一天吃了桃子的一半,并多吃了一个,以后每天吃剩下的一半,
        // 然后在多吃一个,第十天还没吃的时候发现就剩1个桃子,请问原来有几个桃子;

        System.out.println(getSum(1));
    }
    public static int getSum(int day) {
        if (day == 10) {
            return 1;
        }
        return (getSum(day + 1) + 1) * 2;
    }
}
