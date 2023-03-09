package task;

public class Rectangle extends Shape {
    //3. 定义长方形类Rectangle:
    //
    //   	属性：长和宽
    //
    //   功能：求面积，求周长

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * 获取
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     *
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 获取
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public void area() {
        System.out.println("长方形的面积" + width * height);
    }

    @Override
    public void girth() {

        System.out.println("长方形的周长" + (width + height) * 2);
    }
}
