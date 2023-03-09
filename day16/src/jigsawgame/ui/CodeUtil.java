package jigsawgame.ui;

import java.util.Random;

public  class  CodeUtil {
    public static void main(String[] args) {
      /*  char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char)(65 + i);
            }else {
                arr[i] = (char)(97 + i - 26);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        System.out.println(getCode());
    }

    public static String getCode() {
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char)(65 + i);
            }else {
                arr[i] = (char)(97 + i - 26);
            }
        }
        char[] newArr = new char[4];


        Random r = new Random();
//        newArr[4] = (char) r.nextInt(10);
        for (int i = 0; i < newArr.length; i++) {
            int index = r.nextInt(arr.length);
            newArr[i] = arr[index];
        }
        String str = new String(newArr);
        str = str + r.nextInt(10) + "";
//        System.out.println(str);

        char[] arr1 = str.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            int index = r.nextInt(arr1.length);
            char temp = arr1[i];
            arr1[i] = arr1[index];
            arr1[index] = temp;
        }
        sb.append(arr1);


        return sb.toString();
    }
}
