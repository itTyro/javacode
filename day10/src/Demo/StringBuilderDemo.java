package Demo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        sb.append(123);
        sb.append("asdf");
        sb.append("你好");

        sb.reverse();

        String str = sb.toString();

        System.out.println(sb);
        System.out.println(str);
    }
}
