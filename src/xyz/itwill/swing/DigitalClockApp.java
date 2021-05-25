package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//��¥�� �ð��� ����ϴ� GUI ���α׷�
public class DigitalClockApp extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//��¥�� �ð��� ����ϱ� ���� ���۳�Ʈ
	private JLabel clockLabel;
	
	//�����带 �Ͻ� �����ϰų� �ٽ� �����ϱ� ���� ���۳�Ʈ
	private JButton startBtn, stopBtn;
	
	//��¥�� �ð������� �����ϴ� �������� ���� ���¸� �����ϱ� ���� �ʵ�
	// => false : ������ ���� ����, true : ������ ���� ����
	private boolean isRun;
	
	public DigitalClockApp(String title) {
		super(title);
		
		isRun = true;
		
		//clockLabel = new JLabel("2021�� 05�� 25�� 16�� 55�� 30��", JLabel.CENTER);
		clockLabel = new JLabel("", JLabel.CENTER);
		clockLabel.setFont(new Font("����", Font.BOLD, 30));
		clockLabel.setForeground(Color.DARK_GRAY);
		
		
		startBtn = new JButton("�ٽ� ����");
		stopBtn = new JButton("�Ͻ� ����");
		JPanel panel = new JPanel();
		panel.add(startBtn);
		panel.add(stopBtn);
		startBtn.setFont(new Font("����", Font.BOLD, 20));
		stopBtn.setFont(new Font("����", Font.BOLD, 20));
		startBtn.setEnabled(false);
		
		getContentPane().add(clockLabel, BorderLayout.CENTER);
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		//���ο� �����带 �����Ͽ� run() �޼ҵ��� ��� ����
		new ClockThread().start();
		
		//��ư�� ���� ��� �̺�Ʈ �ڵ鷯 Ŭ������ �޼ҵ尡 ȣ��ǵ��� �̺�Ʈ �ڵ鷯 ���
		startBtn.addActionListener(new ButtonEventHandler());
		stopBtn.addActionListener(new ButtonEventHandler());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 200, 600, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DigitalClockApp("DigitalClock");
	}
	
	//�ý����� ���� ��¥�� �ð� ������ ���� ���۳�Ʈ�� �����ϴ� ������ Ŭ����
	public class ClockThread extends Thread {
		@Override
		public void run() {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
			
			while(true) {
				if(isRun) {
					/*
					Date now = new Date();
					String clock = dateFormat.format(now);
					clockLabel.setText(clock);
				 	*/
				
					clockLabel.setText(dateFormat.format(new Date()));
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//��ư�� ���� ��� ���۵� �̺�Ʈ �ڵ鷯 Ŭ����
	public class ButtonEventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object eventSource = e.getSource();
			
			if(eventSource == startBtn) {
				isRun = true;
				startBtn.setEnabled(false);
				stopBtn.setEnabled(true);
			} else if(eventSource == stopBtn) {
				isRun = false;
				startBtn.setEnabled(true);
				stopBtn.setEnabled(false);
			}
		}
	}
}
