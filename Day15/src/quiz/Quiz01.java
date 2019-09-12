package quiz;

import java.util.Set;
import java.util.TreeMap;

import javax.swing.JOptionPane;

/*
 * < 단어장 프로그램 >
 * 메뉴) 
 *  1. 단어 추가 --> 영단어, 뜻 두 개 입력 받기 
 *  2. 단어 검색 --> 영단어 입력 --> 뜻 혹은 '미등록 단어' 출력
 *  3. 단어 수정 --> 영단어 입력 --> 수정할 단어 입력 혹은 '미등록 단어' 출력
 *  4. 모든 단어 보기 
 *  5. 퀴즈 --> 한글 뜻을 문제로 내고, 영단어를 입력 받음 --> 정답! 혹은 땡.. 출력
 *  0. 종료
 */
public class Quiz01 {
	public static void main(String[] args) {
		TreeMap<String, String> wordbook = new TreeMap<String, String>();
		String menu = "1. 단어 추가 \n" + "2. 단어 검색 \n" + "3. 단어 수정 \n" + "4. 모든 단어 보기  \n" + "5. 퀴즈 \n" + "0. 종료 \n";
		String select;
		String tWord, tMeaning;
		String message;
		Set<String> words = null;
		
		while (true) {
			select = JOptionPane.showInputDialog(menu);
			switch (select) {
			case "1": // 단어 추가
				tWord = JOptionPane.showInputDialog("새 단어").trim(); 
				tMeaning= JOptionPane.showInputDialog("[" + tWord + "]의 뜻").trim();
				wordbook.put(tWord, tMeaning);
				JOptionPane.showMessageDialog(null, "등록 완료!");
				break;
			case "2": // 단어 검색
				tWord = JOptionPane.showInputDialog("검색할 단어").trim();
				if(wordbook.containsKey(tWord)) {
					JOptionPane.showMessageDialog(null, "뜻 : " + wordbook.get(tWord));
				} else {
					JOptionPane.showMessageDialog(null, "미등록 단어");	
				}
				break;
			case "3": // 단어 수정 
				tWord = JOptionPane.showInputDialog("수정할 단어").trim();
				if(wordbook.containsKey(tWord)) {
					tMeaning = JOptionPane.showInputDialog("새 뜻").trim();
					wordbook.replace(tWord, tMeaning);
					JOptionPane.showMessageDialog(null, "수정 완료!");
				} else {
					JOptionPane.showMessageDialog(null, "미등록 단어");	
				}
				break;
			case "4": // 모든 단어 보기 
				if(wordbook.isEmpty()) {
					JOptionPane.showMessageDialog(null, "등록된 단어가 없습니다.");
					continue;
				}
				words = wordbook.keySet();
				message = "====== 단어 목록 ======\n";
				for(String w : words) {
					message += w + " : " + wordbook.get(w) + "\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5": // 퀴즈
				if(wordbook.isEmpty()) {
					JOptionPane.showMessageDialog(null, "등록된 단어가 없습니다.");
					continue;
				}
				words = wordbook.keySet(); // 열쇠만 따로 만들기 
				Object[] wordArr = words.toArray(); // 열쇠들(단어들) 배열로 만들기 
				int randomIndex = (int)(Math.random() * wordArr.length); // 랜덤 뽑기 (0 ~ 원소개수-1)
				String correctWord = (String)wordArr[randomIndex]; // 정답 
				String quizMeaning = wordbook.get(correctWord); // 문제
				tWord = JOptionPane.showInputDialog("[" + quizMeaning + "](은)는 영어로?").trim();
				if(tWord != null && tWord.equalsIgnoreCase(correctWord)) {
					JOptionPane.showMessageDialog(null, "정답!");
				}
				else {
					JOptionPane.showMessageDialog(null, "땡..");
				}
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				return;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력");
				break;
			}
		}
	}
}
