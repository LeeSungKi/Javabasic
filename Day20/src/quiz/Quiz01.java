package quiz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Quiz01 {
	/*
	 * 메뉴 )
	 *   1. 학생등록
	 *   2. 종료하기
	 *   학생등록 : 학생의 이름, 생년월일, 점수(국영수)를 입력 받는다.
	 *   		  생년월일은 6자리를 입력 받고 year, month,date에 각각 저장
	 *           나이, 평균, 학점, 번호 자동 계산되어 저장
	 *           * 번호 : 1번부터 순차적으로 매겨짐
	 *   종료하기 : YYYY_MM_DD_HH_mm_students.dat 에 모든 학생들을 저장한 후 종료
	 */
	
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("YYYY_MM_dd_HH_mm");
	private static final String FILE_SUFFIX = "_student.dat";
	public static final String DIRECTORY = "student_data";
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		String menu = "1. 학생 등록\n2. 종료하기"; 
		menu: while(true) {
			switch (JOptionPane.showInputDialog(null, menu)) {
			case "1":
				String name = JOptionPane.showInputDialog("새 학생 이름").trim();
				String birth = JOptionPane.showInputDialog("생년월일(YYMMDD)").trim();
				int kr = Integer.parseInt(JOptionPane.showInputDialog("국어점수").trim());
				int en = Integer.parseInt(JOptionPane.showInputDialog("영어점수").trim());
				int ma = Integer.parseInt(JOptionPane.showInputDialog("수학점수").trim());
				list.add(new Student(name, birth, kr, en, ma));
				JOptionPane.showMessageDialog(null, "등록 완료!");
				break;
			case "2":
				break menu;
			default:
				JOptionPane.showMessageDialog(null, "잘못된 입력");
				break;
			}
		}
		
		// 파일 저장
		String fileName = DATE_FORMAT.format(System.currentTimeMillis()) + FILE_SUFFIX;
		ObjectOutputStream oOut = null;
		try {
			
			File directory = new File(DIRECTORY);
			if(!directory.exists()) {
				directory.mkdir();
			}
			
			oOut = new ObjectOutputStream(new FileOutputStream(DIRECTORY + "/" + fileName));
			oOut.writeObject(list);
			JOptionPane.showMessageDialog(null, "파일 저장 완료! \n파일명 : " + fileName);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oOut != null) { oOut.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}






