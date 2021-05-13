package xyz.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//키보드로 정수값을 두 개를 입력받아 나눈 몫을 출력하는 프로그램
public class CalcApp {
	public CalcApp() throws InputMismatchException, ArithmeticException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 >> ");
		//nextInt() : 정수값이 아닌 값이 입력되면 InputMissMatchException 발생
		int num1 = in.nextInt();
		
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = in.nextInt();
		
		//0으로 나눈경우 ArithmeticException
		System.out.println("[결과] = " + num1 + " / " + num2 + " = " + (num1 / num2));
		
		in.close();
	}
	
	public static void main(String[] args) {
		/*
		try {
			new CalcApp();//생성자를 이용하여 인스턴스 생성 >> 생성자의 명령 실행
		} catch (InputMismatchException e) {
			System.out.println("[에러]정수만 입력 가능합니다.");
		} catch (ArithmeticException e) {
			System.out.println("[에러]0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			//Exception : 모든 예외 클래스의 부모 클래스
			// => 모든 예외를 전달받아 예외 처리
			System.out.println("[에러]프로그램 실행에 예기치 못한 오류가 발생되었습니다.");
		}
		*/
		
		try {
			new CalcApp();
		} catch (InputMismatchException | ArithmeticException e) {
			//JDK7 이상에서는 예외 클래스를 | 연산자로 연결하여 예외 처리 가능
			System.out.println("[에러]형식에 맞게 값을 입력해주세요.");
		} catch (Exception e) {
			
			System.out.println("[에러]프로그램 실행에 예기치 못한 오류가 발생되었습니다.");
		}
	}
}
