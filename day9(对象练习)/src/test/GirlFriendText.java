package test;

public class GirlFriendText {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];
        GirlFriend girl1 = new GirlFriend("李施恩",16,'女',"看剧");
        GirlFriend girl2 = new GirlFriend("李施恩",17,'女',"看剧");
        GirlFriend girl3 = new GirlFriend("李施恩",18,'女',"看剧");
        GirlFriend girl4 = new GirlFriend("李施恩",19,'女',"看剧");

        arr[0] = girl1;
        arr[1] = girl2;
        arr[2] = girl3;
        arr[3] = girl4;

        //计算平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }
        int avg = sum / arr.length;

        System.out.println(avg);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg) {
                System.out.println(arr[i].getAge());
                count++;
            }
        }

        System.out.println(count);
    }
}
