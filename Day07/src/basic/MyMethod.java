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
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
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
//		String[] name = { "��ī��", "������", "���̸�", "���α�", "����Ǯ" };
//		return name[rand];
		
		return new String[]{ 
					"��ī��", "������", "���̸�", "���α�", "����Ǯ" 
				}[(int)(Math.random() * 5)];
	}
}













