//导包
import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args){
		//创建对象，表示要使用Scanner这个类
		Scanner lr = new Scanner(System.in);
		System.out.println("请输入一个数字");
		//接收数据，开始使用
		int a = lr.nextInt();
		int b = lr.nextInt();
		System.out.println(a+b);
	}
}