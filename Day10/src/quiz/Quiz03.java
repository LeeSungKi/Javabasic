package quiz;

/*
 * < Sniper VS Tank >
 * - 저격수, 탱크 두 캐릭터 중 아무거나 랜덤하게 2개 생성
 *   (탱크 vs 탱크, 저 vs 탱, 저 vs 저)
 * - 두 객체가 서로 죽을 때까지 서로 공격을 반복
 * - 첫번째, 혹은 두번째 플레이어가 이겼는지 마지막 승자 출력! 
 *  e.g. 플레이어1(탱크)의 승리!
 */
abstract class Champ { // 부모 클래스
	String name;
	int hp, att; // 체력, 공격력
	boolean alive; // true:아직 살아있음 (선택사항)
	
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
class Soldier extends Champ { // 자식 클래스
	// 객체 생성되면, 자동으로 name은 "저격수", hp는 400, att는 100
	Soldier(){
//		name = "저격수"; 
//		hp = 400;
//		att = 100;
		super("저격수", 400, 100); 
	}
	
	// attack 오버라이드 
	// 1. 10% 확률로 헤드샷 (상대 즉사)
	// 2. 나머지 확률로 평타(일반 공격, 상대 hp를 100만큼 깎는다.)
	@Override
	public void attack(Champ enemy) {
		String message = "상대 " + enemy.name + "(에)게 " ;
		if(Math.random() < 0.1) { // 10%로 true
			enemy.hp = 0;
			message = "헤드샷!!";
		}
		else {
			enemy.hp -= att;
			message = "일반공격!"; 
		}
		enemy.alive = enemy.hp > 0; 
		if(enemy.alive) {
			message += " 적을 물리쳤다!";
		}
		System.out.println(message);
	}
}

class Tank extends Champ {
	// 객체 생성되면, 자동으로 name은 "탱크", hp는 4000, att는 50
	Tank(){
		super("탱크", 4000, 50);
	}
	// attack 오버라이드 
	// 1. 30% 확률로 상대의 hp 30% 감소
	// 2. 나머지 확률로 평타(일반 공격, 상대 hp를 50만큼 깎는다.)
	@Override
	public void attack(Champ enemy) {
		String message = "상대 " + enemy.name + "(에)게 " ;
		if(Math.random() < 0.3) { // 30%로 true
			enemy.hp *= 0.7;
			message = "30% 체력 감소!!";
		}
		else {
			enemy.hp -= att;
			message = "일반공격!"; 
		}
		enemy.alive = enemy.hp > 0; 
		if(enemy.alive) {
			message += " 적을 물리쳤다!";
		}
		System.out.println(message);
	}
}
public class Quiz03 {
	public static void main(String[] args) {
		// 두 타입의 객체를 랜덤하게 2개 생성
		// 무한 반복문을 사용하여 둘 중 하나가 죽을 때까지 서로를 공격
		// 단, 죽은 객체가 공격하면 안됨
		Champ p1 = Math.random() > 0.5 ? new Tank() : new Soldier();
		Champ p2 = Math.random() > 0.5 ? new Tank() : new Soldier();
		System.out.println("PLAYER 1 : " + p1.name);
		System.out.println("PLAYER 2 : " + p2.name);
		System.out.println("---------- GAME START ----------\n");
		while(p1.alive && p2.alive) {
			if(p1.alive) {
				System.out.println("p1("+p1.name + ")의 현재 체력 :" + p1.hp );
				p1.attack(p2);
			}
			if(p2.alive) {
				System.out.println("p2("+p2.name + ")의 현재 체력 :" + p2.hp );
				p2.attack(p1);
			}
		}
		if(p1.alive) {
			System.out.println("PLAYER1의 승리!");
		}
		else {
			System.out.println("PLAYER2의 승리!");
		}
	}
}






