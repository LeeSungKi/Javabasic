package quiz;

import javax.swing.JOptionPane;

public class Quiz03 {
	public static void main(String[] args) {
		String menu = "1. 시작하기 \n"
					+ "2. 기록보기 \n"
					+ "3. 종료";
		String records = "< 명예의 전당 >"; 
		int maxScore = 0; // 최대 점수
		int index = 0; // 게임 진행 횟수
		
		menu: while(true) {
			
			String select = JOptionPane.showInputDialog(menu);
			// 1 --> "1"
			switch(select) {
			case "1":  // 시작하기 
				int correct = (int)(Math.random() * 100) + 1;
				int count;
				
				System.out.println("correct : " + correct);
				
				++index; // 게임 진행 횟수 추가 (index번 째 게임)
				
				for(count = 0; count < 15; ++count) { // 게임 진행
					int userInput = Integer.parseInt(JOptionPane.showInputDialog("1 ~ 100를 입력하세요.(" + (count+1) + "회차 시도)"));
					
					if(userInput < 1 || userInput > 100) {
						JOptionPane.showMessageDialog(null, "1이상 100이하의 정수를 입력하세요.");
						--count; // 이번 시도는 무효처리
						continue;
					}
					if(correct == userInput) {
						JOptionPane.showMessageDialog(null, "정답!");
						break; 
					}
					if(correct > userInput) {
						JOptionPane.showMessageDialog(null, "Up");
						continue;
					}
					JOptionPane.showMessageDialog(null, "Down");
				
				}
				
				// 점수 산출 
				int userScore = (15 - count) * 100;
				if(userScore > maxScore) { // 최대 기록인지 확인
					maxScore = userScore; // 기록 갱신
				}
				
				if(userScore == 0) {
					JOptionPane.showMessageDialog(null, "GAME OVER");
				}
				// 기록 누적
				records += "\n" + index + ". " + userScore + "점";
				break; // switch문 종료
			
			case "2":  // 기록보기
				if(index == 0) {
					JOptionPane.showMessageDialog(null, "기록 없음");
				}
				else {
					JOptionPane.showMessageDialog(null, records + "\n최대 점수 : " + maxScore + "점");
				}
				break; // switch문 종료
			
			case "3":  // 종료
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				// return; // 이것도 되고
				break menu;
			
			default: // 잘못된 입력
				JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.");
			
			}
		}
	}
}
