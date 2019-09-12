package quiz;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * < 국가 관리 프로그램 >
 * 메뉴) 
 * 1. 국가 등록 ( 국가명, 수도명, 인구수를 등록 )
 * 2. 모든 국가 보기 
 * 3. 국가 검색 ( 국가명을 입력 받고 있으면 국가 정보 출력, 없으면 "미등록 국가" ) 
 * 4. 국가 삭제 ( 인덱스 입력 받고, 해당 원소 삭제 )
 * 0. 종료 하기  
 */
class Nation {
	String nation;
	String capital;
	int population;
	Nation(String n, String c, int p){
		nation = n;
		capital = c;
		population = p;
	}
	public String toString() {
		return nation + " / " + capital + " / 약 " + population + "명";
	}
}
public class Quiz01 {
	public static void main(String[] args) {
		String menu = "1. 국가 등록 \n"
					+ "2. 모든 국가 보기 \n"
					+ "3. 국가 검색 \n"
					+ "4. 국가 삭제 \n"
					+ "0. 종료";
		String select;
		String message;
		String tNation;
		String tCapital;
		int tPopulation;
		int tIndex;
		ArrayList<Nation> list = new ArrayList<Nation>();
		
		while(true) {
			select = JOptionPane.showInputDialog(menu);
			switch (select) {
			case "0":
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				return;
			case "1":
				tNation = JOptionPane.showInputDialog("새 국가명"); 
				tCapital = JOptionPane.showInputDialog(tNation + "의 수도");
				tPopulation = Integer.parseInt(JOptionPane.showInputDialog(tNation + "의 인구수"));
//				Nation tmp = new Nation(tNation, tCapital, tPopulation);
//				list.add(tmp);
				list.add(new Nation(tNation, tCapital, tPopulation));
				JOptionPane.showMessageDialog(null, "등록 완료!");
				break;
			case "2":
				if(list.isEmpty()) {
					JOptionPane.showMessageDialog(null, "등록된 국가가 없습니다.");
					continue;
				}
				message = "<국가 목록>\n";
				for(Nation n : list) {
					message += n.toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				if(list.isEmpty()) {
					JOptionPane.showMessageDialog(null, "등록된 국가가 없습니다.");
					continue;
				}
				tNation = JOptionPane.showInputDialog("찾으실 국가명"); 
				message = "미등록 국가";
				if(tNation == null || tNation.isEmpty()) {
					JOptionPane.showMessageDialog(null, "국가를 입력하셔야합니다.");
					continue;
				}
				for(Nation n : list) {
					if(tNation.equals(n.nation)) {
						message = "찾았습니다!\n" + n.toString();
					}
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "4":
				if(list.isEmpty()) {
					JOptionPane.showMessageDialog(null, "등록된 국가가 없습니다.");
					continue;
				}
				message = "< 국가 목록 >\n";
				tIndex = 1;
				for(Nation n : list) {
					message += tIndex++ + ". " + n.nation + '\n';
				}
				message += "삭제할 국가의 번호를 입력하세요.";
				tIndex = Integer.parseInt(JOptionPane.showInputDialog(message));
				if(tIndex < 1 || tIndex > list.size()) {
					JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
					continue;
				}
				Nation n = list.remove(tIndex-1);
				JOptionPane.showMessageDialog(null, n.nation + "(을)를 삭제하였습니다.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "다시 입력하세요.");
			}
		}
	}
}
