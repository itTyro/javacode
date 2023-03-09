package Demo;

public class Demo4 {
    public static void main(String[] args) {
        String phoneNumber = "173050634283";

        String s = phoneNumber.substring(0, 3);

        String s1 = phoneNumber.substring(7);

        String result = s + "****" + s1;

        System.out.println(result);
    }
}
