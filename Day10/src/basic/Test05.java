package basic;
/*
 * < ������(polymorphism) >
 * - ���°� �پ��ϰ� ���� �� �ִ� ���� 
 * - ���۷��� ����ȯ
 * - 1���� �ν��Ͻ��� ���� �ڷ����� ���� �� �ִ� ��
 *   (��, ��� ����) 
 * - ����) 
 *      �ϳ��� �迭�� ���� Ÿ���� ��ü�� ����� �� �ִ�.
 *      �ϳ��� �Ű������� ���� Ÿ���� ��ü�� �� �� �ִ�.
 * - �θ�Ÿ���� ��� �ڽ�Ÿ���� ��ȭ�� �� �ִ�!!!!!!!
 * - �������� �Ѱ� : �θ� ������ ����� �������̵�� �޼��常 �ν��� �� �ִ�.
 * - ��ĳ���� : ���� ����ȯ (�ڽ� ���۷����� �θ�Ÿ������ ����ȯ) ==> �ڵ�����ȯ 
 *   �ٿ�ĳ���� : �Ʒ��� ����ȯ (�θ�Ÿ���̾��� �ν��Ͻ��� ����������� ����ȯ) ==> ��������ȯ
 */
class Ironman extends Hero {
	int money;
	void move() {
		System.out.println("���̾�� ���ư�����!");
	}
}
public class Test05 {
	public static void main(String[] args) {
		Hero h;
		// h�� ���۸��� ��
		h = (Hero)new Superman();
		h.move();
		
		// h�� ��Ʈ���� �� 
		h = (Hero)new Batman();
		h.move();
		
		Hero[] heros = { new Hero(), 
						new Superman(), 
						new Batman(),
						new Spiderman() };
		for(Hero hero : heros) {
			hero.move();
		}
		
		Hero h2 = new Ironman();
		h2.move();
		((Ironman)h2).money = 1000; 
		
		Ironman i = new Ironman();
		i.money = 1000; 
		
	}
}

	
	
	
	
	