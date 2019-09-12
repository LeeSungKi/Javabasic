package quiz;
class Unit {
	private String name;
	private int hp;
	private int ap;
	
	public Unit() {}
	public Unit(String name) {
		this(name, 0,0);
	}
	public Unit(String name, int hp, int ap){
		setName(name);
		setHp(hp); 
		setAp(ap);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp > 0 ? hp : 0;
	}
	public void setAp(int ap) {
		this.ap = ap > 0 ? ap : 0;
	}
	public String getName() { return name; }
	public int getHp() { return hp; }
	public int getAp() { return ap; }
	
	public String getInfo() { 
		return "�̸� : " + name +
				"\nü�� : " + hp + 
				"\n���ݷ� : " + ap;
	}
	public void printInfo() {
		System.out.println(getInfo());
	}
}
class Warrior extends Unit {
	private String weapon;
	
	public Warrior() {
		super("����", (int)(Math.random()*100)+1,(int)(Math.random()*100)+1 );
	}
	public Warrior(String name, int hp, int ap, String weapon) {
		super(name, hp, ap); 
		this.weapon = weapon; 
	}
	
	public String getWeapon() { return weapon; }
	public void setWeapon(String w) { 
		weapon = w;
	}
	public void printWarrior() {
		System.out.println("===== ���� ���� =====");
		System.out.println(super.getInfo());
		System.out.println("���� : " + weapon);
	}
}
class Sniper extends Unit {
	Sniper(){
		super("���ݼ�", (int)(Math.random()*100)+1,(int)(Math.random()*100)+1);
	}
}
public class Quiz02 {
	public static void main(String[] args) {
		Unit u1 = new Unit();
		Sniper u2 = new Sniper();
		Warrior u3 = new Warrior("����1", 1000, 550, "����");
		
		u1.printInfo();
		u2.printInfo();
		u3.printWarrior();
	}
}
