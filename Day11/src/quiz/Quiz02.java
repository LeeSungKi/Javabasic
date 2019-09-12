package quiz;

import java.util.Scanner;

interface Transport {
	int ADULT_PRICE = 1000;
	int KID_PRICE = 300;
	int getCharge(int age, int distance);
}

class Bus implements Transport {
	
	public int getCharge(int age, int distance) {
		// age를 가지고 판별 
		// 성인 : 성인 기본 요금 + distance*10
		// 미성년 : 아동 기본 요금 + distance
		// 요금을 return
		return age >= 20 ? 
				ADULT_PRICE + (distance*10) : 
				KID_PRICE + distance;
	}
}
class Subway implements Transport {
	@Override
	public int getCharge(int age, int distance) {
		// 성인 : 성인 기본 요금 + 추가요금 
		// 아동 : 아동 기본 요금 + 추가요금
		// distance가 10키로 이상부터는 10키로 단위로 100원씩 추가
		// 10 ~ 19 : 100원 추가 
		// 20 ~ 29 : 200원 추가 
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
		// 기본요금 무조건 3000 원  + 5키로 이상부터 키로당 100원
		// 미성년자인 경우 20% 할인
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
		// 교통수단, 나이, 이동할 거리를 입력 받고 
		// 요금 출력
		
		int age;
		int distance;
		int tSelect;
		Transport t;
		Scanner sc = new Scanner(System.in);
		System.out.print("(1) 버스 (2) 지하철 (3) 택시 \n선택 : ");
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
				String s = "잘못된 교통수단";
				@Override
				public int getCharge(int age, int distance) {
					//System.out.println("잘못된 교통수단");
					System.out.println(s);
					return 0;
				}
			};
		}
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("거리 km 수 : ");
		distance = sc.nextInt();

		System.out.println("요금은 총 " + t.getCharge(age, distance) + "원입니다.");
	}

}





