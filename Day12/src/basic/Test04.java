package basic;
/*
 * < java.lang.System >
 * 琶球 : 
 *  System.out : 妊層 窒径 什闘顕(cmd人 尻衣吉 窒径什闘顕)
 *  System.in : 妊層 脊径 什闘顕(cmd人 尻衣吉 脊径什闘顕)
 *  System.err : 妊層 窒径 什闘顕(cmd人 尻衣吉 窒径什闘顕)
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("せせせせ");
		System.err.println("ぞぞぞぞ");
		
		long millis = System.currentTimeMillis();
		System.out.println("1970.1.1 09獣 ~ 走榎猿走 井引廃 腔軒段 : " + millis);
		
		long start = System.currentTimeMillis(); 
		for(int i = 0; i < 1000000; ++i) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start + "腔軒段 社推!");
		
		System.exit(0);
	}
}






