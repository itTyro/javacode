package task1;

public class NewPhone extends Phone implements IPlay{
    @Override
    public void playGame() {

        System.out.println("新手机在玩游戏");
    }

    @Override
    public void playPhone() {


        System.out.println("新手机打电话");
    }

    @Override
    public void note() {

        System.out.println("新手机发信息");
    }
}
