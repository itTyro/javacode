package test;

public class GoodsText {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001","小米MIX4",4999.0,50);
        Goods g2 = new Goods("002","iphone 14",6599.0,40);
        Goods g3 = new Goods("003","华为Mate 40",3999.0,60);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getPrice()
            + "," + arr[i].getCount());
        }
    }
}
