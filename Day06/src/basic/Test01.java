package basic;

public class Test01 {
	public static void main(String[] args) {
		String[] names = { "��ī��", "������", "���̸�", "Ǫ��" };
		
//		for(int i = 0; i < names.length; ++i) {
//			names[i] = "����"; // �Ϲ� for���� ���� ���� ����
//		}
		
		for( String n : names ) { // for ( �ӽú��� ���� : �迭�� )
			n = "����"; // n�� �ӽú���(�ٸ� ����)�̱� ������ ���⿡ ���� �־ �ҿ����
					   // Ȯ��for���� ���Ҹ� �������� �ʴ� ��쿡�� �����
					   // (�б�����!) 
		}
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	}
}
