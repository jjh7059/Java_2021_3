package xyz.itwill.lang;

import java.util.Scanner;

//Ű����� ������� �Է¹޾� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
//ex) ����� �Է� >> 20 + 10
//    [���]30
// => �Է� ����Ŀ��� ��� ������ �����ڴ� ��Ģ ������(*,/,+,-)�� ���
// => ���Ŀ� ���� ���� ������� �Էµ� ��� ���� �޽��� ��� �� ���α׷� ���� (�������� ������ ���� ����)
// => �Է� ����Ŀ� ������ �Է� ���� �ϵ��� ó��

// * �����ڸ� ã�� �����ڸ� ���������� �հ� �ް� �и� �� ��� 
//StringŬ���� (replace, indexof, substring, equals �޼ҵ�) ���

public class ConsoleCalculateApp {
	public static void main(String[] args) {
		//������ Ǯ��
		Scanner in = new Scanner(System.in);
		
		System.out.print("����� �Է� >> ");
		String operation = in.nextLine().replace(" ", "");
		in.close();
		
		String[] operatorArray = {"+", "-", "*", "/"};
		
		int index = -1;
		for(String str:operatorArray) {
			//String.lastIndexOf(String s) : String �ν��Ͻ��� ����� ���ڿ����� �˻�
			//���ڿ��� �ں��� �˻��Ͽ� ������ġ�� ��ȯ�ϴ� �޼ҵ�
			// ex) �Է� ���� (-20 + 10)�� ��츦 ����� �ڿ������� �����ڸ� �˻�
			index = operation.lastIndexOf(str);
			
			//����Ŀ��� �����ڰ� �˻��� ��� �ݺ����� ����
			if(index != -1) break;
		}
		
		//�����ڰ� ���ų� ��ġ�� �߸��� ��� ����
		if(index <= 0 || index >= operation.length() - 1) {
			System.out.println("[����]������� �߸� �Է� �Ͽ����ϴ�.");
			System.exit(0);
		}
		
		try {
			//����Ŀ��� �����ڿ� �ǿ����ڸ� �и��Ͽ� ����
			int num1 = Integer.parseInt(operation.substring(0, index));
			String operator = operation.substring(index, index + 1);
			int num2 = Integer.parseInt(operation.substring(index + 1));
			
			//���� �����
			int result = 0;
			switch(operator) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			}
			
			//��� ���
			System.out.println("[���]" + result);
			
		} catch (NumberFormatException e) {
			System.out.println("[����]����Ŀ� ���ڰ� ������ �ƴ� ���ڰ� �Է� �Ǿ����ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("[����]0���� ���� �� �����ϴ�..");
		} catch (Exception e) {
			System.out.println("[����]����ġ ���� ������ �߻��Ͽ����ϴ�.");
		}
		
		//�� Ǯ��
		/*
		Scanner in = new Scanner(System.in);
		
		System.out.print("����� �Է� >> ");
		
		//�Էµ� ������� �����ϱ� ���� ����
		String fomula = in.nextLine().trim().replace(" ", "");
		
		int result = 0;//������� �����ϱ� ���� ����
		
		
		//�����ڸ� �������� ������ �и��Ͽ� �����ϱ� ���� �ݺ���
		for(int i = 0; i < fomula.length(); i++) {
			//�� �ǿ����ڸ� �����ϱ� ���� ����
			int a = 0, b = 0;
			if(fomula.charAt(i) == '+' || fomula.charAt(i) == '-' || fomula.charAt(i) == '*' || 
					fomula.charAt(i) == '/') {
				a = Integer.parseInt(fomula.substring(0, i));
				b = Integer.parseInt(fomula.substring(i+1));
				
				switch(fomula.charAt(i)) {
				case '+': result = a + b; break;
				case '-': result = a - b; break;
				case '*': result = a * b; break;
				case '/': result = a / b; break;
				}
				
				break;
			}
		}
		System.out.println("[���]" + result);
		
		in.close();
		*/
	}
}
