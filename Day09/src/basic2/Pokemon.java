package basic2; // ��Ű�� ���� ( �ҽ������� �Ҽ� ��Ű��  )

public class Pokemon {
	private String name;
	private int level;
	
	public void setName(String n) {
		if(n.length() >= 10) {
			System.out.println("�̸��� �ʹ� ��ϴ�.");
		}
		else {
			name = n;
		}
	}
	public void setLevel(int lv) {
		if(lv < 0) {
			System.out.println("������ ������ �� �� �����ϴ�.");
		}
		else {
			level = lv;
		}
	}
	
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
}




