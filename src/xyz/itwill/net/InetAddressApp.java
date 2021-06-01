package xyz.itwill.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress : ��Ʈ��ũ ����(IP Address�� HostName)�� �����ϱ� ���� Ŭ����
public class InetAddressApp {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress.getLocalHost() : ���� ��ǻ���� ��Ʈ��ũ ������ InetAddress �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		// => UnknownHostException �߻� : HostName�� ��ǻ�͸� �˻��� �� ���� ��� �߻��Ǵ� ����
		// => ���� ��ǻ�Ϳ��� [127.0.0.1]�� IP Address�� [localHost]�� HostName�� �ڵ� ����
		InetAddress myComputer = InetAddress.getLocalHost();
		
		//InetAddress.toString() : InetAddress �ν��Ͻ��� ����� ��Ʈ��ũ ������ ���ڿ���
		//��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ� - �������� ��½� �ڵ� ȣ��Ǵ� �޼ҵ�
		System.out.println("myComputer = " + myComputer);
		
		//InetAddress.getHostName() : InetAddress �ν��Ͻ��� ����� ��Ʈ��ũ ���� ��
		//��ǻ�͸��� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println("myComputer = " + myComputer.getHostName());
		
		//InetAddress.getHostAddress() : InetAddress �ν��Ͻ��� ����� ��Ʈ��ũ ���� ��
		//IP �ּҸ� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println("myComputer = " + myComputer.getHostAddress());
		System.out.println("============================================================");
		
		//InetAddress.getByName(String host) : ���޹��� ��ǻ�͸��� ���� ��Ʈ��ũ ������
		//InetAddress �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		InetAddress itwill = InetAddress.getByName("www.itwill.xyz");
		System.out.println("[www.itwill.xyz]�� IP �ּ� = " + itwill.getHostAddress());
		System.out.println("============================================================");
		
		//InetAddress.getAllByName(String host) : ���޹��� ��ǻ�͸��� ���� ��Ʈ��ũ ������
		//InetAddress �ν��Ͻ��� �迭�� ��ȯ�ϴ� �޼ҵ�
		InetAddress[] daum = InetAddress.getAllByName("www.daum.net");
		for(InetAddress address:daum) {
			System.out.println("[www.daum.net]�� IP �ּ� = " + address.getHostAddress());
		}
		System.out.println("============================================================");
	}
}