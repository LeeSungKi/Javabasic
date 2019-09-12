package quiz;
class Account {
	private String id;
	private String password;
	private String email;
	
	public boolean setEmail(String email) {
		// email은 null이 아니어야 한다.
		// @가 있어야 함 ==> contains()
		// gmail.com / naver.com / hanmail.net / nate.com 만 가능 ==> endsWith()
		// 아이디가 있어야 함 ( @gmail.com (X) ) ==> startsWith()
		// 올바른 이메일이라면 email 필드에 저장
		return false;
	}
	
	private void setId() {
		// id는 email의 아이디 부분만 추출하여 자동으로 등록되어야 한다. ==> indexOf(), substring()
		// 예) 이메일 : issell@naver.com
		//      ID : issell
		
		
	}
	
	public void setPassword(String password, String rePassword) {
		// password는 null이 아니어야 한다.
		// password의 길이는 4자 이상 20자 이하여야 한다.
		// 대문자/소문자/특수기호를 반드시 포함하여야 한다.
		// ( 참고: https://highcode.tistory.com/6 ) 
		// password와 rePassword는 동일해야 한다.
		// 올바른 비밀번호라면 password 필드에 저장한다.
		
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
		// 비밀번호의 앞 두 글자를 제외한 모든 문자를 "*"로 대체하는 StringBuilder를 생성한다.
		// 예) 실제 비번 : P@ssW0rd ===> 리턴 비번 : P@****** 
		// ==> 방법1. substring(), length(), 반복문
		// ==> 방법2. 정규식 사용
		return tmp.toString();
	}
}
public class Quiz02 {
	public static void main(String[] args) {
		// 회원가입 프로그램
		// 이메일과 비밀번호를 Account인스턴스에 저장한다.
		// 단, 조건에 맞지 않은 경우 해당 필드를 다시 입력 받는다.
		// 비밀번호는 두 번 입력 받는다.
		
		// 아이디, 이메일, 비밀번호를 모두 등록했다면 결과를 출력한다.
		// 단, 비밀번호는 전부 보여주지 않는다.
	}
}
