package xyz.itwill.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//Character Stream : ���ڵ� ó���� ���ڵ�����(2byte)�� �����ϱ� ���� �Է� �Ǵ� ��� ��Ʈ��
//=> Reader Ŭ���� �Ǵ� Writer Ŭ������ ��ӹ��� �ڽ� Ŭ������ ������ ��Ʈ��(�ν��Ͻ�)

//Ű���� �Է°��� ���ڵ� ó���� ���� �����ͷ� �Է¹޾� ����Ϳ� ����ϴ� ���α׷�
//=> EOF(End Of File : �Է� ���� - Ctrl+Z) ��ȣ�� �����ϸ� ���α׷� ���� 
public class CharacterStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޽���]Ű���带 ���� ���� �Է��� �ּ���.[����:Ctrl+z]");
		
		//InputStreamReader : ���ڵ� ó���� ���� �����͸� ��ȯ�ϱ� ���� ����� �����ϴ� Ŭ����
		// => InputStream �ν��Ͻ��� ���޹޾ƾ� �Է� ��Ʈ�� ���� ���� - Ȯ�� ��Ʈ��
		InputStreamReader in = new InputStreamReader(System.in);
		
		//OutputStreamWriter : ���ڵ� ó���� ���� �����͸� �����ϱ� ���� ����� �����ϴ� Ŭ����
		// => OutputStream �ν��Ͻ��� ���޹޾ƾ� ��� ��Ʈ�� ���� ���� - Ȯ�� ��Ʈ��
		//OutputStreamWriter out = new OutputStreamWriter(System.out);
		
		//PrintWriter : ���ڵ� ó���� ���� �����͸� �����ϱ� ���� ����� �����ϴ� Ŭ����
		// => ��� ���� ���� �����ͷ� ��ȯ�Ͽ� �����ϴ� �޼ҵ尡 �߰��� Ŭ����
		PrintWriter out = new PrintWriter(System.out);
	
		int readByte;
		
		while(true) {
			//Reader.read() : �Է� ��Ʈ���� �����ϴ� ���� ���ڵ� ó���� ���� ������(2byte)�� 
			//�о� ��ȯ�ϴ� �޼ҵ�
			readByte = in.read();
			
			if(readByte == -1) break;
			
			//Write.write() : ��� ��Ʈ���� ���ڵ� ó���� ���� �����͸� �����ϴ� �޼ҵ�				
			// => ���� �����͸� ���� ũ�⸸ŭ ��Ƽ� �ѹ��� ��� ��Ʈ���� ����
			out.write(readByte);	
			//Writer.flush() : ��� ���ۿ� ����� ���� �����͸� ��� ��Ʈ������ �����ϴ� �޼ҵ�
			out.flush();
			
		}
		System.out.println("[�޽���]���α׷��� �����մϴ�.");
	}
}
