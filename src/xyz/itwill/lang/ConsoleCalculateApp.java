package xyz.itwill.lang;

import java.util.Scanner;

//Ű����� ������� �Է¹޾� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
//ex) ����� �Է� >> 20 + 10
//    [���]30
// => �Է� ����Ŀ��� ��� ������ �����ڴ� ��Ģ ������(*,/,+,-)�� ���
// => ���Ŀ� ���� ���� ������� �Էµ� ��� ���� �޽��� ��� �� ���α׷� ����
// => �Է� ����Ŀ� ������ �Է� ���� �ϵ��� ó��

// * �����ڸ� ã�� �����ڸ� ���������� �հ� �ް� �и� �� ��� 
//StringŬ���� (replace, indexof, substring, equals �޼ҵ�) ���

public class ConsoleCalculateApp {
	public static void main(String[] args) {
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
	}
}
