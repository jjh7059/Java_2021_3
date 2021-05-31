package xyz.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//Ű����� �޽����� �Է¹޾� ������ �����Ͽ� ���� ������ �޽����� �����ϴ� Ŭ���̾�Ʈ ���α׷�
public class EchoClientApp {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �޽��� �Է� >> ");
		String message = in.readLine();
		
		try {
			//���� ����
			Socket socket = new Socket("localhost", 4000);
			
			//������ ��� ��Ʈ���� ��ȯ�޾� ���ڿ��� ������ �� �ֵ��� Ȯ��
			/*
			BufferedWriter out = new BufferedWriter
					(new OutputStreamWriter(socket.getOutputStream()));
			
			out.write(message);
			out.flush();
			*/
			
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			out.println(message);
			out.flush();
			
			socket.close();
			
		} catch (IOException e) {
			System.out.println("[����]������ ������ �� �����ϴ�.");
		}
	}
}
