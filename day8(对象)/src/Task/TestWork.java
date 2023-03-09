package Task;

public class TestWork {
    public static void main(String[] args) {
        Manager m = new Manager("张三",123,15000.0,6000.0);
        Coder c = new Coder("李四",123,10000.0);
        m.work();
        c.work();
    }

}
