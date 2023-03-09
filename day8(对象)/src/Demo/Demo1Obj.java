package Demo;

public class Demo1Obj {
    String name = "李施恩";
    private int height;
    private int weight;

    public void setHeight(int h) {
        if (h >= 150 && h <= 170) {
            height = h;
        } else {
            System.out.println("非法参数");
        }
    }

    public int getHeight() {
        return height;
    }


    public void setWeight(int w) {
        if (w >= 80 && w <= 120) {
            weight = w;
        } else {
            System.out.println("非法输入");
        }
    }

    public int getWeight(){
        return weight;
    }
    public void from() {
        System.out.println("福建省漳州市诏安县");
    }

    public void school() {
        System.out.println("粤东高级技工学校");
    }

    public void my() {
        System.out.print("林志龙的女朋友是");
    }
}
