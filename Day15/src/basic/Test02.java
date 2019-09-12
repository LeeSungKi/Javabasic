package basic;

import java.util.HashMap;

import javax.swing.JOptionPane;

class Pokemon {
	String name;
	int level;
	public Pokemon(String n, int lv) {
		name = n;
		level = lv;
	}
	public String toString() {
		return "[" + name + "/Lv." + level + "]";
	}
}

public class Test02 {
	public static void main(String[] args) {
		// 포켓몬 이름을 통해 포켓몬의 정보를 얻을 수 있도록 해보자
		// 키 : name
		// 값 : Pokemon 인스턴스
		HashMap<String, Pokemon> map = new HashMap<String, Pokemon>();
		
		map.put("피카츄", new Pokemon("피카츄", 10));
		map.put("라이츄", new Pokemon("라이츄", 30));
		
		Pokemon p = new Pokemon("잠만보", 30);
		map.put(p.name , p);
		
		String name = JOptionPane.showInputDialog("검색하실 포켓몬 이름");
		if(map.containsKey(name)) {
			JOptionPane.showMessageDialog(null, map.get(name) );
		}
		else {
			JOptionPane.showMessageDialog(null, "미등록 포켓몬");
		}
		
	}
}








