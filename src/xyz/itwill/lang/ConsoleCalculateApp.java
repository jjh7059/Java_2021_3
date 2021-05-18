package xyz.itwill.lang;

import java.util.Scanner;

//키보드로 연산식을 입력받아 연산결과를 출력하는 프로그램을 작성하세요.
//ex) 연산식 입력 >> 20 + 10
//    [결과]30
// => 입력 연산식에서 사용 가능한 연산자는 사칙 연산자(*,/,+,-)만 허용
// => 형식에 맞지 않은 연산식이 입력될 경우 에러 메시지 출력 후 프로그램 종료 (연산자의 유무에 대한 검증)
// => 입력 연산식에 공백이 입력 가능 하도록 처리

// * 연산자를 찾고 연산자를 기준점으로 앞값 뒷값 분리 후 계산 
//String클래스 (replace, indexof, substring, equals 메소드) 사용

public class ConsoleCalculateApp {
	public static void main(String[] args) {
		//선생님 풀이
		Scanner in = new Scanner(System.in);
		
		System.out.print("연산식 입력 >> ");
		String operation = in.nextLine().replace(" ", "");
		in.close();
		
		String[] operatorArray = {"+", "-", "*", "/"};
		
		int index = -1;
		for(String str:operatorArray) {
			//String.lastIndexOf(String s) : String 인스턴스에 저장된 문자열에서 검색
			//문자열을 뒤부터 검색하여 시작위치를 반환하는 메소드
			// ex) 입력 식이 (-20 + 10)인 경우를 대비해 뒤에서부터 연산자를 검색
			index = operation.lastIndexOf(str);
			
			//연산식에서 연산자가 검색된 경우 반복문을 종료
			if(index != -1) break;
		}
		
		//연산자가 없거나 위치가 잘못된 경우 종료
		if(index <= 0 || index >= operation.length() - 1) {
			System.out.println("[에러]연산식을 잘못 입력 하였습니다.");
			System.exit(0);
		}
		
		try {
			//연산식에서 연산자와 피연산자를 분리하여 저장
			int num1 = Integer.parseInt(operation.substring(0, index));
			String operator = operation.substring(index, index + 1);
			int num2 = Integer.parseInt(operation.substring(index + 1));
			
			//연산 결과값
			int result = 0;
			switch(operator) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			}
			
			//결과 출력
			System.out.println("[결과]" + result);
			
		} catch (NumberFormatException e) {
			System.out.println("[에러]연산식에 숫자가 형식이 아닌 문자가 입력 되었습니다.");
		} catch (ArithmeticException e) {
			System.out.println("[에러]0으로 나눌 수 없습니다..");
		} catch (Exception e) {
			System.out.println("[에러]예기치 못한 오류가 발생하였습니다.");
		}
		
		//내 풀이
		/*
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
		*/
	}
}
