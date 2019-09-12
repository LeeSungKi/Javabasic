package quiz;

import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		// ����ڰ� exit�Է� �� �� ���� ���ڿ��� jop���� ��� �Է� ����
		StringBuilder logBuilder = new StringBuilder();
		String tmp;
		while(true) {
			tmp = JOptionPane.showInputDialog("�ƹ��ų�(����:exit)");
			if(tmp == null) {
				continue;
			}
			tmp = tmp.trim();
			if("exit".equalsIgnoreCase(tmp)) {
				break;
			}
			if(!tmp.isEmpty()) {
				logBuilder.append(tmp + "\n");
			}
		}
		
		// 1. ����ڰ� �Է��ߴ� ��� ���ڿ��� ���
		String log = logBuilder.toString();
		System.out.println("--------- �Էµ� ���ڿ� ---------");
		System.out.println(log);
		
		// 2. �� ���ڿ��� ����,�ٹٲޱ�ȣ�� ������ ���ڼ�
		String s1 = log.replaceAll(" |\n", "");
		System.out.println(s1);
		System.out.println("���� �� : " + s1.length());
		
		// 3. �ܾ� ��
		String[] arr = log.split(" |\n");
		System.out.println("�ܾ� �� : " + arr.length);
		
		// 4. ����ڿ��� �˻��� 1���� �Է� �ް�, ������ ���ڿ��� �ش� �˻�� �ִ��� ��� ���
		String word = JOptionPane.showInputDialog(null, "�˻���");
		if(word != null) {
			System.out.println(word + "(��)�� ���ڿ��� " + (log.contains(word)?"�ֽ��ϴ�.":"�����ϴ�."));
		}
		// 5. ����ڿ��� ���� 1���� �Է� �ް�, ������ ���ڿ��� �ش� ���ڰ� �� �� �ִ� �� ���
		word = JOptionPane.showInputDialog("���� Ȯ���� ���� 1��");
		if(word != null) {
			char ch = word.charAt(0); 
			String s2 = log.replaceAll("[^"+ch+"]", "");
			System.out.println(ch + "(��)�� " + s2.length() + "�� ����");
		}
	}
}





