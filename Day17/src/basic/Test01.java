package basic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.Book;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test01 extends JFrame{
	
	JPanel panel1; // 큰 레고판
	JPanel panel2; // 작은 레고판
	
	JTextArea textArea; 	// 출력란 
	JTextField textField; 	// 입력란
	JButton button; 		// 초기화 버튼 (출력란 모두 지우기)
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 800;
	
	public Test01() {	
		super("나만의 메모장!");
		
		// KeyListener 생성
		KeyListener listener = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) { // 문자가 입력 되었을 때 호출됨
				System.out.println("문자 입력됨!");
			}
			
			@Override
			public void keyReleased(KeyEvent e) { // 키보드 버튼이 '떼어졌을 때'
				System.out.println("버튼 떼어짐");
			}
			
			@Override
			public void keyPressed(KeyEvent e) { // 키보드 버튼이 '눌렸을 때'
				System.out.println(e.getKeyChar()); // 눌린 버튼의 문자
				if(e.getKeyCode() == KeyEvent.VK_ENTER) { 
					// 방금 눌린 키가 엔터니?
					String input = textField.getText();
					String tmp = textArea.getText(); // 여태 입력되었던 텍스트를 일단 받아옴
					
					textArea.setText(tmp + input + "\n");
					textField.setText("");
				}
			}
		};
		
		// ActionListener 생성 
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		};
		
		
		// textArea 생성
		textArea = new JTextArea();
		textArea.setEditable(false); // 사용자가 편집 못하게..
		
		// textField 생성
		textField = new JTextField();
		textField.addKeyListener(listener);
		
		// button 생성
		button = new JButton("초기화");
		button.addActionListener(listener2);

		// 작은 레고판 세팅 (textField, button 붙이기)
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(textField, BorderLayout.CENTER);
		panel2.add(button, BorderLayout.EAST);
		
		// 큰 레고판 세팅 (textArea, 작은 레고판 붙이기)
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		panel1.add(textArea, BorderLayout.CENTER);
		panel1.add(panel2, BorderLayout.SOUTH);
		
		setSize(WIDTH, HEIGHT); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(panel1); // 큰 레고판을 Frame에 붙이기
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}