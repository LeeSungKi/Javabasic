package basic;

import javax.swing.JOptionPane;

/*
 * 
 * < ����(Exception) >
 * - ��Ÿ�� ���� (���� �� ����)
 *   ���� ���� 
 *    1. ������ ���� --> ������(.java-->.class�� ��ȯ) �߿� ���� ���� 
 *    			 * ��������, import ���� ==> ���� ����
 *    2. ��Ÿ�� ���� --> ���� �� �߻��� ���߻�Ȳ 
 * 
 * - ���� Ŭ���� : ~~Exception 
 *   ��Ʈ Ŭ���� : java.lang.Exception Ŭ����
 *   
 */
public class Test03 {
	public static void main(String[] args) {
		try { // Exception�� �߻��� ���ɼ��� �ִ� �ڵ� 
			String data;
			data = JOptionPane.showInputDialog("����1");
			int n1 = Integer.parseInt(data); // NumberFormatException
			data = JOptionPane.showInputDialog("����2");
			int n2 = Integer.parseInt(data); // NumberFormatException
			JOptionPane.showMessageDialog(null, "�� : " + n1/n2); // ArithmeticException
		} 
		catch(NumberFormatException e) { // ����Ŭ����1 ������ 
			e.printStackTrace();
			System.out.println("e.getMessage() : " + e.getMessage());
			JOptionPane.showMessageDialog(null, "������ �Է��ϼž� �մϴ�.");// ���ܻ�Ȳ1�� �߻����� �� ������ �ڵ�
		}
		catch(ArithmeticException e) { // ����Ŭ����2 ������ 
			JOptionPane.showMessageDialog(null, "0���� ���� �� �����ϴ�.");// ���ܻ�Ȳ2�� �߻����� �� ������ �ڵ�
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "����ġ ���� ��Ȳ�� �߻��Ͽ����ϴ�.");
		}
		finally { // (�ɼ�) try���� ���������� ������, �߰��� catch���� ����Ǿ��� ������� ������ �������� ������ �ڵ�
				  // ������ �۾� ���� ���⿡ ����
			JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
		}
	}
}







