package xyz.itwill.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableApp extends JFrame{
	private static final long serialVersionUID = 1L;

	public JTableApp(String title) {
		super(title);
		
		String[] columnNames = {"�й�", "�̸�", "��ȭ��ȣ"};
		
		String[][] rowData = {{"1000", "ȫ�浿", "010-123-4567"}, 
				{"2000", "�Ӳ���", "010-2651-4813"}, {"3000", "����ġ", "010-9871-3444"}, 
				{"4000", "������", "010-7864-3456"}, {"5000", "����", "010-5647-1343"}};
		
		//DefaultTableModel : ���̺� ���� ������ �����ϱ� ���� Ŭ����
		// => ���̺��� �� �Ǵ� ��(�� : Cell)�� �޼ҵ带 ȣ���Ͽ� ���� ����
		DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames);
		
		//JTable : ���� ��� ���� ������ ǥ �������� ����ϴ� ���۳�Ʈ
		//JTable table = new JTable(rowData, columnNames);
		JTable table = new JTable(tableModel);
		
		JScrollPane pane = new JScrollPane(table);
		
		getContentPane().add(pane, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 200, 500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTableApp("Jtable");
	}
}
