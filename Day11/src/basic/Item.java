package basic;
/*
 * < �������̽� >
 * - ������! �߻�ȭ�� �ذ�! 
 * - �Ծ�, ��� 
 * - ����� ���� ����� �߻�޼��带 ������ �� �����Ѵ�.
 * - �������̽����� ������ �� �ִ� ��� 
 *  	1) ��� ( public static final )
 *  	2) �߻� �޼��� ( public abstract ) 
 *  	3) default �޼��� ( default )
 *  	4) static �޼��� ( static )
 *   ==> �Ϲ� �������, �Ϲ� ����޼��� ���� �Ұ�
 *  
 */
public interface Item {
	/*public static final */int DEFAULT_PRICE = 10000;
	/*public abstract*/ String info();
	/*public abstract*/ void adjust();
	default void aa() { }
	static void bb() { }
}





