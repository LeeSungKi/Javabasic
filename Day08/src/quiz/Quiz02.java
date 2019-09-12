package quiz;

import javax.swing.JOptionPane;

/*
 * Student 클래스 만들기 
 *  필드 : 이름, 국, 영, 수, 평균, 등급
 *  메소드 : 
 *   1. 생성자 
 *   	1) 아무것도 안넣어도 생성될 수 있게 
 *   	2) 이름만 넣고 생성될 수 있게
 *   	3) 이름, 국, 영, 수를 넣고 생성될 수 있게 => 평균, 등급 자동 계산
 *   2. setAvg() - 국,영,수로 평균을 계산하여 평균 필드에 저장
 *   3. setGrade() - 평균 점수로 A,B,C,D,F를 계산하여 등급 필드에 저장
 *   4. printData() - 이름, 평균, 등급을 sysout
 *   5. getData() - 이름, 국, 영, 수, 평균, 등급을 String으로 묶어서 return
 *  ** 참고! 생성자 안에서도 일반 메소드 호출할 수 있음! 
 * 
 *  Quiz02 메인 클래스 
 *   메뉴 : 
 *    1. 3명 학생 정보 입력 
 *    2. 3명 학생 정보 보기
 *    3. 종료하기 
 */
class Student {
	// 필드 : 이름, 국, 영, 수, 평균, 등급
	String name;
	int kr, en, ma;
	double avg;
	String grade;
	
	// 생성자
	Student(){}
	Student(String name){
		this.name = name; // this(name, 0, 0, 0);
	}
	Student(String name, int kr, int en, int ma){
		this.name = name;
		this.kr = kr;
		this.en = en;
		this.ma = ma;
		setAvg();
		setGrade();
	}
	
	// setAvg()
	void setAvg() {
		this.avg = (this.kr + this.en + this.ma) / 3.0;
	}
	
	// setGrade()
	void setGrade() {
		switch( (int)avg / 10 ) {
		case 10: case 9:
			grade = "A"; 
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6: 
			grade = "D"; 
			break;
		default:
			grade = "F";
		}
	}
	
	// getData()
	String getData() {
		return "이름 : " + name + "\n" + 
				"국어 : " + kr + "\n" + 
				"영어 : " + en + "\n" + 
				"수학 : " + ma + "\n" + 
				"평균 : " + avg + "\n" + 
				"학점 : " + grade;
	}
	
	// printData()
	void printData() {
		System.out.println(this.getData());
	}
	
}
public class Quiz02 {
	public static void main(String[] args) {
		String sName;
		int tKr, tEn, tMa; 
		Student[] s = new Student[3]; // [null, null, null]
		
		for(int i = 0; i < s.length; ++i) {
			sName = JOptionPane.showInputDialog( (i+1) + "번 학생 이름");
			tKr = Integer.parseInt(JOptionPane.showInputDialog(sName + "의 국어 점수"));
			tEn = Integer.parseInt(JOptionPane.showInputDialog(sName + "의 영어 점수"));
			tMa = Integer.parseInt(JOptionPane.showInputDialog(sName + "의 수학 점수"));
			s[i] = new Student(sName, tKr, tEn, tMa);
		}
		
		String str = "--- 학생 리스트 ---\n"; 
		for(Student st : s) {
			str += st.getData() + "\n\n";
		}
		JOptionPane.showMessageDialog(null, str);
		
	}
}




