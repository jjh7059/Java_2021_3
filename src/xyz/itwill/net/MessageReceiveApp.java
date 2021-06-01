package xyz.itwill.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//���� ��ǻ�Ϳ��� ������ �޽����� ���޹޾� ����ϴ� UDP ����� ��Ʈ��ũ ���α׷�
public class MessageReceiveApp {
	public static void main(String[] args) throws IOException {
		//DatagramSocket(int port) �����ڷ� �����͸� ���޹ޱ� ���� ���� ����
		// => �ٸ� ��ǻ���� ���� ���
		DatagramSocket socket = new DatagramSocket(5000);
		
		//���޹��� �����͸� �����ϱ� ���� byte �迭 ����
		byte[] data = new byte[1024];
		
		//���� ��ǻ�Ϳ��� ������ ��Ŷ�� �����ϱ� ���� DatagramPacket �ν��Ͻ� ����
		// => DatagramPacket(byte[] buf, int length) ������ �̿�
		DatagramPacket packet = new DatagramPacket(data, data.length);
		
		System.out.println("�޽��� ������...");
		//DatagramSocket.receive(DatagramPacket packet) : ���� ��ǻ�Ϳ��� ������ ��Ŷ�� �����ϱ� ���� �޼ҵ�
		// => ��Ŷ�� �ޱ� ������ ������ �Ͻ� ����
		socket.receive(packet);
		
		//DatagramPacket �ν��Ͻ��� ����� byte �迭�� String �ν��Ͻ��� ��ȯ�Ͽ� ����
		String message = new String(data);
		
		System.out.println("[���]�޽��� = " + message);
		
		socket.close();
	}
}
