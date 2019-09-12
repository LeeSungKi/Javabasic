package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Quiz01 extends JFrame{
	
	private static final int NAV_MENU_COUNT = 3;
	private static final String INIT_TOTAL_TEXT =  "TOTAL : 0��";
	private static final DecimalFormat MY_DIGIT_FORMAT = new DecimalFormat("###,###");
	
	int todayTotal; // ���� �� �����
	int total; // ���� �Ѿ�
	TreeMap<String, Integer> menuBook = setMenuBook();
	
	// �޴���
	private TreeMap<String, Integer> setMenuBook() {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("�Ƹ޸�ī��", 1000);
		map.put("ī���", 2000);
		map.put("īǪġ��", 2000);
		map.put("ī���ī", 3000);
		map.put("�ٴҶ��", 3000);
		map.put("�����ƶ�", 2500);
		map.put("����������", 1000);
		map.put("�������꽺", 3000);
		map.put("����\t", 2000);
		return map;
	}
	
	// �޴� ��ư 9��
	private JPanel setLeftMenu() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		
		Set<String> menus = menuBook.keySet();
		for(String m : menus) {
			panel.add(new MyButton(m, menuBook.get(m)));
		}
		return panel;
	}
	
	// �ֹ� ����Ʈ
	JTextArea orderTextArea;
	private JPanel setRightOrderList() {
		JPanel panel = new JPanel();
		orderTextArea = new JTextArea();
		panel.setLayout(new BorderLayout());
		panel.add(orderTextArea, BorderLayout.CENTER);
		return panel;
	}
	
	// �޴� ��ư �г� + �ֹ�����Ʈ �г�
	private JPanel setMainPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		panel.add(setLeftMenu(), 0);
		panel.add(setRightOrderList(), 1);
		panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
		return panel;
	}
	
	// �ӽ� ��� ��ư��
	JButton[] buttonNav = new JButton[NAV_MENU_COUNT];
	private JPanel setHeadPanel() {
		JPanel panel = new JPanel();
		for(int i = 0; i < buttonNav.length; ++i) {
			buttonNav[i] = new JButton("tmp " + i);
			panel.add(buttonNav[i]);
		}
		return panel;
	}
	
	// �ϴ� �� ������ + ���� ��ư
	JLabel totalLabel;
	JButton chargeButton;
	private JPanel setFooterPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		totalLabel= new JLabel(INIT_TOTAL_TEXT);
		totalLabel.setFont(new Font("����", Font.BOLD, 30));
		chargeButton = new JButton("����");
		chargeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "�� " + MY_DIGIT_FORMAT.format(total) + "���Դϴ�.\n"
							+ "���� �Ͻðڽ��ϱ�?";
				int select = JOptionPane.showConfirmDialog(Quiz01.this, message);
				System.out.println(Quiz01.this);
				if(select == JOptionPane.YES_OPTION) {
					todayTotal += total;
					total = 0;
					message = "���� �Ϸ�! \n���� ���� : �� " + new DecimalFormat("###,###").format(todayTotal) + "��";
					JOptionPane.showMessageDialog(Quiz01.this, message);
				}
			}
		});
		panel.add(totalLabel, BorderLayout.CENTER);
		panel.add(chargeButton, BorderLayout.EAST);
		return panel;
	}
	
	
	// �̳�Ŭ���� MyButton ���ο����� Quiz01�� ��������� ����� �� �ִ�. 
	class MyButton extends JButton {
		private String menu;
		private int price;
		private Color backgroundColor;
		
		private MouseListener listener = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {
				MyButton b = (MyButton)e.getSource();
				total += b.price;
				String item = String.format("%s%s\t%20s\t%20s��\n", 
								orderTextArea.getText(),
								new SimpleDateFormat("[YYYY/MM/dd HH:mm:ss]" ).format(System.currentTimeMillis()),
								b.menu, 
								MY_DIGIT_FORMAT.format(b.price)
								);
				orderTextArea.setText(item);
				totalLabel.setText("TOTAL : " + MY_DIGIT_FORMAT.format(total) + "��");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
		};
		
		public MyButton(String menu, int price) {
			super(menu);
			this.menu = menu;
			this.price = price;
			setText(toString());
			setFont(new Font("����", Font.PLAIN, 20));
			addMouseListener(listener);
		}
		
		public String toString() {
			return "<html>" 
					+ menu + "<br>"
					+ MY_DIGIT_FORMAT.format(price) + "��"
					+ "</html>";
		}
	}
	public Quiz01() {
		setSize(900, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		add(setHeadPanel(), BorderLayout.NORTH);
		add(setMainPanel(), BorderLayout.CENTER);
		add(setFooterPanel(), BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Quiz01();
	}
}
