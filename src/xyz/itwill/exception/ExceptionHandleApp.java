package xyz.itwill.exception;

public class ExceptionHandleApp {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		
		//�迭�� ��� ǥ���� ÷�ڸ� �߸� ����� ��� ArrayIndexOutOfBoundsException �߻�
		// => ArrayIndexOutOfBoundsException�� �߻��� ��� JVM�� ���� �ڵ����� ���� ó�� 
		for(int i = 0; i <= array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}
}
