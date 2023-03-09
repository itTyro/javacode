package Demo;

public class Demo1 {
    public static void main(String[] args) {
        Demo1Obj girl = new Demo1Obj();
        girl.my();
        System.out.println(girl.name);
        girl.setHeight(158);
        girl.setWeight(90);
        girl.from();
        girl.school();

        System.out.println(girl.getHeight());
        System.out.println(girl.getWeight());
    }
}
