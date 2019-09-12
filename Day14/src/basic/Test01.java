package basic;
/*
 * < Collection �� Ư¡ >
 * 1. ������ �⺻�ڷ��� : Object ( �� ��! �����ڷ����� ���, ���尴ü�� �Ǿ� �� )
 * 2. ���� ���°� ���� 
 *   1) List : �ε��� O, ��������, �ߺ����� ����� (�ε����� ����) 
 *   2) Set : �ε��� X, ��������, �ߺ����� ��� ���� (�ߺ��� ���Ұ� �� ����Ǹ�, ���ο� ���ҷ� ���)
 *   3) Map : �ε��� X, ��������, Key-Value ������ �����ϴ� ����
 *   		  �˻��� ���� ����. Key�� ���� Value�� ã�� ������
 * 
 * < List >
 * 1) ArrayList : ������ �迭
 *  - �⺻������ 10ĭ ���� (�� �����ڿ��� ������ �� ����) 
 *  - ���� �߰� �� �ڵ����� �迭 ĭ�� �ø� 
 *  
 * 2) LinkedList : (����)���Ḯ��Ʈ
 *  - �߰� ������ ��ġ�� ���� �ٲ�ų�, 
 *    ���� ������ ����� �Ͼ�� ������ ��� ArrayList���� LinkedList�� ����Ѵ�.
 *  - ��������� ��ġ�� ����� �ʵ尡 �ʿ��ϹǷ� ArrayList���� �޸� ����� ŭ
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test01 {
	
	static public class Pokemon{
		String name;
		int level;
		public Pokemon(String name, int level) {
			this.name = name;
			this.level = level;
		}
		public String toString() {
			return name + "/LV." + level;
		}
	}
	
	public static void main(String[] args) {
		// ArrayList����� â�� ��ü ����
		ArrayList list = new ArrayList();
		Test01 t = new Test01();
		// ���� �߰� 
		list.add(10); 
		list.add(true); 
		list.add(new Test01.Pokemon("��ī��", 10)); 
		list.add(new Test01.Pokemon("������", 20));
		list.add("ABC"); 
		
		System.out.println(list); // list.toString();
		
		// ���� ����
		list.add(2, new Test01.Pokemon("Ǫ��", 20)); // 2�� ��ġ�� Ǫ�� ��ü ����
		System.out.println(list);
		
		// ���� ��ȸ 
		Object o = list.get(1);  // 1�� ���Ұ� ����?
		System.out.println("list�� 1�� ����: " + o);
		
		// ���� ���� 
		// remove(Object ����)
		// remove(int �ε���) 
		list.remove("ABC");
		System.out.println(list);
		
		list.remove(2); // 2�� ���� ����
		System.out.println(list);
		
		list.remove((Integer)10); // '10' ���� ���� (�ε��� �ƴ�!) 
		System.out.println(list);
		
		// ��ü ���� : int size()
		System.out.println("���� " + list.size() + "��");
		
		// �����? : boolean isEmpty()
		System.out.println("���� ����? " + list.isEmpty()); // false
		
		// �� ���Ұ� �ִ�? : boolean contains(Object ã�� ����)
		System.out.println("10�� �ִ�? " + list.contains(10));
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(100); 
		list2.add(10);
		list2.add(1);
		list2.add(-100);
		
		list.addAll(list2); // �ٸ� �÷��� ��ü�� �����ϱ�
		System.out.println(list);
		
		list.removeAll(list2); // list���� list2 ���ҵ��� ���� 
		System.out.println(list);
		
		Object[] arr = list.toArray(); // �迭 �����
		System.out.println("0�� ���� : " + arr[0]);
		
		// for������ ��� ���� ��ȸ�ϱ� 
		// ���1. �Ϲ� for��
		for(int i = 0; i < list.size(); ++i) {
			System.out.println("�Ϲ� for�� : " + list.get(i));
		}
		
		// ���2. Ȯ�� for��
		for(Object e : list) {
			System.out.println("Ȯ�� for�� : " + e);
		}
		
		// ���3. java.util.Iterator ��� 
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println("���ͷ����� : " + it.next());
		}
		
		// ��� ���� ���� : clear()
		//list.clear();
		//System.out.println(list); // []
		
		// ��ī�� ��ü ������ �̸�-> ����� ���� 
		Object o2 = list.get(1);
		System.out.println(o2);
		((Test01.Pokemon)o2).name = "����";
		
		System.out.println(list);
	}
}






