package basic;

import java.io.FileWriter;
import java.io.IOException;

/*
 * < IO >
 * : input stream , output stream
 * : ���α׷��� �ܺ�(�ü��, file, ��Ʈ��ũ ��) ������ ������ ���� ��� 
 * 
 * < stream >
 * - �ܹ��� ���� 
 *   ������ : ���
 *   ������ : �Է�
 * - ���Լ��� ���� (QUEUE ����)
 *   ���� ���� �����Ͱ� ���� ����������.
 * - ���� 
 *   1) Byte ��� ��Ʈ�� : 
 *   		���� : byte�� (1byte¥�� ������)
 *   		�뵵 : �ؽ�Ʈ�� ������ ��� ������ (�׸�, ����, exe ���� ������ ��)
 *   		��Ʈ : InputStream, OutputStream
 *   				(java.io ��Ű���� �������)
 *   
 *   2) Char ��� ��Ʈ�� :  
 *   		���� : char�� (2byte¥�� ������)
 *   		�뵵 : �ؽ�Ʈ ���ۿ� (�޸���, ä��, ����, ��)
 *   		��Ʈ : Reader, Writer
 *   				(java.io ��Ű��) 
 * - �������� 
 *  1. ��Ʈ�� ���� (�������� ����)
 *  2. ������ ������ Ȥ�� �ޱ�
 *  3. ��Ʈ�� �ݱ�
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		// ��ī��, ������, ���̸� 3�ܾ aa.txt�� ����
		FileWriter fw = null; 
		try {
			// 1. ��Ʈ�� ����
			fw = new FileWriter("C:\\Users\\PC\\Desktop\\aa.txt", true);
			// (1) ��½�Ʈ���� '���� ����'�� �������� ������
			// ������ �� ������ �����Ѵ�.
			// (2) ������ �̸��� ���� ��� (�տ� ��ΰ� ���� ��), �ڹ� ������Ʈ�� �⺻ ��δ�.
			//  ( ��ũ�����̽� --> Day18 ���� )
			// (3) ������ ��� : \\ Ȥ�� / �� �����Ѵ�. 
			// 2. ������ ������
			fw.write("��ī��\r\n");
			fw.write("������\r\n");
			fw.write("���̸�\r\n");
			// (1) �⺻������ '�����' �����
			// (2) '�߰����'�� �����Ϸ��� �����ڿ� true �߰�
			System.out.println("���� �Ϸ�!");
		} catch(IOException e) {
			System.out.println("��Ʈ���� ���� �߻�!");
		} finally {
			try {
				// 3. ��Ʈ�� �ݱ�
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



