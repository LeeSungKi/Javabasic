package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.border.Border;

/*
 * 4X4 ��ư ����
 * 1 ~ 16�� �ִ´�.
 * ���ʴ�� �ִ� ���� �ƴ�, ��� 1 ~ 16���� ��ư �����
 * ����ڰ� ���ʴ�� 1 ~ 16�� ������� Ŭ���ϸ� WIN!  
 * 
 */
public class Quiz01 extends JFrame {
	int nums[] = new int[16];
	JButton[] buttons = new JButton[16]; // null, null, null, .. 
	int lastNum = 1;
	JLabel timerLabel;
	
	long init; 
	
	Quiz01() {
		super("���� ���߱�~");
		
		// 1 ~ 16 �迭 ����
		for(int i = 0; i < nums.length; ++i) {
			nums[i] = i + 1;
		}
		
		for(int i = 0; i < 20; ++i) {
			int a = (int)(Math.random() * 16); 
			int b = (int)(Math.random() * 16); 
			int tmp = nums[a];
			nums[a] = nums[b];
			nums[b] = tmp;
		}
		
		for(int num : nums) {
			System.out.println(num);
		}
		////////////////////////////////////////////////
		for(int i = 0; i < buttons.length; ++i) {
			buttons[i] = new JButton(String.valueOf(nums[i]));
		}
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton j = (JButton)e.getSource();
				j.setEnabled(false); // ��Ȱ��ȭ 
				int num = Integer.parseInt(j.getText());
				if(lastNum == 1) {
					init = System.currentTimeMillis(); // ���� �ð� ���ϱ�(1��ư�� ���� ���� ���)
					new Thread( new Runnable() {
						
						@Override
						public void run() {
							while(true) {
							// ... �۾� ����
								long now = System.currentTimeMillis(); // ���� �ð� ���ϱ�
								int gap = (int)(now - init); // �и���!!
								int minute = (gap/1000)/60; 
								int second = (gap/1000)%60;
								int centSecond = (gap/10)%100;
								
								String str = String.format("%02d:%02d:%02d",minute, second, centSecond);
								timerLabel.setText(str);
							}
						}
					}).start();
				}
				if(lastNum == num) {
					++lastNum;
					if(lastNum > 16) {
						JOptionPane.showMessageDialog(Quiz01.this, "WIN!");
						System.exit(0);
					}
				}
				else {
					JOptionPane.showMessageDialog(Quiz01.this, "LOSE!");
					System.exit(0); // ���α׷� ����
				}
			}
		};
		
		
		timerLabel = new JLabel("00:00:00");
		timerLabel.setFont(new Font("����", Font.BOLD, 50));
		timerLabel.setPreferredSize(new Dimension(400, 150)); // width, height
		timerLabel.setHorizontalAlignment(JLabel.CENTER);
		timerLabel.setVerticalAlignment(JLabel.CENTER);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout()); // ��ü �������� BorderLayout����..
		setSize(400, 550);
		JPanel panel = new JPanel(); // ������ 
		panel.setLayout(new GridLayout(4, 4));
		
		
		for(JButton b : buttons) {
			b.setFont(new Font("����", Font.PLAIN, 30)); // ��Ʈ
			b.setForeground(new Color(65, 214, 244)); // (��ư�ǰ��) �۾���
			b.setBackground(new Color(55, 89, 109)); // ����
			b.addActionListener(listener);
			panel.add(b);
		}
		add(timerLabel, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Quiz01();
	}
}
