package task;

public class Round extends Shape{
    //2. 定义圆形类Round:
    //
    //   属性：半径，圆周率
    //
    //   功能：求面积，求周长
    private double radius;
    final double PI = 3.1415926535;

    public Round() {
    }

    public Round(double radius) {
        this.radius = radius;

    }

    @Override
    public void area() {

        System.out.println("圆的面积" + getRadius() * getRadius() * PI);

    }

    @Override
    public void girth() {

        System.out.println("圆的周长" + 2 * radius * PI);
    }

    /**
     * 获取
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 设置
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 获取
     * @return pi
     */


    /**
     * 设置
     * @param pi
     */




}
