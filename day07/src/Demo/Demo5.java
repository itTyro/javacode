package Demo;

public class Demo5 {
  /*某系统的数字密码（大于0）。比如1983，采用加密方式进行传输，
        规则如下：
            每位数加上5
            再对10求余，
            最后将所有数字反转，
            得到一串新数。
            按照以上规则进行解密：
            比如1983加密之后变成8346，解密之后变成1983
        */
  public static void main(String[] args) {
      int number = 8346;
      //定义临时变量记录number
      int temp = number;
      //定义一个变量为动态数组的长度
      int count = 0;
      //求动态数组长度
      while (number != 0) {
          number = number / 10;
          count++;
      }
      //存入数组
      int[] arr = new int[count];
      for (int i = 0; i < arr.length; i++) {
          int ge = temp % 10;
          temp = temp / 10;
          arr[i] = ge;
      }
      //由于加密是通过对10取余的方式进行获取的
      // 所以在解密的时候就需要判断，0~4之间+10  5~9数字不变
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] >= 0 && arr[i] <= 4) {
              arr[i] = arr[i] + 10;
          }
      }

      for (int i = 0; i < arr.length; i++) {
          arr[i] = arr[i] - 5;
      }
      //定义解密变量
      int sum = 0;
      //求出结果
      for (int i = 0; i < arr.length; i++) {
          sum = sum * 10 + arr[i];
      }
      System.out.println(sum);
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
  }
}
