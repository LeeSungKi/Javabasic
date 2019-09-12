package basic;

import java.io.File;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		// java.io.File 
		// => �����̳� ����(���丮) ���� Ŭ���� 
		//    ����/���丮 ���� ����, ����, ���� ������ ���� ��� ����
		
		File f1 = new File("/"); // ���� ���� �ý����� root('/') ���丮�� ����
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.getPath());
		System.out.println(f1.getAbsolutePath());
		
		File f2 = new File("/myDirectory");
		if(!f2.exists()) { // ���� ���丮���
			System.out.println("���丮 ����! ���� �����մϴ�..");
			f2.mkdir();
		}
		else {
			System.out.println("���丮 ����! ���丮�� �����մϴ�..");
			f2.delete();
			// delete()�ϴ� ����� ������ ����� �Ѵ�.
			// file �̶�� : ������ ����� ��
			// directory ��� : ���� ����/���丮�� ����� ��  
		}
		
		// ��Ʈ ���丮�� ��� ����/���丮 �̸� �������� 
		File[] files = f1.listFiles();
		for(File f : files) {
			System.out.println((f.isFile() ? "����" : "���丮") + " : " + f.getName());
			System.out.println(f.length() + "byte");
		}
		
		
		// ����� : ���� ��ġ���� �����ϴ� ��� 
		// ������ : ��Ʈ���� �����ϴ� ���
		// aa.txt     : ���� ��ġ(���丮)�� aa.txt
		// /aa.txt    : ��Ʈ ��ġ(D:)�� aa.txt
		// ./aa.txt   : ���� ��ġ(���丮)�� aa.txt
		// ../aa.txt  : ���� ��ġ(���� ���丮�� ���� ���丮)�� aa.txt
		
		File f3 = new File("src/../src/quiz/Quiz01.java");
		System.out.println(f3.getPath());
		System.out.println(f3.getAbsolutePath());
		try {
			System.out.println(f3.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
















