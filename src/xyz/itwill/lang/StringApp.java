package xyz.itwill.lang;

//String : 문자열을 저장하기 위한 클래스
// => 내부적으로 String 인스턴스의 문자열은 byte 배열의 요소에 문자로 저장되어 처리
public class StringApp {
	public static void main(String[] args) {
		//" " 기호를 이용하여 String 인스턴스 표현 가능
		String str1 = "ABC";//String 인스턴스 생성
		
		//String.toString() : String 인스턴스에 저장된 문자열을 반환하는 메소드
		System.out.println("str1.toString() = " + str1.toString());
		
		//참조변수를 출력할 경우 자동으로 toString() 메소드 호출
		System.out.println("str1 = " + str1);
		System.out.println("=====================================================");
		
		//" " 기호를 이용하여 String 인스턴스를 표현할 경우 동일한 문자열을 저장한
		//인스턴스가 존재하면 기존 인스턴스를 재사용
		String str2 = "ABC";//기존 인스턴스 재사용
		
		//참조변수를 관계연산자로 비교할 경우 참조변수의 저장된 인스턴스의 해시코드(HashCode)를 
		//비교하여 결과 제공
		// => String 인스턴스에 저장된 문자열을 비교하는 것이 아니라 인스턴스가 저장된 위치를 비교
		// => 관계연산자로 String 인스턴스에 저장된 문자열 비교 불가능
		if(str1 == str2) {
			System.out.println("str1 과 str2에 저장된 인스턴스의 해시코드가 같습니다.");
		} else {
			System.out.println("str1 과 str2에 저장된 인스턴스의 해시코드가 다릅니다.");
		}
		System.out.println("=====================================================");
		
		//new 연산자로 생성자를 호출하여 인스턴스를 생성하면 새로운 인스턴스를 생성
		String str3 = new String("ABC");
		if(str1 == str3) {
			System.out.println("str1 과 str3에 저장된 인스턴스의 해시코드가 같습니다.");
		} else {
			System.out.println("str1 과 str3에 저장된 인스턴스의 해시코드가 다릅니다.");
		}
		System.out.println("=====================================================");
		
		//String.equals(String s) : 저장된 문자열과 전달받은 문자열을 서로 비교하여 다르면
		//false를 반환하고 같으면 true를 반환하는 메소드
		if(str1.equals(str3)) {
			System.out.println("str1 과 str3에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1 과 str3에 저장된 문자열이 다릅니다.");
		}
		System.out.println("=====================================================");
		
		//equals() 메소드는 대소문자를 구분하여 비교결과를 반환
		String str4 = "abc";
		if(str1.equals(str4)) {
			System.out.println("str1 과 str4에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1 과 str4에 저장된 문자열이 다릅니다.");
		}
		System.out.println("=====================================================");
		
		//String.equlsIgnoreCase(String s) : 저장된 문자열과 전달받은 문자열을 대소문자
		//구분없이 서로 비교하여 다르면 false를 반환하고 같으면 true를 반환하는 메소드
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("str1 과 str4에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1 과 str4에 저장된 문자열이 다릅니다.");
		}
		System.out.println("=====================================================");
	}
}
