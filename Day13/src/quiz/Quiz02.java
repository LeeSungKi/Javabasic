package quiz;
class Account {
	private String id;
	private String password;
	private String email;
	
	public boolean setEmail(String email) {
		// email�� null�� �ƴϾ�� �Ѵ�.
		// @�� �־�� �� ==> contains()
		// gmail.com / naver.com / hanmail.net / nate.com �� ���� ==> endsWith()
		// ���̵� �־�� �� ( @gmail.com (X) ) ==> startsWith()
		// �ùٸ� �̸����̶�� email �ʵ忡 ����
		return false;
	}
	
	private void setId() {
		// id�� email�� ���̵� �κи� �����Ͽ� �ڵ����� ��ϵǾ�� �Ѵ�. ==> indexOf(), substring()
		// ��) �̸��� : issell@naver.com
		//      ID : issell
		
		
	}
	
	public void setPassword(String password, String rePassword) {
		// password�� null�� �ƴϾ�� �Ѵ�.
		// password�� ���̴� 4�� �̻� 20�� ���Ͽ��� �Ѵ�.
		// �빮��/�ҹ���/Ư����ȣ�� �ݵ�� �����Ͽ��� �Ѵ�.
		// ( ����: https://highcode.tistory.com/6 ) 
		// password�� rePassword�� �����ؾ� �Ѵ�.
		// �ùٸ� ��й�ȣ��� password �ʵ忡 �����Ѵ�.
		
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
	public String getPartialPassword() {
		StringBuilder tmp = new StringBuilder();
		// ��й�ȣ�� �� �� ���ڸ� ������ ��� ���ڸ� "*"�� ��ü�ϴ� StringBuilder�� �����Ѵ�.
		// ��) ���� ��� : P@ssW0rd ===> ���� ��� : P@****** 
		// ==> ���1. substring(), length(), �ݺ���
		// ==> ���2. ���Խ� ���
		return tmp.toString();
	}
}
public class Quiz02 {
	public static void main(String[] args) {
		// ȸ������ ���α׷�
		// �̸��ϰ� ��й�ȣ�� Account�ν��Ͻ��� �����Ѵ�.
		// ��, ���ǿ� ���� ���� ��� �ش� �ʵ带 �ٽ� �Է� �޴´�.
		// ��й�ȣ�� �� �� �Է� �޴´�.
		
		// ���̵�, �̸���, ��й�ȣ�� ��� ����ߴٸ� ����� ����Ѵ�.
		// ��, ��й�ȣ�� ���� �������� �ʴ´�.
	}
}
