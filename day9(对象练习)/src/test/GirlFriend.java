package test;

public class GirlFriend {
    private String name;
    private int age;
    private char gander;
    private String hobby;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, char gander, String hobby) {
        this.name = name;
        this.age = age;
        this.gander = gander;
        this.hobby = hobby;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gander
     */
    public char getGander() {
        return gander;
    }

    /**
     * 设置
     * @param gander
     */
    public void setGander(char gander) {
        this.gander = gander;
    }

    /**
     * 获取
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


}
