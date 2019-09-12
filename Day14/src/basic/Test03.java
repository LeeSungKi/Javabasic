package basic;

/*
 * < Set >
 * - HashSet, TreeSet
 *  HashSet : 해시 구조로 원소를 저장 ( 원소 삽입, 검색 속도가 트리보다 빠름 ) 
 *  TreeSet : 이진탐색트리 구조로 원소를 저장 ( 원소를 오름차순으로 정렬 )
 * - 인덱스 X, 중복 원소 X
 * 
 */
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Test03 {
	public static void main(String[] args) {
		Set<Integer> set;
		set = new TreeSet<Integer>();
		//set = new HashSet<Integer>();
		set.add(10); 
		set.add(-10); 
		set.add(777);
		set.add(100); 
		set.add(10);
		System.out.println(set); // set.toString()
		
		Object[] arr = set.toArray();
		List list = Arrays.asList(arr); // 배열 -> 리스트로
		Collections.sort(list); // 리스트의 정렬 
	}
}



