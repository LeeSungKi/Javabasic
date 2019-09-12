package basic;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

/*
 * < Generic >
 * -> ���� : <�����ڷ���>
 * -> �ڷ��� ���� (�������� �ڷ����� ó��)
 * -> ����! �����ڷ����� ���׸� ���� �Ұ�
 *    <int> ===> <Integer>
 *    
 */

public class Test02 {
	public static void main(String[] args) {
		ArrayList<Test01.Pokemon> list = new ArrayList<Test01.Pokemon>(100);
		// ArrayList���� ������ �ڷ����� Test01.Pokemon���� �˸�
		// ArrayList�� ���ҵ��� �ڷ����� Object���� �ƴ϶� Pokemon������ �ν���
		// �� ���ҵ鿡 ���� �Ź� ����ȯ(�ٿ�ĳ����)�� �ʿ䰡 ����!!
		
		list.add(new Test01.Pokemon("��ī��", 10));
		list.add(new Test01.Pokemon("����", 7));
		list.add(new Test01.Pokemon("�ǵ�����", 101));
		list.add(new Test01.Pokemon("�Ḹ��", 50));
		list.add(new Test01.Pokemon("ġ�ڸ�Ÿ", 10));
		
		// ��� ���ҵ��� ���� 1���� 
//		for(Object o : list) {
//			++((Test01.Pokemon)o).level;
//		}
		
		// ���׸� ���� ��
		for(Test01.Pokemon o : list) {
			++o.level;
		}
		
//		for(int i = 0; i < list.size(); ++i) {
//			++((Test01.Pokemon)list.get(i)).level;
//		}
		for(int i = 0; i < list.size(); ++i) {
			++list.get(i).level;
		}
		
		

//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			Test01.Pokemon p = (Test01.Pokemon)it.next();
//			++p.level;
//		}
		Iterator<Test01.Pokemon> it = list.iterator();
		while(it.hasNext()) {
			++it.next().level;
		}
		System.out.println(list);
		
		// ����ڿ��� '�̸�'�� �Է� �ް� 
		// �ش� ���ϸ� �˻� (������ toString(), ������ "�̵�� ���ϸ�" ���)
		String s = JOptionPane.showInputDialog("�˻��� ���ϸ� �̸�");
		boolean result = false;
		for(Object o :list) {
			if( s.equals( ((Test01.Pokemon)o).name )) {
				result = true;
				JOptionPane.showMessageDialog(null, o);
			}
		}
		if(!result) { // result == false
			JOptionPane.showMessageDialog(null, "�̵�� ���ϸ�");
		}
		
		
	}
}











