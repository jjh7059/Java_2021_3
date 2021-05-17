package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출력하는 프로그램을 작성하세요.
//ex) 생년월일 입력[ex.2000-01-01] >> 2021-05-16
//    [결과]태어난지 1일 지났습니다.
// => 형식에 맞지 않은 생년월일을 입력한 경우 에러 메시지 출력 후 프로그램 종료

//simpledateformat(parse메소드), date(getTime메소드) 사용
public class DayCalculateApp {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Scanner in = new Scanner(System.in);
		System.out.print("생년월일 입력[ex.2000-01-01] >> ");
		
		//사용자의 생년월일을 입력받아 저장하기 위한 변수
		String input = in.nextLine();
		
		try {
			Date userBirthday = dateFormat.parse(input);
			System.out.println(userBirthday);
			System.out.println(userBirthday.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
