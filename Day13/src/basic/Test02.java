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
		
		String s = String.format("ÀÌ¸§ : %10s, Á¡¼ö : %.2f", "±èÇÇÄ«Ãò", 86.66666);
		System.out.println(s);
		System.out.println(String.format("%d", 100));
		/* < ¼­½Ä¹®ÀÚ(= format character )
		 * %s : StringÀ¸·Î
		 * %f : floatÀ¸·Î (½Ç¼ö)
		 * %d : decimal·Î (Á¤¼ö)
		 * %c : char·Î (´ÜÀÏ¹®ÀÚ)
		 * %o : octal (8Áø¼ö Á¤¼ö·Î)
		 * %x : hexadecimal (16Áø¼ö Á¤¼ö·Î)
		 */
		
		// "issell@naver.com"
		System.out.println(email.indexOf("e")); // 3
		System.out.println(email.indexOf("e", 5)); // 10
		System.out.println(email.lastIndexOf("e")); // 10
		System.out.println(email.indexOf("¤»¤»¤»")); // -1
		
		// name.epuals("")
		s = ""; 
		System.out.println(s.isEmpty()); // true
		
		System.out.println(email.length()); // 16 
		
		s = "JAVA A¹Ý JAVA B¹Ý JAVA C¹Ý";
		String s2 = s.replace("JAVA", "Python"); 
		System.out.println(s);
		System.out.println(s2);
		
		// replace( oldWord, newWord )
		// replace( Á¤±Ô½Ä, newWord ) 
		String str1 = "³ª´Â ÇÇÄ«Ãò´Ù~\n"
					+ "ÇÇÄ«ÇÇÄ«~~~\n"
					+ "¹é¸¸º¼Æ® °ø°Ý!!!";
		System.out.println(str1);
		//String str2 = str1.replace(" ", "");
		//str2 = str2.replace("\n", "");
		String str2 = str1.replaceAll(" |\n", "");
		System.out.println(str2);
		
		String str3 = "akhas¤²¤¸ ¤§¤²¤¸¤»¤¼¤º¤»¤¼¤ºaAFVEd asty123123123";
		// ÇÑ±Û »èÁ¦ 
		System.out.println( str3.replaceAll("[¤¡-ÆR]", ""));
		// ¼ýÀÚ, ´ë¹®ÀÚ »èÁ¦
		System.out.println( str3.replaceAll("[0-9A-Z]", ""));
		// a¸¸ ³²±â°í ¸ðµÎ »èÁ¦ 
		System.out.println( str3.replaceAll("[^a]", ""));
		
		String[] arr = email.split("@|\\.");
		for(String st : arr) {
			System.out.println(st);
		}
		
		s = "ABCDEFG"; 
		System.out.println(s.substring(3)); // DEFG
		System.out.println(s.substring(1, 4)); // BCD
		
		s = "        ¤»¤»¤»¤»   ¤¾¤¾¤¾¤¾¤¾¤¾¤¾¤¾    ¤»¤»¤»¤»¤»      "; 
		System.out.println("[" + s + "]");
		System.out.println("[" + s.trim() + "]");
		
		// s = true;
		// s = 1 + "";
		s = String.valueOf(1); // 1 --> "1" 
	}
}














