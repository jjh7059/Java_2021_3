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
	
	//JWindow.paint(Graphics g) : �����̳�(JFrame, JWindow, JDialog ��)�� ����ϴ� �޼ҵ�
	//paint() �޼ҵ�� �����̳� ���� �̺�Ʈ�� �߻��� ��� �ڵ� ȣ��
	// => ���α׷��� ����Ǿ� �����̳ʰ� ������ ���
	// => ���α׷��� �����ܿ��� �����Ǿ� �����̳ʰ� ������ ���
	// => �����̳��� ũ�Ⱑ ����� ���
	@Override
	public void paint(Graphics g) {
		System.out.println("[" + Thread.currentThread().getName() + "] �̸��� �����忡 ���� paint() �޼ҵ� ȣ��" );
		
		super.paint(g);
	}
	
}
