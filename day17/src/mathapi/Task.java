package mathapi;

public class Task {
    public static void main(String[] args) {
//        //求四叶玫瑰数
//        int count = 0;
//        for (int i = 1000; i < 9999; i++) {
//            int ge = i % 10;
//            int shi = i / 10 % 10;
//            int bai = i / 100 % 10;
//            int qian = i / 1000 % 10;
//
//            double sum = Math.pow(ge,4) + Math.pow(shi,4) + Math.pow(bai,4) + Math.pow(qian,5);
//
//            if (sum == i) {
//                System.out.println(i);
//                count++;
//            }
//        }

        long start = System.currentTimeMillis();
        int count = 0;

        for (int i = 10000; i < 99999; i++) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000;

            double sum = Math.pow(ge,5) + Math.pow(shi,5) + Math.pow(bai,5) + Math.pow(qian,5) + Math.pow(wan,5);

            if (sum == i) {
                System.out.println(i);
                count++;
            }


        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
