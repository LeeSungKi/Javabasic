package quiz;

import javax.swing.JOptionPane;

/*
 * 메뉴) 
 * 	1. 여행자 추가 ==> 이름과 예산 입력 받음
 *  2. 코스 변경 ==> 전체 여행자들의 목적지
 *  3. 총 예산 보기 ==> 전체 여행자들의 총 예산
 *  4. 전체 여행자 정보 ==> 여행자들의 이름, 예산, 목적지 출력
 *  5. 여행자 삭제 ==> 여행자의 이름을 입력 받고 해당 여행자 삭제 (전체 예산도 변경)
 *  0. 종료
 */
class Traveller {
	static String destination = "미정";

	String name;
	int budget;
	
	public Traveller(String name, int budget) {
		this.name = name;
		this.budget = budget;
	}
	
	public static int getTotalBudget(Traveller[] tArr) {
		int b = 0;
		for(int i = 0; tArr[i] != null; ++i) {
			b += tArr[i].budget;
		}
		return b;
	}
	
	public String getInfo() {
		return "이름 : " + name + "\n"	
				+"개인 예산 : " + budget;
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		String menu = "1. 여행자 추가\n"
					+ "2. 코스 변경\n"
					+ "3. 총 예산보기\n"
					+ "4. 전체 여행자 정보\n"
					+ "5. 여행자 삭제 \n"
					+ "0. 종료";
		Traveller[] t = new Traveller[10];
		int lastIndex = 0;
		menu : while(true) {
			switch(JOptionPane.showInputDialog(menu)) {
			case "1":
				String name = JOptionPane.showInputDialog("이름"); 
				int budget = Integer.parseInt(JOptionPane.showInputDialog("예산"));
				if(lastIndex >= t.length) {
					Traveller[] t2 = new Traveller[t.length+10];
					for(int i = 0; i < t.length; ++i) {
						t2[i] = t[i];
					}
					t = t2;
				}
				t[lastIndex++] = new Traveller(name, budget);
				break;
			case "2":
				String tmp = JOptionPane.showInputDialog(
						"현재 목적지는 " + Traveller.destination + "입니다.\n어디로 변경하시겠습니까?");
				if(tmp != null) {
					Traveller.destination = tmp;
					JOptionPane.showMessageDialog(null, Traveller.destination + "(으)로 변경되었습니다.");
				} else {
					JOptionPane.showMessageDialog(null, "취소되었습니다.");
				}
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "총 예산은 "+ Traveller.getTotalBudget(t) + "입니다.");
				break;
			case "4":
				String info = "===== 여행자 목록 =====\n목적지 : " + Traveller.destination + "\n";
				for(Traveller traveller : t) {
					if(traveller == null) { 
						break;
					}
					info += traveller.getInfo() + "\n";
				}
				JOptionPane.showMessageDialog(null, info);
				break;
			case "5":
				String removeName = JOptionPane.showInputDialog("삭제할 여행객의 이름을 입력하세요.");
				int removeIndex = -1;
				for(int i = 0; t[i] != null; ++i) {
					if(removeName != null && removeName.equals(t[i].name)) {
						removeIndex = i;
						break;
					}
				}
				
				String msg;
				if(removeIndex > -1) {
					for(int i = removeIndex; t[i]!=null; ++i) {
						t[i] = t[i+1];
					}
					msg = "삭제를 완료하였습니다.";
					--lastIndex;
				} else {
					msg = "미등록 여행자";
				}
				JOptionPane.showMessageDialog(null, msg);
			
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				break menu; // return;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력");
			}
		}
	}
}







