package quiz;
/*
 * 대문자 : 65 ~ 90 
 * 		  'A' ~ 'Z'
 * 소문자 : 97 ~ 122
 *        'a' ~ 'z'
 * 대문자 + 32 = 소문자
 */
public class Quiz02 {
	public static void main(String[] args) {
		char[] chArr = { 'p','o','k','E','M','o','N', 'ㅋ', 'ㅋ' };
		System.out.println(chArr); // pokEMoN
		for(int i = 0; i < chArr.length; ++i) {
			if(chArr[i] >= 97 && chArr[i] <= 'z') {
				//chArr[i] -= 32;
				chArr[i] = (char)(chArr[i] - 32);
			}
		}
		System.out.println(chArr); // POKEMON
		for(int i = 0; i < chArr.length; ++i) {
			if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
				chArr[i] += 32;
			}
		}
		System.out.println(chArr); // pokemon
		
//		위 세 단어가 잘 출력되도록 sysout 중간 중간에 for문을 사용하여 코드를 완성하세요.
		
	}
}
