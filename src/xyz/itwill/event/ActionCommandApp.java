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
		
		/*
		red.addActionListener(new RedButtonEventHandler());
		green.addActionListener(new GreenButtonEventHandler());
		blue.addActionListener(new BlueButtonEventHandler());
		white.addActionListener(new WhiteButtonEventHandler());
		*/
		
		red.addActionListener(new ColorButtonEventHandler());
		green.addActionListener(new ColorButtonEventHandler());
		blue.addActionListener(new ColorButtonEventHandler());
		white.addActionListener(new ColorButtonEventHandler());
		
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
	
	/*
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
	*/
	
	public class ColorButtonEventHandler implements ActionListener{
		//�̺�Ʈ �ڵ鷯 �޼ҵ��� �Ű��������� �̺�Ʈ �ҽ��� ���� ������ XXXEvent �ν��Ͻ���
		//�ڵ����� ���޵Ǿ� ����
		// => �Ű������� ����� �̺�Ʈ ������ �̿��Ͽ� �̺�Ʈ �ҽ� ����
		@Override
		public void actionPerformed(ActionEvent e) {
			red.setEnabled(true);
			green.setEnabled(true);
			blue.setEnabled(true);
			white.setEnabled(true);
			
			//�̺�Ʈ �ҽ��� �����Ͽ� �̺�Ʈ ó��
			//ActionEvent.getActionCommand() : ActionEvent�� �߻���Ų �̺�Ʈ �ҽ���
			//ActionCommand�� ��ȯ�ϴ� �޼ҵ�
			//ActionCommand : ActionEvent�� �߻���Ų ���۳�Ʈ�� �̸�(���ڿ�)
			// => Button ���۳�Ʈ�� ��ư �󺧸��� ActionCommand�� ����
			String actionCommand = e.getActionCommand();
			
			if(actionCommand.equals("������")) {
				red.setEnabled(false);
				canvas.setBackground(Color.RED);
			} else if(actionCommand.equals("�ʷϻ�")) {
				green.setEnabled(false);
				canvas.setBackground(Color.GREEN);
			} else if(actionCommand.equals("�Ķ���")) {
				blue.setEnabled(false);
				canvas.setBackground(Color.BLUE);
			} else if(actionCommand.equals("�Ͼ��")) {
				white.setEnabled(false);
				canvas.setBackground(Color.WHITE);
			}
		}
	}
}
