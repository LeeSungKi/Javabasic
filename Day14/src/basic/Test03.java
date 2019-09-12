package basic;

/*
 * < Set >
 * - HashSet, TreeSet
 *  HashSet : �ؽ� ������ ���Ҹ� ���� ( ���� ����, �˻� �ӵ��� Ʈ������ ���� ) 
 *  TreeSet : ����Ž��Ʈ�� ������ ���Ҹ� ���� ( ���Ҹ� ������������ ���� )
 * - �ε��� X, �ߺ� ���� X
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
		List list = Arrays.asList(arr); // �迭 -> ����Ʈ��
		Collections.sort(list); // ����Ʈ�� ���� 
	}
}



