package xyz.itwill.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamApp {
	public static void main(String[] args) throws IOException {
		//DataInputStream : InputStream �ν��Ͻ��� ���޹޾� ���� �����͸� ���ϴ� �ڷ����� 
		//������ ��ȯ�Ͽ� �б� ���� ����� �����ϴ� �Է� ��Ʈ���� �����ϱ� ���� Ŭ����
		DataInputStream in = new DataInputStream(new FileInputStream("c:/data/data.txt"));
		
		//�ݵ�� ���Ͽ� ����� �ڷ����� ������� ���� �о� ���
		// => ���Ͽ� ����� ���� �б� ���� �޼ҵ� ȣ��� EOFException �߻�
		// => EOFException : �Է� �޼ҵ� ȣ��� ���� Ŀ���� EOF ��ġ�� ������ ��� �߻��Ǵ� ����
		
		//DataInputStream.readInt() : �Է� ��Ʈ���� ���� �����͸� ���������� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		int value1 = in.readInt();
		
		//DataInputStream.readBoolean() : �Է� ��Ʈ���� ���� �����͸� ���������� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		boolean value2 = in.readBoolean();
		
		//DataInputStream.readUTF() : �Է� ��Ʈ���� ���� �����͸� ���������� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		String value3 = in.readUTF();
		
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		System.out.println("value3 = " + value3);
		
		in.close();
	}
}
