public class LambdaDemo {
    public static void main(String[] args) {
        method(
                ()-> {
                    System.out.println("正在游泳");
            }
        );

        method(new swing() {
            @Override
            public void swimming() {

            }
        });
    }
    public static void method(swing s) {
        s.swimming();
    }

    @FunctionalInterface
    interface swing {
        public abstract void swimming();
    }
}
