package xyz.itwill.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


//Ű����� �̸��� �¾ �⵵�� �Է¹޾� �̸��� ���̸� ����ϴ� ���α׷�
public class ConsoleIOApp {
	public static void main(String[] args) throws IOException {
		//Java���� �����Ǵ� Ű���� �Է� ��Ʈ���� �뷮�� ���� �����͸� �Է¹��� �� �ִ�
		//����� �����ϴ� ��Ʈ������ ��뷮 �Է� ��Ʈ������ Ȯ���Ͽ� ����
		//System.in : Java���� �����Ǵ� Ű���� �Է� ��Ʈ������ ���õ����� �ϳ��� ��ȯ�ϴ� 
		//��� �����ϴ� ��Ʈ��
		//InputStreamReader : InputStream �ν��Ͻ��� ���޹޾� �Է� ��Ʈ���� Ȯ���Ͽ� 
		//���� ������ �ϳ��� ��ȯ�ϴ� ��� �����ϴ� ��Ʈ��
		//BufferedReader : Reader �ν��Ͻ��� ���޹޾� �Է� ��Ʈ���� Ȯ���Ͽ� �뷮�� ����
		//������(���ڿ�)�� ��ȯ�ϴ� ����� �����ϴ� ��Ʈ��
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out : Java���� �����Ǵ� ����� ��� ��Ʈ������ ���õ����� �ϳ��� ��ȯ�ϴ�
		//����� �����ϴ� ��Ʈ�� - PrintStream Ŭ������ �̿��Ͽ� ������ ��� ��Ʈ��
		// => print() �Ǵ� println() �޼ҵ带 �̿��Ͽ� ��� ���� ���õ����ͷ� ��ȯ�Ͽ� ����
		System.out.print("�̸� �Է� >> ");
		
		//BufferedReader.readLine() : �Է� ��Ʈ���� �����ϴ� ��� �Է°��� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		String name = in.readLine();
		
		System.out.print("�¾ �⵵ �Է� >> ");
		int birthYear = Integer.parseInt(in.readLine());
		
		int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear + 1;
		
		System.out.println("[���]" + name + "���� ���̴� " + age + "���Դϴ�.");
	}
}
