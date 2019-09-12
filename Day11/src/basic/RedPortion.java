package basic;

public class RedPortion implements Item{
	int price = DEFAULT_PRICE + 200;
	@Override
	public void adjust() {
		System.out.println("INFO : " + info());
		System.out.println("빨간 물약을 사용했습니다.");
	}
	
	@Override
	public String info() {
		return "빨간 물약. 50% 체력을 회복합니다.";
	}
}
