package test;

import java.util.Scanner;

public class CarText {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入汽车的品牌");
            String brand = sc.next();
            c.setBrand(brand);
            System.out.println("汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand() + "," + arr[i].getPrice() + "," +arr[i].getColor());
        }
    }
}
