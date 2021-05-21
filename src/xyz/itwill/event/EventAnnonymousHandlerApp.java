package xyz.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�̺�Ʈ �ڵ鷯 Ŭ������ �������� �ʰ� ���� �̺�Ʈ �ڵ鷯�� ����Ͽ� �̺�Ʈ ó��
public class EventAnnonymousHandlerApp extends Frame{
	private static final long serialVersionUID = 1L;

	public EventAnnonymousHandlerApp(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		Button button = new Button("���α׷� ����");
		add(button);
		
		//�߻� Ŭ������ �������̽��� �������̽� ���� �Ұ���
		// => Ŭ������ ��ӹ޾� ����ϱ� ���� ��� ���� �ڷ���
		// => �ڽ� Ŭ������ �߻� Ŭ���� �Ǵ� �������̽��� ��� �߻� �޼ҵ带 �������̵� �����ؾ߸� �ν��Ͻ� ���� ����
		//�߻� Ŭ������ �������̽��� ��� �߻� �޼ҵ带 ���� �������̵� �����Ͽ� �ν��Ͻ� ���� ����
		// => �ڽ� Ŭ������ �̸��� ������� �ʴ� �͸��� ���� Ŭ������ �ν��Ͻ� ���� - Annonymous Inner Class
		// => �͸��� ���� Ŭ������ �ϳ��� �ν��Ͻ��� ����
		//�� ����� �̺�Ʈ ����(�ҽ�)�� ������ ���� �� ������
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
