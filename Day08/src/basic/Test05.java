package basic;
/*
 * < this >
 * - ��ü �ڽ��� ���۷���
 * - this. : Ŭ������ ���(����/�޼���)
 * 			 --> ���� 
 * - Ŭ���� ���ο��� �ڽ��� �������, ����޼��带 ��Ī�ϴ� ���
 *   �ڵ����� 'this.'�� �ٴ´�.
 *   
 * < this ������ >
 * - ������ ���ο��� �ٸ� �����ڸ� ȣ���ϴ� ��
 *   (�����ڰ� ���� ���� �����ε� ���� ��� ���)
 * - ���� : this();
 * - ������ ���Ǻο� this �������� ȣ���� ���� ù ° �ٿ� ȣ���ؾ� �Ѵ�.
 *  
 */
class Pokemon {
	String name;
	int level;
	
	Pokemon(){ }
	Pokemon(String name, int level){
		this.name = name;
		this.level = level;
		printInfo();
	}
	Pokemon(String name2){
		// this.name = name2;
		this(name2, 0);
	}
	Pokemon(int level2){
		//this.level = level2;
		this(null, level2);
	}
	
	String getInfo() {
		return this.name + ", lv." + this.level;
	}
	void printInfo() {
		System.out.println(this.getInfo());
	}
}
public class Test05 {

}
