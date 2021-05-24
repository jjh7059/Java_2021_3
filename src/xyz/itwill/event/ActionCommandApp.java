package xyz.itwill.event;

import java.awt.Frame;

//색상 버튼을 누른 경우 캔버스의 배경색을 변경하는 프로그램
public class ActionCommandApp extends Frame{
	private static final long serialVersionUID = 1L;
	
	public ActionCommandApp(String title) {
		super(title);
		
		setBounds(800, 200, 400, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ActionCommandApp("ActionCommand");
	}
}
