package Demo;

public class Demo5 {
    public static void main(String[] args) {
        String talk = "玩的什么飞机,不会玩别玩了,玩你妈呢?";

        String[] arr = {"机","妈","曹"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "*");
        }
        System.out.println(talk);
    }
}
