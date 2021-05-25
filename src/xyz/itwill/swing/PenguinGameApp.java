package xyz.itwill.swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PenguinGameApp extends JFrame {
	private static final long serialVersionUID = 1L;

	private static final int JFRAME_WIDTH = 616;
	private static final int JFRAME_HEIGHT = 461;
	private static final int PENGUIN_SIZE = 60;
	
	private Image backgroundImage;
	private Image[] penguins;
		
	private int penguinNo;
	private int penguinX, penguinY;
	
	//��� �̹����� �̵������� �����ϱ� ���� �ʵ�
	// => 0 : ����(�⺻), 1 : ���� ����, 2 : ������ ����
	private int direction;
	
	//���� ���¸� �����ϱ� ���� �ʵ�
	// => false : ���� ���� ����, true : ���� ���� ����(�⺻)
	private boolean isRun;
		
	public PenguinGameApp(String title) {
		super(title);
		
		backgroundImage = new ImageIcon(getClass().getResource("/images/back.jpg")).getImage();
		
		penguins = new Image[3];
		for(int i = 0; i < penguins.length; i++) {
			penguins[i] = new ImageIcon(getClass().getResource("/images/penguin" + (i + 1) +".gif")).getImage();
		}
		
		init();
		
		addKeyListener(new KeyEventHandle());
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 200, JFRAME_WIDTH, JFRAME_HEIGHT);
		setVisible(true);
	}
	
	//���� ���� ���� �ʱ�ȭ �۾� �޼ҵ� - �ʵ� �ʱ�ȭ
	// => ���� ���� ���� �Ǵ� ������� ��� ȣ��
	private void init() {
		penguinNo = 0;
		penguinX = JFRAME_WIDTH / 2 - PENGUIN_SIZE / 2;
		penguinY = JFRAME_HEIGHT - PENGUIN_SIZE;
		
		direction = 0;
		
		isRun = true;
		
		new PenguinAnimationThread().start();
	}
	
	public static void main(String[] args) {
		new PenguinGameApp("PenguinGame");
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, JFRAME_WIDTH, JFRAME_HEIGHT, this);
		g.drawImage(penguins[penguinNo], penguinX, penguinY, PENGUIN_SIZE, PENGUIN_SIZE, this);
	}
	
	//��� �̹����� �����̴� ����� �����ϱ� ���� ������ Ŭ����
	public class PenguinAnimationThread extends Thread {
		@Override
		public void run() {
			while(true) {
				if(isRun) {
					switch (direction) {
					case 1:
						penguinX -= 5;
						if(penguinX <= 0) {
							penguinX = 0;
						}
						break;
						
					case 2:
						penguinX += 5;
						if(penguinX >= JFRAME_WIDTH - PENGUIN_SIZE) {
							penguinX = JFRAME_WIDTH - PENGUIN_SIZE;
						}
						break;
					}
					penguinNo ++;
					penguinNo %= 3;
					repaint();
				}
				
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public class KeyEventHandle extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			case KeyEvent.VK_LEFT:
				direction = 1;
				break;
				
			case KeyEvent.VK_RIGHT:
				direction = 2;
				break;
				
			case KeyEvent.VK_P:
				//���ӻ��¸� �ݴ�� �����Ͽ� �����ϴ� ��� - ���(Toggle)
				isRun = !isRun;
				if(!isRun) repaint();
				break;
			}
		}
	}
}
