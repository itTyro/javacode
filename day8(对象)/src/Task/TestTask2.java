package Task;

public class TestTask2 {
    public static void main(String[] args) {
        //Task2 girl = new Task2();
//        girl.setName("李施恩");
//        girl.setHeight(158.0);
//        girl.setWeight(88.0);
        Task2 girl = new Task2("李施恩",158.0,88.0);
        //System.out.println("我女朋友叫" + girl.getName() + ",身高" + girl.getHeight() + "厘米,体重" + girl.getWeight() + "斤");
        girl.show();
        girl.wash();
        girl.cook();
    }
}
