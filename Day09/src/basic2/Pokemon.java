package basic2; // 패키지 선언 ( 소스파일의 소속 패키지  )

public class Pokemon {
	private String name;
	private int level;
	
	public void setName(String n) {
		if(n.length() >= 10) {
			System.out.println("이름이 너무 깁니다.");
		}
		else {
			name = n;
		}
	}
	public void setLevel(int lv) {
		if(lv < 0) {
			System.out.println("레벨은 음수가 될 수 없습니다.");
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




