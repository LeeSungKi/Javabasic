package basic;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * < Map >
 * - TreeMap, HashMap 
 *   -------
 *   Ű�� �������� �ڵ� ����
 *   
 * - Ű-�� ������ ���Ҹ� ����
 *   
 *   Ű : "name"
 *   �� : "ȫ�浿"
 *   
 *   Ű : "num"
 *   �� : 1
 *   
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		Map<String, Object> info = new TreeMap<String, Object>();
		
		// put(Ű, ��)
		info.put("name", "ȫ�浿");
		info.put("age", 10); 
		info.put("tall", 110.4); 
		info.put("gender", "����"); 
		info.put("contact", "010-1111-1111");
		info.put("address", "������ ���굿");
		
		System.out.println(info.toString());
		// {address=������ ���굿, age=10, contact=010-1111-1111, 
		//   gender=����, name=ȫ�浿, tall=110.4}
		
		// get(Ű) ==> Value�� return ��
		Object obj1 = info.get("address");
		Object obj2 = info.get("name");
		System.out.println(obj1); // obj1.toString()
		System.out.println(obj2);
		
		// boolean containsKey(Ű) : �� 'Ű'�� �ִ�?
		System.out.println(info.containsKey("tall")); // true
		System.out.println(info.containsKey("weight")); // false
		
		// boolean containsValue(��) : �� '��'�� �ִ�?
		System.out.println(info.containsValue("ȫ�浿")); // true
		System.out.println(info.containsValue("��浿")); // false 
		
		// replace()
		info.replace("name", "��ī��"); // replace(Ű, �� ��) 
		info.replace("gender", "����", "����"); // replace(Ű, ���� ��, �� ��) 
											  // �������� ��ġ���� ������ �������
		System.out.println(info);
		
		
		// Map�� �ݺ����� �Ұ���
		// ���1. key�� �̾Ƽ� �ݺ� ==> keySet() ==> �����ڷ��� : Set<Ű�� �ڷ���>
		Set<String> keys = info.keySet();
		System.out.println(keys);
		for(String k : keys) {
			System.out.println("Key : " + k);
			System.out.println("Value : " + info.get(k));
		}
		// ���2. value�� �̾Ƽ� �ݺ� ==> values() ==> �����ڷ��� : Collection<���� �ڷ���>
		Collection<Object> values = info.values();
		for(Object v : values) {
			System.out.println(v);
		}
		
		info.clear();
		System.out.println(info);
	}
}








