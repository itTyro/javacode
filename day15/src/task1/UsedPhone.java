package task1;

public  class UsedPhone extends Phone{
    @Override
    public void playPhone() {
        System.out.println("旧手机打电话");
    }

    @Override
    public void note() {

        System.out.println("旧手机发信息");
    }

    @Override
    public void playGame() {

    }
}
