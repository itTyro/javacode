package task;

public class Task4 {
    //需求：
    //
    //	定义一个方法equals(int[] arr1,int[] arr2).
    //
    //功能：
    //
    //	比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    int[] brr = {1,2,3,4,5,6};
    boolean yn = equals(arr,brr);
        System.out.println(yn);
    }
    public static boolean equals(int[] arr1,int[] arr2) {
        //长度一样则进行内容判断，否则直接返回false
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int i1 = i; i1 < arr2.length; i1++) {
                    if (arr1[i] == arr2[i1]) {
                        break;
                    } else {
                        return false;
                    }
                }

            }
            return true;
        }
        return false;
    }

}
