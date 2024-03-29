package xyz.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CalculatorApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel label;
	private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private JButton bMulti, bDiv, bPlus, bMinus, bClear, bEquals;
	
	//연산식을 저장하기 위한 필드
	private String operation = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp frame = new CalculatorApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculatorApp() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		b7 = new JButton("7");
		b7.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b7);
		
		b8 = new JButton("8");
		b8.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b8);
		
		b9 = new JButton("9");
		b9.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b9);
		
		bMulti = new JButton("*");
		bMulti.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bMulti);
		
		b4 = new JButton("4");
		b4.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b4);
		
		b5 = new JButton("5");
		b5.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b5);
		
		b6 = new JButton("6");
		b6.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b6);
		
		bDiv = new JButton("/");
		bDiv.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bDiv);
		
		b1 = new JButton("1");
		b1.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b1);
		
		b2 = new JButton("2");
		b2.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b2);
		
		b3 = new JButton("3");
		b3.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b3);
		
		bPlus = new JButton("+");
		bPlus.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bPlus);
		
		b0 = new JButton("0");
		b0.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(b0);
		
		bClear = new JButton("C");
		bClear.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bClear);
		
		bEquals = new JButton("=");
		bEquals.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bEquals);
		
		bMinus = new JButton("-");
		bMinus.setFont(new Font("Dialog", Font.PLAIN, 20));
		panel.add(bMinus);
		
		label = new JLabel("0");
		label.setBackground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setFont(new Font("Dialog", Font.BOLD, 30));
		contentPane.add(label, BorderLayout.NORTH);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bMulti.addActionListener(this);
		bDiv.addActionListener(this);
		bPlus.addActionListener(this);
		bMinus.addActionListener(this);
		bClear.addActionListener(this);
		bEquals.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 발생된 버튼을 반환받아 저장
		// => getSource() 메소드는 Object 타입의 인스턴스를 반환하므로 명시적 객체 형변환하여 저장
		JButton eventButton = (JButton)e.getSource();
		
		//이벤트를 발생한 버튼을 구분하여 이벤트 처리
		if(eventButton == bEquals) {//"=" 버튼 누른 경우
			//필드에 저장된 연산식에서 연산자를 검색하여 위치값(Index)을 반환받아 저장
			String[] operatorArray = {"*", "/", "+", "-"};
			int index = -1;
			for(int i = 0; i <= operatorArray.length; i++) {
				index = operation.lastIndexOf(operatorArray[i]);
				if(index != -1) break;
			}
			
			//연산식에서 연산자를 찾을 수 없는 경우 이벤트 핸들러 메소드 종료
			if(index <= 0) return;
			
			try {
				//연산식에서 연산자와 피연산사를 분리하여 저장
				int num1 = Integer.parseInt(operation.substring(0, index));
				String operator = operation.substring(index, index + 1);
				int num2 = Integer.parseInt(operation.substring(index + 1));
				
				//연산자를 비교하여 연산식의 결과값을 저장
				int result = 0;
				switch(operator) {
				case "*": result = num1 * num2; break;
				case "/": result = num1 / num2; break;
				case "+": result = num1 + num2; break;
				case "-": result = num1 - num2; break;
				}
				
				//출력 컴퍼넌트의 문자열을 연산식의 결과값으로 변경
				// => 연산식의 결과값을 문자열로 변환해야만 메소드 호출 가능
				//label.setText(String.valueOf(result));
				label.setText(result + "");
				
				//연산식 저장 필드 초기화
				//operation = "";
				operation = result + "";//연산 결과값을 연산식으로 계속 사용
			} catch (ArithmeticException exception) {
				operation = "";
				label.setText("0으로 나눌 수 없습니다.");
			} catch (NumberFormatException exception) {
				operation = "";
				label.setText("0");
				//JOptionPane.showMessagedialog(Component parent, Object message,
				//String title, int messageType) : 메시지 다이얼로그를 출력하는 메소드
				JOptionPane.showMessageDialog(this, "입력된 연산식은 형식에 맞지 않습니다."
						, "에러", JOptionPane.ERROR_MESSAGE);
			} catch (Exception exception) {
				JOptionPane.showMessageDialog(this, "프로그램에 예기치 못한 오류가 발생 되었습니다."
						, "에러", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}

		} else if(eventButton == bClear) {//"C" 버튼 누른 경우
			operation = "";//연산식 저장 필드 초기화
			label.setText("0");
			
		} else {//연산식 관련 버튼을 누른 경우
			//이벤트 발생 버튼의 라벨명을 반환받아 연산식 저장 필드에 추가
			//JComponent.getText() : Swing 컴퍼넌트의 문자열을 반환하는 메소드
			operation += eventButton.getText();
			
			//출력 컴퍼넌트(JLabel)의 문자열을 연산식 저장 필드값으로 변경
			//JComponent.setText(String text) : Swing 컴퍼넌트의 문자열을 변경하는 메소드
			label.setText(operation);
		}
	}
}
