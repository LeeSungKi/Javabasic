package basic;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * < Map >
 * - TreeMap, HashMap 
 *   -------
 *   키를 기준으로 자동 정렬
 *   
 * - 키-값 쌍으로 원소를 저장
 *   
 *   키 : "name"
 *   값 : "홍길동"
 *   
 *   키 : "num"
 *   값 : 1
 *   
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		Map<String, Object> info = new TreeMap<String, Object>();
		
		// put(키, 값)
		info.put("name", "홍길동");
		info.put("age", 10); 
		info.put("tall", 110.4); 
		info.put("gender", "남성"); 
		info.put("contact", "010-1111-1111");
		info.put("address", "마포구 노고산동");
		
		System.out.println(info.toString());
		// {address=마포구 노고산동, age=10, contact=010-1111-1111, 
		//   gender=남성, name=홍길동, tall=110.4}
		
		// get(키) ==> Value가 return 됨
		Object obj1 = info.get("address");
		Object obj2 = info.get("name");
		System.out.println(obj1); // obj1.toString()
		System.out.println(obj2);
		
		// boolean containsKey(키) : 이 '키'가 있니?
		System.out.println(info.containsKey("tall")); // true
		System.out.println(info.containsKey("weight")); // false
		
		// boolean containsValue(값) : 이 '값'이 있니?
		System.out.println(info.containsValue("홍길동")); // true
		System.out.println(info.containsValue("고길동")); // false 
		
		// replace()
		info.replace("name", "피카츄"); // replace(키, 새 값) 
		info.replace("gender", "남성", "여성"); // replace(키, 원래 값, 새 값) 
											  // 원래값이 일치하지 않으면 변경안함
		System.out.println(info);
		
		
		// Map은 반복수행 불가능
		// 방법1. key만 뽑아서 반복 ==> keySet() ==> 리턴자료형 : Set<키의 자료형>
		Set<String> keys = info.keySet();
		System.out.println(keys);
		for(String k : keys) {
			System.out.println("Key : " + k);
			System.out.println("Value : " + info.get(k));
		}
		// 방법2. value만 뽑아서 반복 ==> values() ==> 리턴자료형 : Collection<값의 자료형>
		Collection<Object> values = info.values();
		for(Object v : values) {
			System.out.println(v);
		}
		
		info.clear();
		System.out.println(info);
	}
}








