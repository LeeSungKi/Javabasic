package quiz;
/*
 * �빮�� : 65 ~ 90 
 * 		  'A' ~ 'Z'
 * �ҹ��� : 97 ~ 122
 *        'a' ~ 'z'
 * �빮�� + 32 = �ҹ���
 */
public class Quiz02 {
	public static void main(String[] args) {
		char[] chArr = { 'p','o','k','E','M','o','N', '��', '��' };
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
		
//		�� �� �ܾ �� ��µǵ��� sysout �߰� �߰��� for���� ����Ͽ� �ڵ带 �ϼ��ϼ���.
		
	}
}
