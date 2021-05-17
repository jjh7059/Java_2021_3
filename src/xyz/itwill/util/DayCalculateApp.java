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
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Scanner in = new Scanner(System.in);
		System.out.print("생년월일 입력[ex.2000-01-01] >> ");
		
		//사용자의 생년월일을 입력받아 저장하기 위한 변수
		String input = in.nextLine();
		
		if(input.charAt(4) != '-' || input.charAt(7) != '-') {
			System.out.println("[에러]입력날짜의 형식이 맞지 않습니다.");
			System.exit(0);
		}
		
		try {
			Date userBirthday = dateFormat.parse(input);
			long birthTime =  (System.currentTimeMillis() / 1000) - (userBirthday.getTime() / 1000);
			System.out.println("[결과]태어난지 " + (birthTime / 86400) + "일 지났습니다.");
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		in.close();
	}
}
