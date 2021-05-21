package xyz.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//이벤트 핸들러 클래스를 선언하지 않고 직접 이벤트 핸들러를 등록하여 이벤트 처리
public class EventAnnonymousHandlerApp extends Frame{
	private static final long serialVersionUID = 1L;

	public EventAnnonymousHandlerApp(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		Button button = new Button("프로그램 종료");
		add(button);
		
		//추상 클래스와 인터페이스는 인터페이스 생성 불가능
		// => 클래스가 상속받아 사용하기 위한 상속 전용 자료형
		// => 자식 클래스는 추상 클래스 또는 인터페이스의 모든 추상 메소드를 오버라이드 선언해야만 인스턴스 생성 가능
		//추상 클래스와 인터페이스는 모든 추상 메소드를 직접 오버라이드 선언하여 인스턴스 생성 가능
		// => 자식 클래스의 이름을 명시하지 않는 익명의 내부 클래스로 인스턴스 생성 - Annonymous Inner Class
		// => 익명의 내부 클래스는 하나의 인스턴스만 생성
		//이 방법은 이벤트 종류(소스)의 갯수가 적을 때 적절함
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(800, 200, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventAnnonymousHandlerApp("EventHandle");
	}
}
