package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class WindowBuilderApp extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderApp frame = new WindowBuilderApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilderApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton_3 = new JButton("\uBE68\uAC04\uC0C9");
		btnNewButton_3.setForeground(Color.RED);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("\uCD08\uB85D\uC0C9");
		btnNewButton_1.setForeground(Color.GREEN);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\uD30C\uB780\uC0C9");
		btnNewButton.setForeground(Color.BLUE);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("\uAC80\uC815\uC0C9");
		btnNewButton_2.setForeground(Color.BLACK);
		panel.add(btnNewButton_2);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
