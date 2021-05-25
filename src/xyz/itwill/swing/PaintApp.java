package xyz.itwill.swing;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

//�����ӿ��� ���콺 ��ư�� Ŭ���� ��ġ�� ��ǥ���� ���ڿ��� ����ϴ� ���α׷�
public class PaintApp extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//���콺 ��ư�� Ŭ���� ��ġ�� ��ǥ���� �����ϱ� ���� �ʵ�
	private int x, y;
	
	public PaintApp(String title) {
		super(title);
		
		//�����ӿ��� �߻��Ǵ� MouseEvent�� ó���ϱ� ���� �̺�Ʈ �ڵ鷯 ���
		// => MouseAdapter Ŭ������ ��ӹ��� Anonymous Inner Class�� �̺�Ʈ �ڵ鷯 ���
		addMouseListener(new MouseAdapter() {
			//���콺 ��ư�� ���� ��� ȣ��Ǵ� �̺�Ʈ �ڵ鷯 �޼ҵ带 �������̵� ����
			@Override
			public void mouseClicked(MouseEvent e) {
				//MouseEvent.getX() : ���콺 �̺�Ʈ�� �߻��� x ��ǥ���� ��ȯ�ϴ� �޼ҵ�
				x = e.getX();
				
				//MouseEvent.getY() : ���콺 �̺�Ʈ�� �߻��� y ��ǥ���� ��ȯ�ϴ� �޼ҵ�
				y = e.getY();
				
				//Window.repaint() : paint() �޼ҵ带 ȣ���ϴ� �޼ҵ�
				// => paint() �޼ҵ带 ���� ȣ���� �� ���� �� ���Ǵ� �޼ҵ�
				//paint(getGraphics());
				repaint();
			}
		});
		
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
	
	//Graphics : �����̳ʿ� �׸��� �׸��� ���� ����� �����ϴ� Ŭ����
	// => paint() �޼ҵ尡 ȣ��� �� �Ű������� Graphics �ν��Ͻ��� �ڵ����� ����
	@Override
	public void paint(Graphics g) {
		//System.out.println("[" + Thread.currentThread().getName() + "] �̸��� �����忡 ���� paint() �޼ҵ� ȣ��" );
		
		//�θ� Ŭ������ ������ �޼ҵ� ȣ�� - �����̳� �ʱ�ȭ
		super.paint(g);
		
		/*
		g.setColor(Color.RED);
		g.drawRect(40, 40, 50, 50);
		g.fillRect(20, 100, 100, 50);
		
		g.setColor(Color.GREEN);
		g.drawOval(125, 175, 50, 50);
		g.fillOval(100, 250, 100, 50);
		
		g.setColor(Color.BLUE);
		g.drawLine(100, 320, 200, 320);
		g.drawString("ȫ�浿", 100, 350);
		*/
		
		g.drawString("[" + x + ", " + y + "]", x, y);
	}
}
