package basic;

import java.util.HashMap;

import javax.swing.JOptionPane;

class Pokemon {
	String name;
	int level;
	public Pokemon(String n, int lv) {
		name = n;
		level = lv;
	}
	public String toString() {
		return "[" + name + "/Lv." + level + "]";
	}
}

public class Test02 {
	public static void main(String[] args) {
		// ���ϸ� �̸��� ���� ���ϸ��� ������ ���� �� �ֵ��� �غ���
		// Ű : name
		// �� : Pokemon �ν��Ͻ�
		HashMap<String, Pokemon> map = new HashMap<String, Pokemon>();
		
		map.put("��ī��", new Pokemon("��ī��", 10));
		map.put("������", new Pokemon("������", 30));
		
		Pokemon p = new Pokemon("�Ḹ��", 30);
		map.put(p.name , p);
		
		String name = JOptionPane.showInputDialog("�˻��Ͻ� ���ϸ� �̸�");
		if(map.containsKey(name)) {
			JOptionPane.showMessageDialog(null, map.get(name) );
		}
		else {
			JOptionPane.showMessageDialog(null, "�̵�� ���ϸ�");
		}
		
	}
}








