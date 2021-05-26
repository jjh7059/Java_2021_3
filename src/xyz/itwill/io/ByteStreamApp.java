package xyz.itwill.io;

import java.io.IOException;

//Byte Stream : ���õ����ͷ� �����ϱ� ���� �Է� �Ǵ� ��� ��Ʈ��
// => InputStream Ŭ���� �Ǵ� OutputStream Ŭ������ ��ӹ��� �ڽ� Ŭ������ ������ ��Ʈ��(�ν��Ͻ�)

//Ű���� �Է°��� ���õ����ͷ� �Է¹޾� ����Ϳ� ����ϴ� ���α׷�
// => EOF(End Of File : �Է� ���� - Ctrl+Z) ��ȣ�� �����ϸ� ���α׷� ���� 
public class ByteStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޽���]Ű���带 ���� ���� �Է��� �ּ���.[����:Ctrl+z]");
		
		//Ű���� �Է°��� ��ȯ�޾� �����ϱ� ���� ����
		int readByte;
		
		while(true) {
			//System.in : Java���� �⺻������ �����Ǵ� Ű���� �Է� ��Ʈ��
			// => InputStream Ŭ������ ��ӹ��� �ڽ�Ŭ������ ������ ��Ʈ��
			//InputStream.read() : �Է� ��Ʈ���� �����ϴ� ���� ���� ������(1byte)�� �о� ��ȯ�ϴ� �޼ҵ�
			// => �Է� ��Ʈ���� ���� ���� ��� ������ �Ͻ� ����
			// => Ű���带 ���� �Է� ��Ʈ���� ���� �����ϰ� ����(�ڵ尪 - 13)�� ���� �����带 �����
			//��� �Է� �Ǵ� ��� ��Ʈ���� �޼ҵ忡���� IOException �߻� - ���� ó��
			// => IOException : �Է� �Ǵ� ��� ��Ʈ���� ������ �ִ� ��� �߻��Ǵ� ����
			readByte = System.in.read();
			
			//�Է� ���� ��ȣ(Ctrl + z : EOF >> -1)�� ���޵� ��� �ݺ��� ����
			if(readByte == -1) break;
			
			//System.out : Java���� �⺻������ �����Ǵ� ����� ��� ��Ʈ��
			// => OuputStream Ŭ������ ��ӹ��� �ڽ�Ŭ����(PrintStream)�� ������ ��Ʈ��
			//OutputStream.write(int b) : ���� ������(1Byte)�� ��� ��Ʈ������ �����ϴ� �޼ҵ�
			System.out.write(readByte);
		}
		
		System.out.println("[�޽���]���α׷��� �����մϴ�.");
	}
}
