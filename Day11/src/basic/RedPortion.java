package basic;

public class RedPortion implements Item{
	int price = DEFAULT_PRICE + 200;
	@Override
	public void adjust() {
		System.out.println("INFO : " + info());
		System.out.println("���� ������ ����߽��ϴ�.");
	}
	
	@Override
	public String info() {
		return "���� ����. 50% ü���� ȸ���մϴ�.";
	}
}
