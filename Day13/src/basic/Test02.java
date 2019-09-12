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
		
		String s = String.format("�̸� : %10s, ���� : %.2f", "����ī��", 86.66666);
		System.out.println(s);
		System.out.println(String.format("%d", 100));
		/* < ���Ĺ���(= format character )
		 * %s : String����
		 * %f : float���� (�Ǽ�)
		 * %d : decimal�� (����)
		 * %c : char�� (���Ϲ���)
		 * %o : octal (8���� ������)
		 * %x : hexadecimal (16���� ������)
		 */
		
		// "issell@naver.com"
		System.out.println(email.indexOf("e")); // 3
		System.out.println(email.indexOf("e", 5)); // 10
		System.out.println(email.lastIndexOf("e")); // 10
		System.out.println(email.indexOf("������")); // -1
		
		// name.epuals("")
		s = ""; 
		System.out.println(s.isEmpty()); // true
		
		System.out.println(email.length()); // 16 
		
		s = "JAVA A�� JAVA B�� JAVA C��";
		String s2 = s.replace("JAVA", "Python"); 
		System.out.println(s);
		System.out.println(s2);
		
		// replace( oldWord, newWord )
		// replace( ���Խ�, newWord ) 
		String str1 = "���� ��ī���~\n"
					+ "��ī��ī~~~\n"
					+ "�鸸��Ʈ ����!!!";
		System.out.println(str1);
		//String str2 = str1.replace(" ", "");
		//str2 = str2.replace("\n", "");
		String str2 = str1.replaceAll(" |\n", "");
		System.out.println(str2);
		
		String str3 = "akhas���� ������������������aAFVEd asty123123123";
		// �ѱ� ���� 
		System.out.println( str3.replaceAll("[��-�R]", ""));
		// ����, �빮�� ����
		System.out.println( str3.replaceAll("[0-9A-Z]", ""));
		// a�� ����� ��� ���� 
		System.out.println( str3.replaceAll("[^a]", ""));
		
		String[] arr = email.split("@|\\.");
		for(String st : arr) {
			System.out.println(st);
		}
		
		s = "ABCDEFG"; 
		System.out.println(s.substring(3)); // DEFG
		System.out.println(s.substring(1, 4)); // BCD
		
		s = "        ��������   ����������������    ����������      "; 
		System.out.println("[" + s + "]");
		System.out.println("[" + s.trim() + "]");
		
		// s = true;
		// s = 1 + "";
		s = String.valueOf(1); // 1 --> "1" 
	}
}














