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
 * 4X4 버튼 생성
 * 1 ~ 16을 넣는다.
 * 차례대로 넣는 것이 아닌, 섞어서 1 ~ 16까지 버튼 만들기
 * 사용자가 차례대로 1 ~ 16을 순서대로 클릭하면 WIN!  
 * 
 */
public class Quiz01 extends JFrame {
	int nums[] = new int[16];
	JButton[] buttons = new JButton[16]; // null, null, null, .. 
	int lastNum = 1;
	JLabel timerLabel;
	
	long init; 
	
	Quiz01() {
		super("숫자 맞추기~");
		
		// 1 ~ 16 배열 생성
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
				j.setEnabled(false); // 비활성화 
				int num = Integer.parseInt(j.getText());
				if(lastNum == 1) {
					init = System.currentTimeMillis(); // 실행 시간 구하기(1버튼을 누른 순간 잰다)
					new Thread( new Runnable() {
						
						@Override
						public void run() {
							while(true) {
							// ... 작업 실행
								long now = System.currentTimeMillis(); // 현재 시간 구하기
								int gap = (int)(now - init); // 밀리초!!
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
					System.exit(0); // 프로그램 종료
				}
			}
		};
		
		
		timerLabel = new JLabel("00:00:00");
		timerLabel.setFont(new Font("돋움", Font.BOLD, 50));
		timerLabel.setPreferredSize(new Dimension(400, 150)); // width, height
		timerLabel.setHorizontalAlignment(JLabel.CENTER);
		timerLabel.setVerticalAlignment(JLabel.CENTER);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout()); // 전체 프레임은 BorderLayout으로..
		setSize(400, 550);
		JPanel panel = new JPanel(); // 숫자판 
		panel.setLayout(new GridLayout(4, 4));
		
		
		for(JButton b : buttons) {
			b.setFont(new Font("돋움", Font.PLAIN, 30)); // 폰트
			b.setForeground(new Color(65, 214, 244)); // (버튼의경우) 글씨색
			b.setBackground(new Color(55, 89, 109)); // 배경색
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
