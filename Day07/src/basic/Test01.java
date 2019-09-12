package basic;

public class Test01 {
	public static void main(String[] args) {
		Pokemon[] pokemons = new Pokemon[4];
		
		pokemons[0] = new Pokemon();
		pokemons[0].name = "피카츄"; 
		pokemons[0].level = 1;
		
		pokemons[1] = new Pokemon();
		pokemons[1].name = "라이츄"; 
		pokemons[1].level = 2;
		
		pokemons[2] = new Pokemon();
		pokemons[2].name = "파이리"; 
		pokemons[2].level = 3;
		
		pokemons[3] = new Pokemon();
		pokemons[3].name = "꼬부기"; 
		pokemons[3].level = 4;
	
		//for(int i = 0; i < pokemons.length; ++ i) {
		//	pokemons[i].name = "없음"; 
		//}
		for ( Pokemon pok : pokemons ) {
			// pok.name = "없음";  // 수정 가능
			// pok = new Pokemon(); // 원소는 수정 불가
		}
		
		for(Pokemon pok : pokemons) {
			System.out.println(pok.name);
			System.out.println("Lv. " + pok.level);
		}
		
		System.out.println(pokemons[0].name);
		System.out.println(pokemons[1].name);
		System.out.println(pokemons[2].name);
		System.out.println(pokemons[3].name);
	}
}






