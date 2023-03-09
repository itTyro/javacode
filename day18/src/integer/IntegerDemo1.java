package integer;

import java.util.Scanner;

public class IntegerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i = Integer.parseInt(str);
        System.out.println(i + 3);
    }
}
