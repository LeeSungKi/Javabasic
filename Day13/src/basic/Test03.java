package basic;
/*
 * < java.util 패키지 >
 * - Date, Calendar, Collection 
 * 
 */
import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar; 
import java.util.GregorianCalendar; // Calendar의 하위클래스(윤년 계산 포함됨)
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
					// 캘린더 객체는 '싱글톤' 객체다.
					// singleton instance : 객체 생성은 최초 요청때 1번 생성하고
					//                      이후 계속 만들어둔 객체 1개만 사용함
		cal.set(Calendar.YEAR, 2015);
		cal.set(Calendar.MONTH, Calendar.MARCH);
		cal.set(Calendar.DATE, 1); 
		// 2015년 3월달의 시작 요일은?
		
		System.out.println("년 : " + cal.get( Calendar.YEAR) );
		System.out.println("월 : " + cal.get( Calendar.MONTH) );
		System.out.println("일 : " + cal.get( Calendar.DATE) );
		System.out.println("요일 : " + cal.get( Calendar.DAY_OF_WEEK) );
		System.out.println("시 : " + cal.get(Calendar.HOUR) );
		System.out.println("분 : " + cal.get(Calendar.MINUTE) );
		System.out.println("초 : " + cal.get(Calendar.SECOND) );
		
		// java.text.SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 EE요일 HH:mm:ss");
		String fDate = sdf.format(System.currentTimeMillis());
		System.out.println(fDate);
		System.out.println(sdf.format( cal.getTime() ));
		
		DecimalFormat df = new DecimalFormat("###,###.##"); 
		String fNum = df.format(10000000.123123123); 
		System.out.println(fNum + "원");
	}
}







