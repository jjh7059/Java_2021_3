package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Ű����� ��������� �Է¹޾� ���ñ��� ��ƿ� ��¥(��)�� ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//ex) ������� �Է�[ex.2000-01-01] >> 2021-05-16
//    [���]�¾�� 1�� �������ϴ�.
// => ���Ŀ� ���� ���� ��������� �Է��� ��� ���� �޽��� ��� �� ���α׷� ����

//simpledateformat(parse�޼ҵ�), date(getTime�޼ҵ�) ���
public class DayCalculateApp {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Scanner in = new Scanner(System.in);
		System.out.print("������� �Է�[ex.2000-01-01] >> ");
		
		//������� ��������� �Է¹޾� �����ϱ� ���� ����
		String input = in.nextLine();
		
		try {
			Date userBirthday = dateFormat.parse(input);
			System.out.println(userBirthday);
			System.out.println(userBirthday.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
