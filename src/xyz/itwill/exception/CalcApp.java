package xyz.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//Ű����� �������� �� ���� �Է¹޾� ���� ���� ����ϴ� ���α׷�
public class CalcApp {
	public CalcApp() throws InputMismatchException, ArithmeticException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� >> ");
		//nextInt() : �������� �ƴ� ���� �ԷµǸ� InputMissMatchException �߻�
		int num1 = in.nextInt();
		
		System.out.print("�� ��° ���� �Է� >> ");
		int num2 = in.nextInt();
		
		//0���� ������� ArithmeticException
		System.out.println("[���] = " + num1 + " / " + num2 + " = " + (num1 / num2));
		
		in.close();
	}
	
	public static void main(String[] args) {
		/*
		try {
			new CalcApp();//�����ڸ� �̿��Ͽ� �ν��Ͻ� ���� >> �������� ��� ����
		} catch (InputMismatchException e) {
			System.out.println("[����]������ �Է� �����մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("[����]0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			//Exception : ��� ���� Ŭ������ �θ� Ŭ����
			// => ��� ���ܸ� ���޹޾� ���� ó��
			System.out.println("[����]���α׷� ���࿡ ����ġ ���� ������ �߻��Ǿ����ϴ�.");
		}
		*/
		
		try {
			new CalcApp();
		} catch (InputMismatchException | ArithmeticException e) {
			//JDK7 �̻󿡼��� ���� Ŭ������ | �����ڷ� �����Ͽ� ���� ó�� ����
			System.out.println("[����]���Ŀ� �°� ���� �Է����ּ���.");
		} catch (Exception e) {
			
			System.out.println("[����]���α׷� ���࿡ ����ġ ���� ������ �߻��Ǿ����ϴ�.");
		}
	}
}
