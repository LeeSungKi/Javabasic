package day19.quiz.chatting.server;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerMain extends JFrame {
	JPanel panel1, panel2;
	JTextArea textArea;
	JTextField textField;
	JButton button;
	
	StringBuffer text = new StringBuffer();
	
	ServerSocket sSoc;
	Socket cSoc;
	ServerSendThread sThread;
	ServerReceiveThread rThread;
	
	public ServerMain() {
		super("Server!");
		
		textArea = new JTextArea();
		textField = new JTextField();
		button = new JButton("전송");
		
		textArea.setEditable(false);
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) { }
			
			@Override
			public void keyReleased(KeyEvent e) { }
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(textField, BorderLayout.CENTER); 
		panel2.add(button, BorderLayout.EAST);
		
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		panel1.add(textArea, BorderLayout.CENTER);
		panel1.add(panel2, BorderLayout.SOUTH);
		
		add(panel1);
		setSize(400, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(1200, 30);
		setVisible(true);
		
		
		
		try {
			sSoc = new ServerSocket(3000);
			
			textArea.setText("클라이언트를 기다리고 있습니다..\n");
			cSoc = sSoc.accept();
			textArea.append("클라이언트 연결 성공!!\n");
			
			// 송수신 스레드 실행
			
			rThread = new ServerReceiveThread(this);
			rThread.start();
			
			sThread = new ServerSendThread(this);
			sThread.start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 전송버튼이나 엔터를 누르면 실행
	synchronized private void sendMessage() {
		String message = textField.getText().trim(); // 텍스트 필드에서 텍스트 받아옴
		// 스레드에게 보내기
		sThread.message = message;
		textField.setText("");
		textArea.append("나(서버) : " + message + "\n");
	}
	
	public static void main(String[] args) {
		new ServerMain();
		
	}
}
