package basic;
/*
 * < Collection 의 특징 >
 * 1. 원소의 기본자료형 : Object ( 다 들어감! 원시자료형의 경우, 포장객체가 되어 들어감 )
 * 2. 여러 형태가 있음 
 *   1) List : 인덱스 O, 선형구조, 중복원소 허용함 (인덱스로 구분) 
 *   2) Set : 인덱스 X, 선형구조, 중복원소 허용 안함 (중복된 원소가 또 저장되면, 새로운 원소로 덮어씀)
 *   3) Map : 인덱스 X, 비선형구조, Key-Value 쌍으로 저장하는 형태
 *   		  검색이 가장 빠름. Key를 통해 Value를 찾는 형태임
 * 
 * < List >
 * 1) ArrayList : 무제한 배열
 *  - 기본적으로 10칸 생성 (단 생성자에서 변경할 수 있음) 
 *  - 원소 추가 시 자동으로 배열 칸을 늘림 
 *  
 * 2) LinkedList : (이중)연결리스트
 *  - 중간 원소의 위치가 자주 바뀌거나, 
 *    원소 삭제가 빈번히 일어나는 구조의 경우 ArrayList보다 LinkedList를 사용한다.
 *  - 인접노드의 위치를 기록할 필드가 필요하므로 ArrayList보다 메모리 사용이 큼
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test01 {
	
	static public class Pokemon{
		String name;
		int level;
		public Pokemon(String name, int level) {
			this.name = name;
			this.level = level;
		}
		public String toString() {
			return name + "/LV." + level;
		}
	}
	
	public static void main(String[] args) {
		// ArrayList모양의 창고 객체 생성
		ArrayList list = new ArrayList();
		Test01 t = new Test01();
		// 원소 추가 
		list.add(10); 
		list.add(true); 
		list.add(new Test01.Pokemon("피카츄", 10)); 
		list.add(new Test01.Pokemon("라이츄", 20));
		list.add("ABC"); 
		
		System.out.println(list); // list.toString();
		
		// 원소 삽입
		list.add(2, new Test01.Pokemon("푸린", 20)); // 2번 위치에 푸린 객체 삽입
		System.out.println(list);
		
		// 원소 조회 
		Object o = list.get(1);  // 1번 원소가 뭐니?
		System.out.println("list의 1번 원소: " + o);
		
		// 원소 삭제 
		// remove(Object 원소)
		// remove(int 인덱스) 
		list.remove("ABC");
		System.out.println(list);
		
		list.remove(2); // 2번 원소 삭제
		System.out.println(list);
		
		list.remove((Integer)10); // '10' 원소 삭제 (인덱스 아님!) 
		System.out.println(list);
		
		// 전체 개수 : int size()
		System.out.println("현재 " + list.size() + "개");
		
		// 비었니? : boolean isEmpty()
		System.out.println("원소 없니? " + list.isEmpty()); // false
		
		// 이 원소가 있니? : boolean contains(Object 찾을 원소)
		System.out.println("10이 있니? " + list.contains(10));
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(100); 
		list2.add(10);
		list2.add(1);
		list2.add(-100);
		
		list.addAll(list2); // 다른 컬렉션 객체와 병합하기
		System.out.println(list);
		
		list.removeAll(list2); // list에서 list2 원소들을 삭제 
		System.out.println(list);
		
		Object[] arr = list.toArray(); // 배열 만들기
		System.out.println("0번 원소 : " + arr[0]);
		
		// for문으로 모든 원소 조회하기 
		// 방법1. 일반 for문
		for(int i = 0; i < list.size(); ++i) {
			System.out.println("일반 for문 : " + list.get(i));
		}
		
		// 방법2. 확장 for문
		for(Object e : list) {
			System.out.println("확장 for문 : " + e);
		}
		
		// 방법3. java.util.Iterator 사용 
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println("이터레이터 : " + it.next());
		}
		
		// 모든 원소 삭제 : clear()
		//list.clear();
		//System.out.println(list); // []
		
		// 피카츄 객체 꺼내서 이름-> 피츄로 변경 
		Object o2 = list.get(1);
		System.out.println(o2);
		((Test01.Pokemon)o2).name = "피츄";
		
		System.out.println(list);
	}
}






