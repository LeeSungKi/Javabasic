package basic;

public class Test04 {
	public static void main(String[] args) {
		// 레퍼런스 배열 ( 객체들을 배열로 만들기 ) 
		Pokemon[] p = new Pokemon[4]; 
		// [ null, null, null, null ]
		for(int i = 0; i < p.length; ++i) {
			p[i] = new Pokemon();
		}
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		
		p[0].name = "피카츄";
		
		System.out.println(p[0].name);
		
		Pokemon[] p2 = { new Pokemon(),new Pokemon(),new Pokemon() };
		System.out.println(p2[0]);
		System.out.println(p2[1]);
		System.out.println(p2[2]);
	}
}






