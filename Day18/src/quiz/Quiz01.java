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
	private static final String INIT_TOTAL_TEXT =  "TOTAL : 0원";
	private static final DecimalFormat MY_DIGIT_FORMAT = new DecimalFormat("###,###");
	
	int todayTotal; // 오늘 총 매출액
	int total; // 결제 총액
	TreeMap<String, Integer> menuBook = setMenuBook();
	
	// 메뉴판
	private TreeMap<String, Integer> setMenuBook() {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("아메리카노", 1000);
		map.put("카페라떼", 2000);
		map.put("카푸치노", 2000);
		map.put("카페모카", 3000);
		map.put("바닐라라떼", 3000);
		map.put("마끼아또", 2500);
		map.put("에스프레소", 1000);
		map.put("오렌지쥬스", 3000);
		map.put("녹차\t", 2000);
		return map;
	}
	
	// 메뉴 버튼 9개
	private JPanel setLeftMenu() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		
		Set<String> menus = menuBook.keySet();
		for(String m : menus) {
			panel.add(new MyButton(m, menuBook.get(m)));
		}
		return panel;
	}
	
	// 주문 리스트
	JTextArea orderTextArea;
	private JPanel setRightOrderList() {
		JPanel panel = new JPanel();
		orderTextArea = new JTextArea();
		panel.setLayout(new BorderLayout());
		panel.add(orderTextArea, BorderLayout.CENTER);
		return panel;
	}
	
	// 메뉴 버튼 패널 + 주문리스트 패널
	private JPanel setMainPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		panel.add(setLeftMenu(), 0);
		panel.add(setRightOrderList(), 1);
		panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
		return panel;
	}
	
	// 임시 상단 버튼들
	JButton[] buttonNav = new JButton[NAV_MENU_COUNT];
	private JPanel setHeadPanel() {
		JPanel panel = new JPanel();
		for(int i = 0; i < buttonNav.length; ++i) {
			buttonNav[i] = new JButton("tmp " + i);
			panel.add(buttonNav[i]);
		}
		return panel;
	}
	
	// 하단 총 결제액 + 결제 버튼
	JLabel totalLabel;
	JButton chargeButton;
	private JPanel setFooterPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		totalLabel= new JLabel(INIT_TOTAL_TEXT);
		totalLabel.setFont(new Font("돋움", Font.BOLD, 30));
		chargeButton = new JButton("결제");
		chargeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "총 " + MY_DIGIT_FORMAT.format(total) + "원입니다.\n"
							+ "결제 하시겠습니까?";
				int select = JOptionPane.showConfirmDialog(Quiz01.this, message);
				System.out.println(Quiz01.this);
				if(select == JOptionPane.YES_OPTION) {
					todayTotal += total;
					total = 0;
					message = "결제 완료! \n오늘 매출 : 총 " + new DecimalFormat("###,###").format(todayTotal) + "원";
					JOptionPane.showMessageDialog(Quiz01.this, message);
				}
			}
		});
		panel.add(totalLabel, BorderLayout.CENTER);
		panel.add(chargeButton, BorderLayout.EAST);
		return panel;
	}
	
	
	// 이너클래스 MyButton 내부에서는 Quiz01의 멤버변수를 사용할 수 있다. 
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
				String item = String.format("%s%s\t%20s\t%20s원\n", 
								orderTextArea.getText(),
								new SimpleDateFormat("[YYYY/MM/dd HH:mm:ss]" ).format(System.currentTimeMillis()),
								b.menu, 
								MY_DIGIT_FORMAT.format(b.price)
								);
				orderTextArea.setText(item);
				totalLabel.setText("TOTAL : " + MY_DIGIT_FORMAT.format(total) + "원");
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
			setFont(new Font("돋움", Font.PLAIN, 20));
			addMouseListener(listener);
		}
		
		public String toString() {
			return "<html>" 
					+ menu + "<br>"
					+ MY_DIGIT_FORMAT.format(price) + "원"
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
