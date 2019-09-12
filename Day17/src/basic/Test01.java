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
	
	JPanel panel1; // ū ������
	JPanel panel2; // ���� ������
	
	JTextArea textArea; 	// ��¶� 
	JTextField textField; 	// �Է¶�
	JButton button; 		// �ʱ�ȭ ��ư (��¶� ��� �����)
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 800;
	
	public Test01() {	
		super("������ �޸���!");
		
		// KeyListener ����
		KeyListener listener = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) { // ���ڰ� �Է� �Ǿ��� �� ȣ���
				System.out.println("���� �Էµ�!");
			}
			
			@Override
			public void keyReleased(KeyEvent e) { // Ű���� ��ư�� '�������� ��'
				System.out.println("��ư ������");
			}
			
			@Override
			public void keyPressed(KeyEvent e) { // Ű���� ��ư�� '������ ��'
				System.out.println(e.getKeyChar()); // ���� ��ư�� ����
				if(e.getKeyCode() == KeyEvent.VK_ENTER) { 
					// ��� ���� Ű�� ���ʹ�?
					String input = textField.getText();
					String tmp = textArea.getText(); // ���� �ԷµǾ��� �ؽ�Ʈ�� �ϴ� �޾ƿ�
					
					textArea.setText(tmp + input + "\n");
					textField.setText("");
				}
			}
		};
		
		// ActionListener ���� 
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		};
		
		
		// textArea ����
		textArea = new JTextArea();
		textArea.setEditable(false); // ����ڰ� ���� ���ϰ�..
		
		// textField ����
		textField = new JTextField();
		textField.addKeyListener(listener);
		
		// button ����
		button = new JButton("�ʱ�ȭ");
		button.addActionListener(listener2);

		// ���� ������ ���� (textField, button ���̱�)
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel2.add(textField, BorderLayout.CENTER);
		panel2.add(button, BorderLayout.EAST);
		
		// ū ������ ���� (textArea, ���� ������ ���̱�)
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		panel1.add(textArea, BorderLayout.CENTER);
		panel1.add(panel2, BorderLayout.SOUTH);
		
		setSize(WIDTH, HEIGHT); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(panel1); // ū �������� Frame�� ���̱�
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test01();
	}
}