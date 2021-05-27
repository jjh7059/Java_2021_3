package xyz.itwill.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

//���Ͽ� ����� ���� ���ڵ� ó���� ���� �����ͷ� �Է¹޾� ����Ϳ� �����Ͽ� ����ϴ� ���α׷�
public class FileCharLoadApp {
	public static void main(String[] args) throws IOException {
		//FileReader : ���Ͽ� ����� ���� ���ڵ� ó���� ���� �����ͷ� �д� �Է� ��Ʈ���� �����ϱ� ���� Ŭ����
		FileReader in = null;
		try {
			//FileReader(String name) : ���ϰ�θ� ���޹޾� ���� �Է� ��Ʈ���� �����ϴ� ������
			// => ���޹��� ���ϰ�ο� ������ ���� ��� FileNotFoundException �߻� - ����ó��(�ʼ�)
			in = new FileReader("c:/data/char.txt");
			
			//������� ���ڵ� ó���� ���� �����͸� �����ϴ� ��� ��Ʈ�� ���� - Ȯ��
			OutputStreamWriter out = new OutputStreamWriter(System.out);
			
			System.out.println("[�޽���]c:\\data\\char.txt ���Ͽ� ����� �����Դϴ�.");
			int readByte;
			while(true) {
				readByte = in.read();
				if(readByte == -1) break;
				out.write(readByte);
				out.flush();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("[����]��� ������ ã�� �� �����ϴ�.");
		} finally {
			if(in != null) in.close();
		}
	}
}
