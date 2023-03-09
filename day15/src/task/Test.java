package task;

public class Test {
    //1. 定义形状类:
    //
    //   功能：求面积，求周长
    //
    //2. 定义圆形类Round:
    //
    //   属性：半径，圆周率
    //
    //   功能：求面积，求周长
    //
    //3. 定义长方形类Rectangle:
    //
    //   	属性：长和宽
    //
    //   功能：求面积，求周长
    //
    //4. 定义测试类:
    //
    //   	分别创建圆形和长方形对象，为相应的属性赋值
    //
    //   分别调用求面积和求周长的方法

    public static void main(String[] args) {
        Round ro = new Round(3.5);
        ro.area();
        ro.girth();

        Rectangle re = new Rectangle(4.5,6.5);
        re.area();
        re.girth();
    }
}
