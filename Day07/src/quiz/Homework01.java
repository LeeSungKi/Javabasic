package quiz;

import javax.swing.JOptionPane;

public class Homework01 {
	public static void main(String[] args) {
		// Student 3개짜리 배열 1개 만들기
		Student[] st = new Student[3]; // [ null, null, null ]
		for(int i = 0; i < st.length; ++i) {
			st[i] = new Student(); // 아주 중요!
			
			st[i].name = JOptionPane.showInputDialog( (i+1) + "번 학생의 이름" );
			st[i].kr = Integer.parseInt( 
							JOptionPane.showInputDialog(st[i].name + "의 국어 점수"));
			st[i].en = Integer.parseInt( 
							JOptionPane.showInputDialog(st[i].name + "의 수학 점수"));
			st[i].ma = Integer.parseInt( 
							JOptionPane.showInputDialog(st[i].name + "의 영어 점수"));
			
			st[i].avg = (st[i].kr + st[i].en + st[i].ma) / 3.0;
			
			if(st[i].avg >= 90) { st[i].grade = "A"; }
			else if(st[i].avg >= 80) { st[i].grade = "B"; }
			else if(st[i].avg >= 70) { st[i].grade = "C"; }
			else if(st[i].avg >= 60) { st[i].grade = "D"; }
			else { st[i].grade = "F"; }
			int select = JOptionPane.showConfirmDialog(null, "성별입력\n(남:예/여:아니오)");
			if(select == JOptionPane.YES_OPTION) { // '예' 선택
				st[i].isMale = true;
			}
			else if(select == JOptionPane.NO_OPTION) { // '아니오' 선택
				st[i].isMale = false;
			}
		} // for
		
		// 학생 정보 출력 + 1등학생 찾기
		Student maxSt = st[0];
		int n = 1;
		String message = "< 학생 정보 >\n";
		for(Student s : st) {
			message += n++ + "번. " + s.name + "("+ (s.isMale ? "남":"여")+")" +"\n"
					+ "국어 : " + s.kr + "점 \n"
					+ "영어 : " + s.en + "점 \n"
					+ "수학 : " + s.ma + "점 \n"
					+ "평균 : " + s.avg + "점 \n"
					+ "학점 : " + s.grade + "\n";
			if(maxSt.avg < s.avg) { 
				maxSt = s;
			}
		} // for
		
		JOptionPane.showMessageDialog(null, message + "1등 학생 : " + maxSt.name);
		
	} // main()
} // class





