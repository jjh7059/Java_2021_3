package xyz.itwill.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


//키보드로 이름과 태어난 년도를 입력받아 이름과 나이를 출력하는 프로그램
public class ConsoleIOApp {
	public static void main(String[] args) throws IOException {
		//Java에서 제공되는 키보드 입력 스트림의 대량의 문자 데이터를 입력받을 수 있는
		//기능을 제공하는 스트림으로 대용량 입력 스트림으로 확장하여 저장
		//System.in : Java에서 제공되는 키보드 입력 스트림으로 원시데이터 하나를 반환하는 
		//기능 제공하는 스트림
		//InputStreamReader : InputStream 인스턴스를 전달받아 입력 스트림을 확장하여 
		//문자 데이터 하나를 반환하는 기능 제공하는 스트림
		//BufferedReader : Reader 인스턴스를 전달받아 입력 스트림을 확장하여 대량의 문자
		//데이터(문자열)를 반환하는 기능을 제공하는 스트림
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out : Java에서 제공되는 모니터 출력 스트림으로 원시데이터 하나를 반환하는
		//기능을 제공하는 스트림 - PrintStream 클래스를 이용하여 생성된 출력 스트림
		// => print() 또는 println() 메소드를 이용하여 모든 값을 원시데이터로 변환하여 전달
		System.out.print("이름 입력 >> ");
		
		//BufferedReader.readLine() : 입력 스트림에 존재하는 모든 입력값을 문자열로 변환하여 반환하는 메소드
		String name = in.readLine();
		
		System.out.print("태어난 년도 입력 >> ");
		int birthYear = Integer.parseInt(in.readLine());
		
		int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear + 1;
		
		System.out.println("[결과]" + name + "님의 나이는 " + age + "살입니다.");
	}
}
