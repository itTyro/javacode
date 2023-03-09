package Task;

public class TestTask1 {
    public static void main(String[] args) {
        Task1 phone = new Task1();
        phone.setBrand("小米");
        phone.setPrice(3998);
        phone.setColor("黑色");
        //System.out.print("正在使用价格为" + phone.getPrice() + "元" + phone.getColor() + "的" + phone.getBrand());
        phone.call();

        //System.out.print("正在使用价格为" + phone.getPrice() + "元" + phone.getColor() + "的" + phone.getBrand());
        phone.sendMessage();


    }
}
