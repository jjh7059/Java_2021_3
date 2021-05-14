package xyz.itwill.lang;

//String : ���ڿ��� �����ϱ� ���� Ŭ����
// => ���������� String �ν��Ͻ��� ���ڿ��� byte �迭�� ��ҿ� ���ڷ� ����Ǿ� ó��
public class StringApp {
	public static void main(String[] args) {
		//" " ��ȣ�� �̿��Ͽ� String �ν��Ͻ� ǥ�� ����
		String str1 = "ABC";//String �ν��Ͻ� ����
		
		//String.toString() : String �ν��Ͻ��� ����� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println("str1.toString() = " + str1.toString());
		
		//���������� ����� ��� �ڵ����� toString() �޼ҵ� ȣ��
		System.out.println("str1 = " + str1);
		System.out.println("=====================================================");
		
		//" " ��ȣ�� �̿��Ͽ� String �ν��Ͻ��� ǥ���� ��� ������ ���ڿ��� ������
		//�ν��Ͻ��� �����ϸ� ���� �ν��Ͻ��� ����
		String str2 = "ABC";//���� �ν��Ͻ� ����
		
		//���������� ���迬���ڷ� ���� ��� ���������� ����� �ν��Ͻ��� �ؽ��ڵ�(HashCode)�� 
		//���Ͽ� ��� ����
		// => String �ν��Ͻ��� ����� ���ڿ��� ���ϴ� ���� �ƴ϶� �ν��Ͻ��� ����� ��ġ�� ��
		// => ���迬���ڷ� String �ν��Ͻ��� ����� ���ڿ� �� �Ұ���
		if(str1 == str2) {
			System.out.println("str1 �� str2�� ����� �ν��Ͻ��� �ؽ��ڵ尡 �����ϴ�.");
		} else {
			System.out.println("str1 �� str2�� ����� �ν��Ͻ��� �ؽ��ڵ尡 �ٸ��ϴ�.");
		}
		System.out.println("=====================================================");
		
		//new �����ڷ� �����ڸ� ȣ���Ͽ� �ν��Ͻ��� �����ϸ� ���ο� �ν��Ͻ��� ����
		String str3 = new String("ABC");
		if(str1 == str3) {
			System.out.println("str1 �� str3�� ����� �ν��Ͻ��� �ؽ��ڵ尡 �����ϴ�.");
		} else {
			System.out.println("str1 �� str3�� ����� �ν��Ͻ��� �ؽ��ڵ尡 �ٸ��ϴ�.");
		}
		System.out.println("=====================================================");
		
		//String.equals(String s) : ����� ���ڿ��� ���޹��� ���ڿ��� ���� ���Ͽ� �ٸ���
		//false�� ��ȯ�ϰ� ������ true�� ��ȯ�ϴ� �޼ҵ�
		if(str1.equals(str3)) {
			System.out.println("str1 �� str3�� ����� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("str1 �� str3�� ����� ���ڿ��� �ٸ��ϴ�.");
		}
		System.out.println("=====================================================");
		
		//equals() �޼ҵ�� ��ҹ��ڸ� �����Ͽ� �񱳰���� ��ȯ
		String str4 = "abc";
		if(str1.equals(str4)) {
			System.out.println("str1 �� str4�� ����� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("str1 �� str4�� ����� ���ڿ��� �ٸ��ϴ�.");
		}
		System.out.println("=====================================================");
		
		//String.equlsIgnoreCase(String s) : ����� ���ڿ��� ���޹��� ���ڿ��� ��ҹ���
		//���о��� ���� ���Ͽ� �ٸ��� false�� ��ȯ�ϰ� ������ true�� ��ȯ�ϴ� �޼ҵ�
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("str1 �� str4�� ����� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("str1 �� str4�� ����� ���ڿ��� �ٸ��ϴ�.");
		}
		System.out.println("=====================================================");
	}
}
