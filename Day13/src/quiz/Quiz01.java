package quiz;

import javax.swing.JOptionPane;

public class Quiz01 {
	public static void main(String[] args) {
		// 사용자가 exit입력 할 때 까지 문자열을 jop으로 계속 입력 받음
		StringBuilder logBuilder = new StringBuilder();
		String tmp;
		while(true) {
			tmp = JOptionPane.showInputDialog("아무거나(종료:exit)");
			if(tmp == null) {
				continue;
			}
			tmp = tmp.trim();
			if("exit".equalsIgnoreCase(tmp)) {
				break;
			}
			if(!tmp.isEmpty()) {
				logBuilder.append(tmp + "\n");
			}
		}
		
		// 1. 사용자가 입력했던 모든 문자열을 출력
		String log = logBuilder.toString();
		System.out.println("--------- 입력된 문자열 ---------");
		System.out.println(log);
		
		// 2. 그 문자열의 공백,줄바꿈기호를 제외한 글자수
		String s1 = log.replaceAll(" |\n", "");
		System.out.println(s1);
		System.out.println("글자 수 : " + s1.length());
		
		// 3. 단어 수
		String[] arr = log.split(" |\n");
		System.out.println("단어 수 : " + arr.length);
		
		// 4. 사용자에게 검색어 1개를 입력 받고, 누적된 문자열에 해당 검색어가 있는지 결과 출력
		String word = JOptionPane.showInputDialog(null, "검색어");
		if(word != null) {
			System.out.println(word + "(은)는 문자열에 " + (log.contains(word)?"있습니다.":"없습니다."));
		}
		// 5. 사용자에게 글자 1개를 입력 받고, 누적된 문자열에 해당 글자가 몇 개 있는 지 출력
		word = JOptionPane.showInputDialog("개수 확인할 글자 1개");
		if(word != null) {
			char ch = word.charAt(0); 
			String s2 = log.replaceAll("[^"+ch+"]", "");
			System.out.println(ch + "(은)는 " + s2.length() + "개 있음");
		}
	}
}





