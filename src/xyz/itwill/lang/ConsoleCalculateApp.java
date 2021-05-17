package xyz.itwill.lang;

import java.util.Scanner;

//키보드로 연산식을 입력받아 연산결과를 출력하는 프로그램을 작성하세요.
//ex) 연산식 입력 >> 20 + 10
//    [결과]30
// => 입력 연산식에서 사용 가능한 연산자는 사칙 연산자(*,/,+,-)만 허용
// => 형식에 맞지 않은 연산식이 입력될 경우 에러 메시지 출력 후 프로그램 종료
// => 입력 연산식에 공백이 입력 가능 하도록 처리

// * 연산자를 찾고 연산자를 기준점으로 앞값 뒷값 분리 후 계산 
//String클래스 (replace, indexof, substring, equals 메소드) 사용

public class ConsoleCalculateApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("연산식 입력 >> ");
		
		//입력된 연산식을 저장하기 위한 변수
		String fomula = in.nextLine().trim().replace(" ", "");
		
		int result = 0;//결과값을 저장하기 위한 변수
		
		//연산자를 기준으로 정수를 분리하여 저장하기 위한 반복문
		for(int i = 0; i < fomula.length(); i++) {
			//두 피연산자를 저장하기 위한 변수
			int a = 0, b = 0;
			if(fomula.charAt(i) == '+' || fomula.charAt(i) == '-' || fomula.charAt(i) == '*' || 
					fomula.charAt(i) == '/') {
				a = Integer.parseInt(fomula.substring(0, i));
				b = Integer.parseInt(fomula.substring(i+1));
				
				switch(fomula.charAt(i)) {
				case '+': result = a + b; break;
				case '-': result = a - b; break;
				case '*': result = a * b; break;
				case '/': result = a / b; break;
				}
				
				break;
			}
		}
		System.out.println("[결과]" + result);
		
		in.close();
	}
}
