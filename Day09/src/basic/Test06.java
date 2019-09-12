package basic;

import basic2.Pokemon;

/*
 * < ����������(=����������/ access modifiers) >
 * 
 * 				Ŭ���� ����		���� ��Ű���� �ٸ� Ŭ����		�ٸ���Ű��
 * 1. public		O				O					O
 * 2. protected		O				O					X(�ڽ�Ŭ�������Դ� O)
 * 3. 				O				O					X
 * 4. private 		O				X					X
 * 
 * public, package ���������� : Ŭ����, ���(����,�޼���,������) �տ� ���� �� �ִ�.
 * protected, private ���������� : ���(����,�޼���,������) �տ� ���� �� �ִ�.
 * 
 * ** ���� 
 *  �ϳ��� �ҽ�����(.java)���� ������ public Ŭ������ ������ �� ����.
 *  public Ŭ������ ����� ���, �� Ŭ������ �̸��� �ҽ������� �̸��� ���ƾ� �Ѵ�.
 * 
 * 
 * < ��ü ���Ἲ >
 * - �߸��� �����Ͱ� ���� �ȵȴ�.
 * 
 * < ������ ����ȭ >
 * - �ʿ��� �͸� ����
 * - ���� : ���Ἲ ��Ű��, �� Ŭ������ ����� �ٸ� �����ڵ��� ���� ����� �� �ֵ��� 
 * 
 * < ������ ĸ��ȭ >
 * - ����ȭ�� �����ϴ� ��� �� �ϳ�
 * - �����Ϳ� ��ȣ�� ġ��
 * - �ʵ�(�������)�� ������ private���� �����Ѵ�. 
 *   ���������� �ʵ忡 ������ �� �ֵ��� getter�� setter �޼��带 �����.
 *   
 * 
 * 
 */
public class Test06 {
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon(); 
		// p1.name = "��ī��";
		
		p1.setName("��ī��"); 
		System.out.println(p1.getName());
		
		p1.setLevel(-100);
		System.out.println(p1.getLevel());
	}
}








