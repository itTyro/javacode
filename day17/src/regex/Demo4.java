package regex;

import java.net.URL;

public class Demo4 {
    public static void main(String[] args) {
        String str = "林dasdfref5454志eafdfe7511龙";
        String regex1 = "[\\w&&[^_]]+";
        String vs = str.replaceAll(regex1, "vs");
        System.out.println(vs);
        String[] arr = str.split(regex1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
