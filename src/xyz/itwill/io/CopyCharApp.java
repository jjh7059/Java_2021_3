package xyz.itwill.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//�������Ͽ� ����� ���� ���ڵ� ó���� �����ͷ� �о� ������Ͽ� �����Ͽ� �����ϴ� ���α׷�
// => ���������� ���ڵ� ó���Ͽ� ������Ϸ� �����ϹǷ� �������� ���� �Ұ���
// => �ؽ�Ʈ ���ϸ� ���� ����
public class CopyCharApp {
	public static void main(String[] args) throws IOException {
		//BufferedReader : Reader �ν��Ͻ��� ���޹޾� �뷮�� ���ڵ� ó���� ���� �����͸� ���
		//���� ����� �����ϴ� �Է� ��Ʈ���� �����ϱ� ���� Ȯ�� Ŭ����
		BufferedReader in = null;
		
		//BufferedWriter : Writer �ν��Ͻ��� ���޹޾� �뷮�� ���ڵ� ó���� ���� �����͸� ����
		//�ϴ� ����� �����ϴ� ��� ��Ʈ���� �����ϱ� ���� Ȯ�� Ŭ����
		BufferedWriter out = null;
		
		try {
			//in = new BufferedReader(new FileReader("c:/data/zoom.txt"));
			//out = new BufferedWriter(new FileWriter("c:/data/zoom_char.txt"));
			
			in = new BufferedReader(new FileReader("c:/data/back.jpg"));
			out = new BufferedWriter(new FileWriter("c:/data/back_char.jpg"));
			
			int readByte;
			while(true) {
				readByte = in.read();
				if(readByte == -1) break;
				out.write(readByte);
			}
			
			System.out.println("[�޽���]������ ���������� ���� �Ͽ����ϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("[����]���� ������ ã�� �� �����ϴ�.");
		} finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
	}
}
