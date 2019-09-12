package basic;
/*
 * < java.util ��Ű�� >
 * - Date, Calendar, Collection 
 * 
 */
import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar; 
import java.util.GregorianCalendar; // Calendar�� ����Ŭ����(���� ��� ���Ե�)
public class Test03 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString()); // d
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getTime());
		
		Calendar cal = Calendar.getInstance();
					// Ķ���� ��ü�� '�̱���' ��ü��.
					// singleton instance : ��ü ������ ���� ��û�� 1�� �����ϰ�
					//                      ���� ��� ������ ��ü 1���� �����
		cal.set(Calendar.YEAR, 2015);
		cal.set(Calendar.MONTH, Calendar.MARCH);
		cal.set(Calendar.DATE, 1); 
		// 2015�� 3������ ���� ������?
		
		System.out.println("�� : " + cal.get( Calendar.YEAR) );
		System.out.println("�� : " + cal.get( Calendar.MONTH) );
		System.out.println("�� : " + cal.get( Calendar.DATE) );
		System.out.println("���� : " + cal.get( Calendar.DAY_OF_WEEK) );
		System.out.println("�� : " + cal.get(Calendar.HOUR) );
		System.out.println("�� : " + cal.get(Calendar.MINUTE) );
		System.out.println("�� : " + cal.get(Calendar.SECOND) );
		
		// java.text.SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY�� MM�� dd�� EE���� HH:mm:ss");
		String fDate = sdf.format(System.currentTimeMillis());
		System.out.println(fDate);
		System.out.println(sdf.format( cal.getTime() ));
		
		DecimalFormat df = new DecimalFormat("###,###.##"); 
		String fNum = df.format(10000000.123123123); 
		System.out.println(fNum + "��");
	}
}







