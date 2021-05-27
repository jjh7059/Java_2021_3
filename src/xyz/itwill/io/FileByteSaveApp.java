package xyz.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;

//Ű���� �Է°��� ���� �����ͷ� �Է¹޾� ���Ͽ� �����Ͽ� �����ϴ� ���α׷�
// => EOF(End Of File - Ctrl+z) ��ȣ�� �����ϸ� ���α׷� ����
public class FileByteSaveApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޽���]Ű���带 ���� ���� �Է��� �ּ���.[����:Ctrl+z]");
		
		//FileOutputStream : ���Ͽ� ���� �����͸� �����Ͽ� �����ϴ� ��� ��Ʈ���� �����ϱ� ���� Ŭ����
		//FileOutputStream(String name) : ���ϰ�θ� ���޹޾� ���� ��� ��Ʈ���� �����ϴ� ������
		// => ���޹��� ���� ��ο� ������ ���� ��� FileNotFoundException �߻� - ���� ó��(����)
		// => ���޹��� ���� ��ο� ������ ���� ��� ������ �ڵ����� ����� ��� ��Ʈ�� �����Ͽ� ��ȯ
		// => ���޹��� ���� ��ο� ������ �ִ� ��� ���� ������ ���� ��� ���ο� ������ ���޹޾� ���� - ������(OverWrite)
		//FileOutputStream out = new FileOutputStream("c:/data/byte.txt");
		
		//FileOutputStream(String name, boolean append) : ���ϰ�ο� ������ ���޹޾� ����
		//��� ��Ʈ���� �����ϴ� ������
		// => false : ���� ���� �����(�⺻), true : ���� ���� �̾��
		FileOutputStream out = new FileOutputStream("c:/data/byte.txt", true);
		
		int readByte;
		while(true) {
			//Ű���� �Է� ��Ʈ���� ���� ���� �����ͷ� �о� ������ ����
			//FileNotFoundException Ŭ������ IOException Ŭ������ �ڽ� Ŭ����
			readByte = System.in.read();
			if(readByte == -1) break;
			//���� �����Ͱ� ����� �������� ���� ��� ��Ʈ���� ���� - ���� ����
			out.write(readByte);
		}
		
		//FileOutputStream.close() : ���� ��� ��Ʈ���� �����ϴ� �޼ҵ�
		// => ���Ͽ��� �Է� ��Ʈ���� ��� ��Ʈ���� ���� �ϳ��� ���� ����
		// => ���� ó���� ���� ������ ��Ʈ���� ��� �� �ݵ�� ����
		out.close();
		System.out.println("[�޽���]c:\\data\\byte.txt ���Ͽ� Ű���� �Է°��� ����Ǿ����ϴ�.");
	}
}
