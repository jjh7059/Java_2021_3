package xyz.itwill.event;

import java.awt.Frame;

//���� ��ư�� ���� ��� ĵ������ ������ �����ϴ� ���α׷�
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
