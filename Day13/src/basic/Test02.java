package basic;

public class Test02 {
	public static void main(String[] args) {
		String email = "issell@naver.com";
		
		char ch = email.charAt(3);
		System.out.println(ch); // e
		
		System.out.println(email.contains("naver")); // true
		System.out.println(email.endsWith(".com")); // true
		System.out.println(email.startsWith("www")); // false
		System.out.println("Java".equals("JAVA")); // false
		System.out.println("Java".equalsIgnoreCase("JAVA")); // true
		
		String s = String.format("이름 : %10s, 점수 : %.2f", "김피카츄", 86.66666);
		System.out.println(s);
		System.out.println(String.format("%d", 100));
		/* < 서식문자(= format character )
		 * %s : String으로
		 * %f : float으로 (실수)
		 * %d : decimal로 (정수)
		 * %c : char로 (단일문자)
		 * %o : octal (8진수 정수로)
		 * %x : hexadecimal (16진수 정수로)
		 */
		
		// "issell@naver.com"
		System.out.println(email.indexOf("e")); // 3
		System.out.println(email.indexOf("e", 5)); // 10
		System.out.println(email.lastIndexOf("e")); // 10
		System.out.println(email.indexOf("ㅋㅋㅋ")); // -1
		
		// name.epuals("")
		s = ""; 
		System.out.println(s.isEmpty()); // true
		
		System.out.println(email.length()); // 16 
		
		s = "JAVA A반 JAVA B반 JAVA C반";
		String s2 = s.replace("JAVA", "Python"); 
		System.out.println(s);
		System.out.println(s2);
		
		// replace( oldWord, newWord )
		// replace( 정규식, newWord ) 
		String str1 = "나는 피카츄다~\n"
					+ "피카피카~~~\n"
					+ "백만볼트 공격!!!";
		System.out.println(str1);
		//String str2 = str1.replace(" ", "");
		//str2 = str2.replace("\n", "");
		String str2 = str1.replaceAll(" |\n", "");
		System.out.println(str2);
		
		String str3 = "akhasㅂㅈ ㄷㅂㅈㅋㅌㅊㅋㅌㅊaAFVEd asty123123123";
		// 한글 삭제 
		System.out.println( str3.replaceAll("[ㄱ-힣]", ""));
		// 숫자, 대문자 삭제
		System.out.println( str3.replaceAll("[0-9A-Z]", ""));
		// a만 남기고 모두 삭제 
		System.out.println( str3.replaceAll("[^a]", ""));
		
		String[] arr = email.split("@|\\.");
		for(String st : arr) {
			System.out.println(st);
		}
		
		s = "ABCDEFG"; 
		System.out.println(s.substring(3)); // DEFG
		System.out.println(s.substring(1, 4)); // BCD
		
		s = "        ㅋㅋㅋㅋ   ㅎㅎㅎㅎㅎㅎㅎㅎ    ㅋㅋㅋㅋㅋ      "; 
		System.out.println("[" + s + "]");
		System.out.println("[" + s.trim() + "]");
		
		// s = true;
		// s = 1 + "";
		s = String.valueOf(1); // 1 --> "1" 
	}
}














