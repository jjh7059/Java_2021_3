package xyz.itwill.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

//InetAddress : 네트워크 정보(IP Address와 HostName)를 저장하기 위한 클래스
public class InetAddressApp {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress.getLocalHost() : 로컬 컴퓨터의 네트워크 정보를 InetAddress 인스턴스로 반환하는 메소드
		// => UnknownHostException 발생 : HostName의 컴퓨터를 검색할 수 없는 경우 발생되는 예외
		// => 현재 컴퓨터에는 [127.0.0.1]의 IP Address와 [localHost]의 HostName이 자동 제공
		InetAddress myComputer = InetAddress.getLocalHost();
		
		//InetAddress.toString() : InetAddress 인스턴스에 저장된 네트워크 정보를 문자열로
		//변환하여 반환하는 메소드 - 참조변수 출력시 자동 호출되는 메소드
		System.out.println("myComputer = " + myComputer);
		
		//InetAddress.getHostName() : InetAddress 인스턴스에 저장된 네트워크 정보 중
		//컴퓨터명을 문자열로 반환하는 메소드
		System.out.println("myComputer = " + myComputer.getHostName());
		
		//InetAddress.getHostAddress() : InetAddress 인스턴스에 저장된 네트워크 정보 중
		//IP 주소를 문자열로 반환하는 메소드
		System.out.println("myComputer = " + myComputer.getHostAddress());
		System.out.println("============================================================");
		
		//InetAddress.getByName(String host) : 전달받은 컴퓨터명에 대한 네트워크 정보를
		//InetAddress 인스턴스로 반환하는 메소드
		InetAddress itwill = InetAddress.getByName("www.itwill.xyz");
		System.out.println("[www.itwill.xyz]의 IP 주소 = " + itwill.getHostAddress());
		System.out.println("============================================================");
		
		//InetAddress.getAllByName(String host) : 전달받은 컴퓨터명에 대한 네트워크 정보를
		//InetAddress 인스턴스로 배열로 반환하는 메소드
		InetAddress[] daum = InetAddress.getAllByName("www.daum.net");
		for(InetAddress address:daum) {
			System.out.println("[www.daum.net]의 IP 주소 = " + address.getHostAddress());
		}
		System.out.println("============================================================");
	}
}
