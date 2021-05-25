package xyz.itwill.swing;

import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintApp extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public PaintApp(String title) {
		super(title);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(800, 200, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PaintApp("Paint");
	}
	
	//JWindow.paint(Graphics g) : 컨테이너(JFrame, JWindow, JDialog 등)를 출력하는 메소드
	//paint() 메소드는 컨테이너 관련 이벤트가 발생될 경우 자동 호출
	// => 프로그램이 실행되어 컨테이너가 보여질 경우
	// => 프로그램이 아이콘에서 해제되어 컨테이너가 보여질 경우
	// => 컨테이너의 크기가 변경될 경우
	@Override
	public void paint(Graphics g) {
		System.out.println("[" + Thread.currentThread().getName() + "] 이름의 스레드에 의해 paint() 메소드 호출" );
		
		super.paint(g);
	}
	
}
