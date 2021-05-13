package xyz.itwill.exception;

public class ExceptionHandleApp {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		
		//배열의 요소 표현시 첨자를 잘못 사용한 경우 ArrayIndexOutOfBoundsException 발생
		// => ArrayIndexOutOfBoundsException이 발생된 경우 JVM에 의해 자동으로 예외 처리 
		for(int i = 0; i <= array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}
}
