package quiz;

/*
 * < Sniper VS Tank >
 * - ���ݼ�, ��ũ �� ĳ���� �� �ƹ��ų� �����ϰ� 2�� ����
 *   (��ũ vs ��ũ, �� vs ��, �� vs ��)
 * - �� ��ü�� ���� ���� ������ ���� ������ �ݺ�
 * - ù��°, Ȥ�� �ι�° �÷��̾ �̰���� ������ ���� ���! 
 *  e.g. �÷��̾�1(��ũ)�� �¸�!
 */
abstract class Champ { // �θ� Ŭ����
	String name;
	int hp, att; // ü��, ���ݷ�
	boolean alive; // true:���� ������� (���û���)
	
	public Champ() {}
	public Champ(String name) {
		this.name = name;
	}
	public Champ(String name, int hp, int att) {
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.alive = true;
	}
	abstract public void attack(Champ enemy);
}
class Soldier extends Champ { // �ڽ� Ŭ����
	// ��ü �����Ǹ�, �ڵ����� name�� "���ݼ�", hp�� 400, att�� 100
	Soldier(){
//		name = "���ݼ�"; 
//		hp = 400;
//		att = 100;
		super("���ݼ�", 400, 100); 
	}
	
	// attack �������̵� 
	// 1. 10% Ȯ���� ��弦 (��� ���)
	// 2. ������ Ȯ���� ��Ÿ(�Ϲ� ����, ��� hp�� 100��ŭ ��´�.)
	@Override
	public void attack(Champ enemy) {
		String message = "��� " + enemy.name + "(��)�� " ;
		if(Math.random() < 0.1) { // 10%�� true
			enemy.hp = 0;
			message = "��弦!!";
		}
		else {
			enemy.hp -= att;
			message = "�Ϲݰ���!"; 
		}
		enemy.alive = enemy.hp > 0; 
		if(enemy.alive) {
			message += " ���� �����ƴ�!";
		}
		System.out.println(message);
	}
}

class Tank extends Champ {
	// ��ü �����Ǹ�, �ڵ����� name�� "��ũ", hp�� 4000, att�� 50
	Tank(){
		super("��ũ", 4000, 50);
	}
	// attack �������̵� 
	// 1. 30% Ȯ���� ����� hp 30% ����
	// 2. ������ Ȯ���� ��Ÿ(�Ϲ� ����, ��� hp�� 50��ŭ ��´�.)
	@Override
	public void attack(Champ enemy) {
		String message = "��� " + enemy.name + "(��)�� " ;
		if(Math.random() < 0.3) { // 30%�� true
			enemy.hp *= 0.7;
			message = "30% ü�� ����!!";
		}
		else {
			enemy.hp -= att;
			message = "�Ϲݰ���!"; 
		}
		enemy.alive = enemy.hp > 0; 
		if(enemy.alive) {
			message += " ���� �����ƴ�!";
		}
		System.out.println(message);
	}
}
public class Quiz03 {
	public static void main(String[] args) {
		// �� Ÿ���� ��ü�� �����ϰ� 2�� ����
		// ���� �ݺ����� ����Ͽ� �� �� �ϳ��� ���� ������ ���θ� ����
		// ��, ���� ��ü�� �����ϸ� �ȵ�
		Champ p1 = Math.random() > 0.5 ? new Tank() : new Soldier();
		Champ p2 = Math.random() > 0.5 ? new Tank() : new Soldier();
		System.out.println("PLAYER 1 : " + p1.name);
		System.out.println("PLAYER 2 : " + p2.name);
		System.out.println("---------- GAME START ----------\n");
		while(p1.alive && p2.alive) {
			if(p1.alive) {
				System.out.println("p1("+p1.name + ")�� ���� ü�� :" + p1.hp );
				p1.attack(p2);
			}
			if(p2.alive) {
				System.out.println("p2("+p2.name + ")�� ���� ü�� :" + p2.hp );
				p2.attack(p1);
			}
		}
		if(p1.alive) {
			System.out.println("PLAYER1�� �¸�!");
		}
		else {
			System.out.println("PLAYER2�� �¸�!");
		}
	}
}






