package quiz;

import java.util.Scanner;

interface Transport {
	int ADULT_PRICE = 1000;
	int KID_PRICE = 300;
	int getCharge(int age, int distance);
}

class Bus implements Transport {
	
	public int getCharge(int age, int distance) {
		// age�� ������ �Ǻ� 
		// ���� : ���� �⺻ ��� + distance*10
		// �̼��� : �Ƶ� �⺻ ��� + distance
		// ����� return
		return age >= 20 ? 
				ADULT_PRICE + (distance*10) : 
				KID_PRICE + distance;
	}
}
class Subway implements Transport {
	@Override
	public int getCharge(int age, int distance) {
		// ���� : ���� �⺻ ��� + �߰���� 
		// �Ƶ� : �Ƶ� �⺻ ��� + �߰����
		// distance�� 10Ű�� �̻���ʹ� 10Ű�� ������ 100���� �߰�
		// 10 ~ 19 : 100�� �߰� 
		// 20 ~ 29 : 200�� �߰� 
		// ...
		//int add = (distance / 10) * 100;
		//int price = (age >= 20 ? ADULT_PRICE : KID_PRICE) + add;
		//return price;
		return (distance / 10) * 100 
				+ (age >= 20 ? ADULT_PRICE : KID_PRICE);
	}
}
class Taxi implements Transport{
	@Override
	public int getCharge(int age, int distance) {
		// �⺻��� ������ 3000 ��  + 5Ű�� �̻���� Ű�δ� 100��
		// �̼������� ��� 20% ����
		int price = 3000;
		if(distance >= 5) {
			price += (distance - 4) * 100;
		}
		if(age < 20) {
			price *= .8;
		}
		return price;
	}
}
public class Quiz02 {
	static final int BUS = 1;
	static final int SUBWAY = 2;
	static final int TAXI = 3;
	public static void main(String[] args) {
		// �������, ����, �̵��� �Ÿ��� �Է� �ް� 
		// ��� ���
		
		int age;
		int distance;
		int tSelect;
		Transport t;
		Scanner sc = new Scanner(System.in);
		System.out.print("(1) ���� (2) ����ö (3) �ý� \n���� : ");
		tSelect = sc.nextInt();
		switch(tSelect) {
		case BUS:
			t = new Bus();
			break;
		case SUBWAY:
			t = new Subway();
			break;
		case TAXI:
			t = new Taxi();
			break;
		default:
			t = new Transport() {
				String s = "�߸��� �������";
				@Override
				public int getCharge(int age, int distance) {
					//System.out.println("�߸��� �������");
					System.out.println(s);
					return 0;
				}
			};
		}
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		System.out.print("�Ÿ� km �� : ");
		distance = sc.nextInt();

		System.out.println("����� �� " + t.getCharge(age, distance) + "���Դϴ�.");
	}

}





