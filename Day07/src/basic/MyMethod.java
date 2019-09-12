package basic;

public class MyMethod {
	double getCircleArea(int r) {
		double area = r * r * Math.PI;
		return area;
	}
	
	int getRandom() {
		int rand = (int)(Math.random()*9) + 1;
		return rand;
	}
	
	void printInfo(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
	}
	
	int getSum(int a, int b){
		if(a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		int sum = 0;
		for(int i = a; i <= b; ++i) {
			sum += i;
		}
		return sum;
	}
	
	double calc(double a, double b, char op){
		switch(op) {
		case '+': return a + b;
		case '-': return a - b;
		case '*': return a * b;
		case '/': return a / b;
		case '%': return a % b;
		//default: return 0.0; 
		}
		return 0.0;
	}
	String getRandomName(){
//		int rand = (int)(Math.random() * 5); // 0 ~ 4
//		String[] name = { "피카츄", "라이츄", "파이리", "꼬부기", "버터풀" };
//		return name[rand];
		
		return new String[]{ 
					"피카츄", "라이츄", "파이리", "꼬부기", "버터풀" 
				}[(int)(Math.random() * 5)];
	}
}













