package xyz.itwill.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//���� ��ư�� ���� ��� ĵ������ ������ �����ϴ� ���α׷�
public class ActionCommandApp extends Frame{
	private static final long serialVersionUID = 1L;
	
	//�̺�Ʈ �ڵ鷯 �޼ҵ忡�� ����� ���۳�Ʈ �Ǵ� �����̳ʴ� �ʵ�� ����
	Button red, green, blue, white;
	Canvas canvas;
	
	public ActionCommandApp(String title) {
		super(title);
		
		red = new Button("������");
		green = new Button("�ʷϻ�");
		blue = new Button("�Ķ���");
		white = new Button("�Ͼ��");
		
		Panel panel = new Panel();
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(white);
		
		canvas = new Canvas();
		
		add(panel, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		
		panel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		panel.setBackground(Color.GRAY);
		
		white.setEnabled(false);
		
		red.addActionListener(new RedButtonEventHandler());
		green.addActionListener(new GreenButtonEventHandler());
		blue.addActionListener(new BlueButtonEventHandler());
		white.addActionListener(new WhiteButtonEventHandler());
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(800, 200, 400, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ActionCommandApp("ActionCommand");
	}
	
	//��� ���� ��ư�� Ȱ��ȭ ó���ϴ� �޼ҵ� - �ʱ�ȭ
	public void initColorButton() {
		red.setEnabled(true);
		green.setEnabled(true);
		blue.setEnabled(true);
		white.setEnabled(true);
	}
	
	public class RedButtonEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initColorButton();
			red.setEnabled(false);
			
			canvas.setBackground(Color.RED);
		}
	}
	
	public class GreenButtonEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initColorButton();
			green.setEnabled(false);
			
			canvas.setBackground(Color.GREEN);
		}
	}
	
	public class BlueButtonEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initColorButton();
			blue.setEnabled(false);

			canvas.setBackground(Color.BLUE);
		}
	}
	
	public class WhiteButtonEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initColorButton();
			white.setEnabled(false);
			
			canvas.setBackground(Color.WHITE);
		}
	}
}
