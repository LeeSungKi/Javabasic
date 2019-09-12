package basic;
/*
 * < ObejctIn/OutStream >
 * - �ν��Ͻ��� ������ �� ����ϴ� IO ��Ʈ�� 
 * - ������Ʈ�� ( �ֽ�Ʈ���� �����ϴ� �����̹Ƿ�, �ֽ�Ʈ���� ���� ����� ������Ʈ������ �����Ͽ� ��� )
 * - IO ��Ʈ������ ���۵Ǵ� �ν��Ͻ��� �ݵ�� implements Serializable �ؾ� �Ѵ�.
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Pokemon implements Serializable {
	String name;
	int level;
	int hp;
	
	Pokemon(String n, int lv, int h){
		name = n;
		level = lv;
		hp = h;
	}
	
	public String toString() {
		return "[" + name + "/Lv." + level + "/Hp." + hp +"]";
	}
}
public class Test01 {
	public static void main(String[] args) {
		OutputStream o = null;
		ObjectOutputStream oOut = null;
		
		try {
			// 1. �ֽ�Ʈ�� �����
			o = new FileOutputStream("sample.pok");
			
			// 2. Object ��Ʈ�� ����� 
			oOut = new ObjectOutputStream(o);
			
			// 3. �ν��Ͻ� �������� 
			oOut.writeObject(new Pokemon("��ī��", 10, 200));
			oOut.writeObject(new Pokemon("������", 20, 400));
			oOut.writeObject(new Pokemon("Ǫ��", 15, 300));
			
			System.out.println("����Ϸ�!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 4. ��Ʈ�� �ݱ�
			try {
				if(oOut != null) { oOut.close(); }
				if(o != null) { o.close(); }
			} catch(Exception e) { e.printStackTrace(); }
		}
	}
}




