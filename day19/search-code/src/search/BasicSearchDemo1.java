package search;

import java.util.ArrayList;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {22,88,38,387,9288,34,23,64,23};
        int number = 23;
        ArrayList index = getIndex(arr, number);
        for (int i = 0; i < index.size(); i++) {
            System.out.println(index.get(i));
        }
    }

    private static ArrayList getIndex(int[] arr,int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
