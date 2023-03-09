package task;

public class Love {
    public static void main(String[] args) {
        for (float y = 1.5f;y > -1.5f;y -= 0.1f) {
            for (float x = -1.5f;x < 1.5f;x += 0.045f) {
                float a = x * x + y * y - 1.2f;
                if (( a * a * a - x * x * y * y *y) < 0.0f) {
                    System.out.print("恩");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
