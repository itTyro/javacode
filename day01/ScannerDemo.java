//����
import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args){
		//�������󣬱�ʾҪʹ��Scanner�����
		Scanner lr = new Scanner(System.in);
		System.out.println("������һ������");
		//�������ݣ���ʼʹ��
		int a = lr.nextInt();
		int b = lr.nextInt();
		System.out.println(a+b);
	}
}