package xyz.itwill.lang;

import java.util.Scanner;

//Ű����� �ֹε�Ϲ�ȣ�� �Է¹޾� ������ϰ� ������ ����ϴ� ���α׷�
// => �Է� �ֹι�ȣ�� 14�ڸ��̸� 7��° �ڸ����� - ���� ����
// => ���������� �ֹε�Ϲ�ȣ�� �Էµ� ��� ���� �޽��� ��� �� ���Էµǵ��� ó��
// ex) �ֹε�Ϲ�ȣ �Է� [ex. 901225-1234567] >> 000101-3456789
//     [���]������� = 2000�� 01�� 01��, ���� = ����
public class PersonNumberApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//�ֹε�Ϲ�ȣ �Է� >> �Է°� ����
		String number;
		while(true) {
			System.out.print("�ֹε�Ϲ�ȣ �Է� [ex. 901225-1234567] >>");
			//�Էµ� ���ڿ��� �յ� ������ �����Ͽ� ������ ����
			number = in.nextLine().trim();
			//if(number.length() == 14 && number.charAt(6) == '-') break;
			if(number.length() == 14 && number.indexOf("-") == 6) break;
			System.out.println("[����]���Ŀ� �´� �ֹε�Ϲ�ȣ�� �Է��� �ּ���.");
		}
		
		in.close();
		
		//�ֹε�Ϲ�ȣ�� 8��° ��ġ�� ���ڿ� �ϳ��� �и��Ͽ� ����
		String separation = number.substring(7, 8);
		//System.out.println("separation = " + separation);
		
		//�ֹε�Ϲ�ȣ���� ������� �и��Ͽ� ����
		String birthday = "";
		if(separation.equals("1") || separation.equals("2")) {
			birthday += "19";
		} else if(separation.equals("3") || separation.equals("4")) {
			birthday += "20";
		}
		
		birthday += number.substring(0, 2) + "�� ";
		birthday += number.substring(2, 4) + "�� ";
		birthday += number.substring(4, 6) + "��";
		
		//�ֹε�Ϲ�ȣ���� ������ ���Ͽ� ����
		String gender = "";
		if(separation.equals("1") || separation.equals("2")) {
			gender += "����";
		} else if(separation.equals("3") || separation.equals("4")) {
			gender += "����";
		}
		
		System.out.println("[���]������� = " + birthday + ", ���� = " + gender);
		
	}
}
