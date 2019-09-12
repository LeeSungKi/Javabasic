package basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * < GUI >
 * 
 * - GUI 구성 요소
 *  1. Container : 레고판 
 *  2. Component : 레고블럭 (레고판에 붙이기)
 *  3. LayoutManager : 틀 관리자
 *  4. Listener : 이벤트 처리자
 */
public class Test06 {
	public Test06() {
		// 1. 레고판 만들기 : JPanel
		JPanel panel = new JPanel();
		//panel.setLayout(new FlowLayout()); // <=== JPanel의 default 레이아웃
		//panel.setLayout(new GridLayout(2, 3)); // 2행 3열 형태의 레이아웃
		//panel.setLayout(new GridLayout(6, 1)); // 6행 1열 형태의 레이아웃
		panel.setLayout(new BorderLayout()); // 동서남북중앙 형태로 배치
		// 2. 레고블럭 만들기 + 레고판에 붙이기
		JButton b1 = new JButton("피카츄"); 
		JButton b2 = new JButton("라이츄"); 
		JButton b3 = new JButton("치코리타"); 
		JButton b4 = new JButton("뚜벅초"); 
		JButton b5 = new JButton("토게피"); 
		JButton b6 = new JButton("피츄"); 
		// 주의! 레고블럭을 만들었다고 해서 자동으로 레고판에 적용되지 않는다!
		// 레고판.add(블럭)
		/* < FlowLayout , GridLayout은 그냥 add()만 하면 됨 >
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);*/
		
		// < BorderLayout은 add()할 때 위치를 지정해야 한다. >
		panel.add(b1, BorderLayout.CENTER);
		panel.add(b2, BorderLayout.WEST);
		panel.add(b3, BorderLayout.EAST);
		panel.add(b4, BorderLayout.NORTH);
		// panel.add(b5, BorderLayout.SOUTH);
		JPanel smallPanel = new JPanel(); // 작은 레고판 만들기
		smallPanel.setLayout(new GridLayout(1, 2));
		smallPanel.add(b5); 
		smallPanel.add(b6);
		panel.add(smallPanel, BorderLayout.SOUTH); 
			// 큰 레고판 SOUTH에 작은 레고판
		
		
		// 3. 윈도우창 만들기 : JFrame 
		JFrame frame = new JFrame("나의 첫 GUI!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X 누르면 프로그램 종료
		frame.setSize(400, 600); // 너비 400px, 높이 600px
		frame.setLocation(1400, 30);
		//frame.setLocationRelativeTo(null); // 화면의 한 가운데에 배치
		frame.add(panel); // 윈도우 창에 레고판 붙이기
		frame.setVisible(true); // 보이겠다! (안하면 안뜸)
		
		// 4. 리스너 만들기 
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				//System.out.println(btn.getText() + "가 클릭됨!");
				JOptionPane.showMessageDialog(frame, btn.getText() + "(이)가 클릭됨!");
			}
		}; 
		// 주의! 리스너 객체를 만들었다해서 바로 적용되는 거 아님!!!!!!!!!
		// 이 리스너를 붙일 컴포넌트의 addXXListener() 실행해야 함
		b1.addActionListener(listener);
		b2.addActionListener(listener);
	}
	public static void main(String[] args) {
		new Test06();
	} 
}
