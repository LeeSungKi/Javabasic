package basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * < ��Ʈ��ũ ���α׷��� >
 * - java.net ��Ű��
 * - TCP ��� : �ŷڼ� �������� 
 * 		--> ȣ��Ʈ ���� ��Ŷ������ Ȯ���� �� ���� ��Ŷ�� �����ϴ� ����
 * 		--> �������� �ۼ���
 * 		--> ��) ��
 *   UDP ��� : ��ŷڼ� ��������
 *   	--> ���� ���� Ȯ�� �۾� ���� ������ ��Ŷ�� ��� �����ϴ� ���� 
 *   	--> �Ҿ��������� ���� �ۼ���
 *   	--> ��) ��ȭ
 *   IP ��� ( Internet Protocol ) 
 *   	--> v4 , v6
 *  	--> v4�� �缳 IP, ���� IP 
 *  		���� IP : ��ܿ� IP	
 *  				 �ϳ��� �ұԸ� ��Ʈ��ũ(�б�, �п�, ����)�� �ܺ� ��Ʈ��ũ�� ��������
 *  				 �ϳ��� ���� IP�� ���
 *  
 *  		�缳 IP : ���� ���п� IP 
 *  				 �ұԸ� ��Ʈ��ũ���� ȣ��Ʈ���� �����ϱ� ���� IP
 */
public class Test01 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			
			System.out.println("�� ��ǻ�� IP : " + addr.getHostAddress());
			System.out.println("�� ��ǻ�� �̸� : " + addr.getHostName());
			
			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			for(InetAddress a : naver) {
				System.out.println("���̹� IP : " + a.getHostAddress());
			}
		} catch(UnknownHostException e) {
			System.out.println("ȣ��Ʈ �� �� ����!");
		}
	}
}





