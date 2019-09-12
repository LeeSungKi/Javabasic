package basic;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

/*
 * < Generic >
 * -> 형식 : <참조자료형>
 * -> 자료형 주입 (동적으로 자료형을 처리)
 * -> 주의! 원시자료형은 제네릭 선언 불가
 *    <int> ===> <Integer>
 *    
 */

public class Test02 {
	public static void main(String[] args) {
		ArrayList<Test01.Pokemon> list = new ArrayList<Test01.Pokemon>(100);
		// ArrayList에게 원소의 자료형이 Test01.Pokemon임을 알림
		// ArrayList는 원소들의 자료형을 Object형이 아니라 Pokemon형으로 인식함
		// 각 원소들에 대해 매번 형변환(다운캐스팅)할 필요가 없다!!
		
		list.add(new Test01.Pokemon("피카츄", 10));
		list.add(new Test01.Pokemon("피츄", 7));
		list.add(new Test01.Pokemon("또도가스", 101));
		list.add(new Test01.Pokemon("잠만보", 50));
		list.add(new Test01.Pokemon("치코리타", 10));
		
		// 모든 원소들의 레벨 1증가 
//		for(Object o : list) {
//			++((Test01.Pokemon)o).level;
//		}
		
		// 제네릭 설정 후
		for(Test01.Pokemon o : list) {
			++o.level;
		}
		
//		for(int i = 0; i < list.size(); ++i) {
//			++((Test01.Pokemon)list.get(i)).level;
//		}
		for(int i = 0; i < list.size(); ++i) {
			++list.get(i).level;
		}
		
		

//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			Test01.Pokemon p = (Test01.Pokemon)it.next();
//			++p.level;
//		}
		Iterator<Test01.Pokemon> it = list.iterator();
		while(it.hasNext()) {
			++it.next().level;
		}
		System.out.println(list);
		
		// 사용자에게 '이름'을 입력 받고 
		// 해당 포켓몬 검색 (있으면 toString(), 없으면 "미등록 포켓몬" 출력)
		String s = JOptionPane.showInputDialog("검색할 포켓몬 이름");
		boolean result = false;
		for(Object o :list) {
			if( s.equals( ((Test01.Pokemon)o).name )) {
				result = true;
				JOptionPane.showMessageDialog(null, o);
			}
		}
		if(!result) { // result == false
			JOptionPane.showMessageDialog(null, "미등록 포켓몬");
		}
		
		
	}
}











