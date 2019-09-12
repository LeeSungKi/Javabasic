package basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * < GUI >
 * 
 * - GUI ���� ���
 *  1. Container : ������ 
 *  2. Component : ����� (�����ǿ� ���̱�)
 *  3. LayoutManager : Ʋ ������
 *  4. Listener : �̺�Ʈ ó����
 */
public class Test06 {
	public Test06() {
		// 1. ������ ����� : JPanel
		JPanel panel = new JPanel();
		//panel.setLayout(new FlowLayout()); // <=== JPanel�� default ���̾ƿ�
		//panel.setLayout(new GridLayout(2, 3)); // 2�� 3�� ������ ���̾ƿ�
		//panel.setLayout(new GridLayout(6, 1)); // 6�� 1�� ������ ���̾ƿ�
		panel.setLayout(new BorderLayout()); // ���������߾� ���·� ��ġ
		// 2. ����� ����� + �����ǿ� ���̱�
		JButton b1 = new JButton("��ī��"); 
		JButton b2 = new JButton("������"); 
		JButton b3 = new JButton("ġ�ڸ�Ÿ"); 
		JButton b4 = new JButton("�ѹ���"); 
		JButton b5 = new JButton("�����"); 
		JButton b6 = new JButton("����"); 
		// ����! ������� ������ٰ� �ؼ� �ڵ����� �����ǿ� ������� �ʴ´�!
		// ������.add(��)
		/* < FlowLayout , GridLayout�� �׳� add()�� �ϸ� �� >
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);*/
		
		// < BorderLayout�� add()�� �� ��ġ�� �����ؾ� �Ѵ�. >
		panel.add(b1, BorderLayout.CENTER);
		panel.add(b2, BorderLayout.WEST);
		panel.add(b3, BorderLayout.EAST);
		panel.add(b4, BorderLayout.NORTH);
		// panel.add(b5, BorderLayout.SOUTH);
		JPanel smallPanel = new JPanel(); // ���� ������ �����
		smallPanel.setLayout(new GridLayout(1, 2));
		smallPanel.add(b5); 
		smallPanel.add(b6);
		panel.add(smallPanel, BorderLayout.SOUTH); 
			// ū ������ SOUTH�� ���� ������
		
		
		// 3. ������â ����� : JFrame 
		JFrame frame = new JFrame("���� ù GUI!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// X ������ ���α׷� ����
		frame.setSize(400, 600); // �ʺ� 400px, ���� 600px
		frame.setLocation(1400, 30);
		//frame.setLocationRelativeTo(null); // ȭ���� �� ����� ��ġ
		frame.add(panel); // ������ â�� ������ ���̱�
		frame.setVisible(true); // ���̰ڴ�! (���ϸ� �ȶ�)
		
		// 4. ������ ����� 
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				//System.out.println(btn.getText() + "�� Ŭ����!");
				JOptionPane.showMessageDialog(frame, btn.getText() + "(��)�� Ŭ����!");
			}
		}; 
		// ����! ������ ��ü�� ��������ؼ� �ٷ� ����Ǵ� �� �ƴ�!!!!!!!!!
		// �� �����ʸ� ���� ������Ʈ�� addXXListener() �����ؾ� ��
		b1.addActionListener(listener);
		b2.addActionListener(listener);
	}
	public static void main(String[] args) {
		new Test06();
	} 
}
