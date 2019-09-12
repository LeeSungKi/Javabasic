package basic;

import javax.swing.JOptionPane;

/*
 * 
 * < 예외(Exception) >
 * - 런타임 에러 (실행 중 에러)
 *   에러 종류 
 *    1. 컴파일 에러 --> 컴파일(.java-->.class로 변환) 중에 생긴 에러 
 *    			 * 문법에러, import 에러 ==> 빨간 밑줄
 *    2. 런타임 에러 --> 실행 중 발생한 돌발상황 
 * 
 * - 예외 클래스 : ~~Exception 
 *   루트 클래스 : java.lang.Exception 클래스
 *   
 */
public class Test03 {
	public static void main(String[] args) {
		try { // Exception이 발생할 가능성이 있는 코드 
			String data;
			data = JOptionPane.showInputDialog("정수1");
			int n1 = Integer.parseInt(data); // NumberFormatException
			data = JOptionPane.showInputDialog("정수2");
			int n2 = Integer.parseInt(data); // NumberFormatException
			JOptionPane.showMessageDialog(null, "몫 : " + n1/n2); // ArithmeticException
		} 
		catch(NumberFormatException e) { // 예외클래스1 변수명 
			e.printStackTrace();
			System.out.println("e.getMessage() : " + e.getMessage());
			JOptionPane.showMessageDialog(null, "정수를 입력하셔야 합니다.");// 예외상황1이 발생했을 때 실행할 코드
		}
		catch(ArithmeticException e) { // 예외클래스2 변수명 
			JOptionPane.showMessageDialog(null, "0으로 나눌 수 없습니다.");// 예외상황2이 발생했을 때 실행할 코드
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "예기치 못한 상황이 발생하였습니다.");
		}
		finally { // (옵션) try문이 정상적으로 끝났든, 중간에 catch절이 실행되었든 상관없이 무조건 마지막에 실행할 코드
				  // 마무리 작업 등을 여기에 적음
			JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
		}
	}
}







