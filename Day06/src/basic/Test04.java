package basic;

public class Test04 {
	public static void main(String[] args) {
		// ���۷��� �迭 ( ��ü���� �迭�� ����� ) 
		Pokemon[] p = new Pokemon[4]; 
		// [ null, null, null, null ]
		for(int i = 0; i < p.length; ++i) {
			p[i] = new Pokemon();
		}
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		
		p[0].name = "��ī��";
		
		System.out.println(p[0].name);
		
		Pokemon[] p2 = { new Pokemon(),new Pokemon(),new Pokemon() };
		System.out.println(p2[0]);
		System.out.println(p2[1]);
		System.out.println(p2[2]);
	}
}






