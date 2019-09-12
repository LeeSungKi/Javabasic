package quiz;
class Student {
	private String name;
	private int kr, en, ma;
	private double avg;
	private boolean pass;
	private char grade;
	
	// 1. 생성자 (여러분 마음대로 여러 개 만들기) 
	Student(){
		
	}
	Student(String name){
		this(name, 0, 0, 0); 
	}
	Student(String name, int kr, int en, int ma){
		setName(name); 
		setKr(kr);
		setEn(en); 
		setMa(ma);
		
	}
	// 2. getters (형식에 맞게)
	public String getName() { return name; }
	public int getKr() { return kr;}
	public int getEn() { return en;}
	public int getMa() { return ma;}
	public double getAvg() { return avg; }
	public boolean isPass() { return pass; }
	public char getGrade() { return grade; }
	
	
	// 3. setters (재료를 넣으면 검열을 거쳐 올바른 데이터만 들어감)
	//  0) name : 이름
	public void setName(String n) {
		name = n;
	}
	//  1) kr, en, ma : 0 점 이상 100점 이하만 저장 가능, 그 외 0점 
	public void setKr(int k) {
		kr = k >= 0 && k <= 100 ? k : 0;
		setAvg();
	}
	public void setEn(int e) {
		en = e >= 0 && e <= 100 ? e : 0;
		setAvg();
	}
	public void setMa(int m) {
		ma = m >= 0 && m <= 100 ? m : 0; 
		setAvg();
	}
	//  2) avg : (인자값 받지 않고, kr, en, ma만 가지고 계산되도록)
	private void setAvg() {
		avg = (kr + en + ma) / 3.0;
		setPass();
		setGrade();
	}
	//  3) pass : 60점 이상이면 true
	private void setPass() {
		pass = avg >= 60;
	}
	//  4) grade : ABCDF 중 1개로
	private void setGrade() {
		if(avg >= 90) { grade = 'A';}
		else if(avg >= 80) { grade = 'B';}
		else if(avg >= 70) { grade = 'C';}
		else if(avg >= 60) { grade = 'D';}
		else { grade = 'F'; }
	}
	
}
public class Quiz01 {
	public static void main(String[] args) {
		// Student 테스트 (마음대로)
		Student s = new Student("김피카츄", 100, 80, -10);
		System.out.println("수학 점수 수정 전");
		System.out.println(s.getName());
		System.out.println("국어 : " + s.getKr());
		System.out.println("영어 : " + s.getEn());
		System.out.println("수학 : " + s.getMa());
		System.out.println("평균 : " + s.getAvg());
		System.out.println("합격 : " + (s.isPass()?"합격": "불합격"));
		System.out.println("학점 : " + s.getGrade());
		
		s.setMa(100);
//		s.setAvg();
//		s.setPass();
//		s.setGrade();
		System.out.println("수학 점수 수정 후");
		System.out.println(s.getName());
		System.out.println("국어 : " + s.getKr());
		System.out.println("영어 : " + s.getEn());
		System.out.println("수학 : " + s.getMa());
		System.out.println("평균 : " + s.getAvg());
		System.out.println("합격 : " + (s.isPass()?"합격": "불합격"));
		System.out.println("학점 : " + s.getGrade());
		
		s.setMa(50);
		
	}
}





