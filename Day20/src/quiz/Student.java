package quiz;

import java.io.Serializable;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Student implements Serializable{
	public static int numCount = 1;

	private String name;
	private int year;
	private int month;
	private int date;
	private int age;

	private int num;

	private int kr;
	private int en;
	private int ma;
	private double avg;
	private String grade;

	public Student(String name, String birth, int kr, int en, int ma) {
		setName(name);
		parseBirth(birth);
		setKr(kr); 
		setEn(en); 
		setMa(ma); 
		setNum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	private void setYear(int year) {
		year = year < 70 ? 2000 : 1900;
		setAge();
	}

	public int getMonth() {
		return month;
	}

	private void setMonth(int month) {
		if(month > 0 &&  month < 13) {
			this.month = month;
		}
	}

	public int getDate() {
		return date;
	}

	private void setDate(int date) {
		int maxDate = 30;
		switch(month) {
		case 1:case 3: case 5: case 7: case 8: case 10: case 12:
			maxDate = 31;
			break;
		case 2:
			if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) {
				maxDate = 29;
			}
			else {
				maxDate = 28;
			}
			break;
		}
		
		if(date > 0 && date < maxDate+1) {
			this.date = date;
		}
	}

	public int getNum() {
		return num;
	}

	private void setNum() {
		this.num = numCount++;
	}

	public int getKr() {
		return kr;
	}

	public void setKr(int kr) {
		this.kr = kr;
		setAvg();
		
	}

	public int getEn() {
		return en;
	}

	public void setEn(int en) {
		this.en = en;
		setAvg();
	}

	public int getMa() {
		return ma;
		
	}

	public void setMa(int ma) {
		this.ma = ma;
		setAvg();
	}

	public double getAvg() {
		return avg;
	}

	private void setAvg() {
		avg = (kr + en + ma) / 3.0;
		setGrade();
	}

	public String getGrade() {
		return grade;
	}

	private void setGrade() {
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = "A";
			return;
		case 8:
			grade = "B";
			return;
		case 7:
			grade = "C";
			return;
		case 6:
			grade = "D";
			return;
		default:
			grade = "F";
		}

	}

	public int getAge() {
		return age;
	}

	private void setAge() {
		age = Calendar.getInstance().get(Calendar.YEAR) - year; 
	}

	private void parseBirth(String birth) {
		if (birth.length() != 6) {
			JOptionPane.showMessageDialog(null, "생년월일은 6자리로 입력하세요.");
			return;
		}
		year = Integer.parseInt(birth.substring(0, 2));
		month = Integer.parseInt(birth.substring(2, 4));
		date = Integer.parseInt(birth.substring(4, 6));
		setYear(year);
		setMonth(month);
		setDate(date);
		setAge();
	}
}
