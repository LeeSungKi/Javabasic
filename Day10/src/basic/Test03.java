package basic;
/*
 * �ڽ� Ŭ������ ��üȭ�� �� �θ��� ��ü�� ���� ������� �� �ڽ��� ������ �ʵ尡 �����ȴ�.
 * ==> �ڽ� �����ڰ� ȣ��� �� �θ� �����ڰ� ���� ȣ��ȴ�. 
 * �θ�����ڿ� '�⺻������'�� ���� ��� �ڽ��� ������ ����. 
 *  �ذ���1. �θ�Ŭ������ �⺻������ ���� 
 *  �ذ���2. �ڽ�Ŭ������ �����ڸ� ������ ��, 
 *  		 super()�� �θ������ ���Ŀ� �´� ���ڰ��� �ִ´�. 
 *  
 */
class Book {
	String title;
	int price;
//	Book(){
//		System.out.println("�θ� ������ ����");
//	}
	Book(String t, int p){
		title = t;
		price = p;
	}
}
class ComicBook extends Book {
	String hero;
	public ComicBook() {
		super("�������", 0);
	}
}
public class Test03 {
	public static void main(String[] args) {
		ComicBook b = new ComicBook();
		System.out.println(b.title);
	}
}
