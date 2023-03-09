package Demo;

public class Demo2 {
    public static void main(String[] args) {
        //求101到200之间的所有素数

        boolean flag = true;
        int count = 0;
        for (int i = 101;i<=200;i++){
            for ( int j = 2;j < i;j++){
                if (i % j == 0){
                    flag = false;
                    break;
                }
                }
            if (flag){
                System.out.print(i+ " ");
                count++;
            }
            flag = true;
            }
        System.out.println();
        System.out.println(count);
        }
    }

