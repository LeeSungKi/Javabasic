package quiz;

import java.util.Set;
import java.util.TreeMap;

import javax.swing.JOptionPane;

/*
 * < �ܾ��� ���α׷� >
 * �޴�) 
 *  1. �ܾ� �߰� --> ���ܾ�, �� �� �� �Է� �ޱ� 
 *  2. �ܾ� �˻� --> ���ܾ� �Է� --> �� Ȥ�� '�̵�� �ܾ�' ���
 *  3. �ܾ� ���� --> ���ܾ� �Է� --> ������ �ܾ� �Է� Ȥ�� '�̵�� �ܾ�' ���
 *  4. ��� �ܾ� ���� 
 *  5. ���� --> �ѱ� ���� ������ ����, ���ܾ �Է� ���� --> ����! Ȥ�� ��.. ���
 *  0. ����
 */
public class Quiz01 {
	public static void main(String[] args) {
		TreeMap<String, String> wordbook = new TreeMap<String, String>();
		String menu = "1. �ܾ� �߰� \n" + "2. �ܾ� �˻� \n" + "3. �ܾ� ���� \n" + "4. ��� �ܾ� ����  \n" + "5. ���� \n" + "0. ���� \n";
		String select;
		String tWord, tMeaning;
		String message;
		Set<String> words = null;
		
		while (true) {
			select = JOptionPane.showInputDialog(menu);
			switch (select) {
			case "1": // �ܾ� �߰�
				tWord = JOptionPane.showInputDialog("�� �ܾ�").trim(); 
				tMeaning= JOptionPane.showInputDialog("[" + tWord + "]�� ��").trim();
				wordbook.put(tWord, tMeaning);
				JOptionPane.showMessageDialog(null, "��� �Ϸ�!");
				break;
			case "2": // �ܾ� �˻�
				tWord = JOptionPane.showInputDialog("�˻��� �ܾ�").trim();
				if(wordbook.containsKey(tWord)) {
					JOptionPane.showMessageDialog(null, "�� : " + wordbook.get(tWord));
				} else {
					JOptionPane.showMessageDialog(null, "�̵�� �ܾ�");	
				}
				break;
			case "3": // �ܾ� ���� 
				tWord = JOptionPane.showInputDialog("������ �ܾ�").trim();
				if(wordbook.containsKey(tWord)) {
					tMeaning = JOptionPane.showInputDialog("�� ��").trim();
					wordbook.replace(tWord, tMeaning);
					JOptionPane.showMessageDialog(null, "���� �Ϸ�!");
				} else {
					JOptionPane.showMessageDialog(null, "�̵�� �ܾ�");	
				}
				break;
			case "4": // ��� �ܾ� ���� 
				if(wordbook.isEmpty()) {
					JOptionPane.showMessageDialog(null, "��ϵ� �ܾ �����ϴ�.");
					continue;
				}
				words = wordbook.keySet();
				message = "====== �ܾ� ��� ======\n";
				for(String w : words) {
					message += w + " : " + wordbook.get(w) + "\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5": // ����
				if(wordbook.isEmpty()) {
					JOptionPane.showMessageDialog(null, "��ϵ� �ܾ �����ϴ�.");
					continue;
				}
				words = wordbook.keySet(); // ���踸 ���� ����� 
				Object[] wordArr = words.toArray(); // �����(�ܾ��) �迭�� ����� 
				int randomIndex = (int)(Math.random() * wordArr.length); // ���� �̱� (0 ~ ���Ұ���-1)
				String correctWord = (String)wordArr[randomIndex]; // ���� 
				String quizMeaning = wordbook.get(correctWord); // ����
				tWord = JOptionPane.showInputDialog("[" + quizMeaning + "](��)�� �����?").trim();
				if(tWord != null && tWord.equalsIgnoreCase(correctWord)) {
					JOptionPane.showMessageDialog(null, "����!");
				}
				else {
					JOptionPane.showMessageDialog(null, "��..");
				}
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "���α׷� ����");
				return;
			default:
				JOptionPane.showMessageDialog(null, "�߸��� �Է�");
				break;
			}
		}
	}
}
