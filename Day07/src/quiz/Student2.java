package quiz;

public class Student2 {
	//이름, 국, 영, 수, 평균, 등급
	String name;
	int kr, en, ma;
	double avg;
	String grade;
	
	void setData(String n, int k, int e, int m){
		name = n;
		kr = k;
		en = e;
		ma = m;
		setMean();
		setGrade();
	}
	void setMean() {
		avg = (kr + en + ma) / 3.0;
	}
	
	void setGrade() {
		if(avg >= 90) { grade = "A"; }
		else if(avg >= 80) { grade = "B"; }
		else if(avg >= 70) { grade = "C"; }
		else if(avg >= 60) { grade = "D"; }
		else { grade = "F"; }
	}
	
	String getInfo() {
		return "이름 : " + name + "\n"
				+ "국어 : " + kr + "\n"
				+ "영어 : " + en + "\n"
				+ "수학 : " + ma + "\n"
				+ "평균 : " + avg + "\n"
				+ "등급 : " + grade + "\n";
	}
	
	void printData(){
		System.out.println(getInfo());
	}
	 /*  메인 클래스 : Quiz03
	 *   4명의 학생 객체를 배열로 선언하고 
	 *   반복문을 사용하여 학생들의 이름, 국, 영, 수를 입력 받음
	 *   입력이 끝나면 모든 학생의 정보를 출력
	 */
}
