package basic;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test02 {
	public static void main(String[] args) {
		// Pokemon �ν��Ͻ����� (sample.pok) �о���̱� 
		
		FileInputStream i = null;
		ObjectInputStream oIn = null;
		
		try { 
			
			i = new FileInputStream("sample.pok"); 
			oIn = new ObjectInputStream(i);
//			Pokemon p1 = (Pokemon)oIn.readObject();
//			Pokemon p2 = (Pokemon)oIn.readObject();
//			Pokemon p3 = (Pokemon)oIn.readObject();
//			System.out.println(p1);
//			System.out.println(p2);
//			System.out.println(p3);
			
			while(true) {
				try {
					Object o = oIn.readObject();
					if(o instanceof Pokemon) {
						Pokemon p = (Pokemon)o;
						System.out.println("�̸� : " + p.name);
						System.out.println("���� : " + p.level);
						System.out.println("ü�� : " + p.hp);
					}
				} catch(EOFException e) {
					break;
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oIn != null) { oIn.close(); }
				if(i != null) { i.close(); }
			} catch(Exception e) { e.printStackTrace();}
		}
 		 
	}
}