package basic;

public class Test02 {
	public static void main(String[] args) {
		int[][] arr = new int[4][3]; // [�� ����][�� ����]
		// �� : ���� ��(row)
		// �� : ���� ��(column)
		int data = 1; // ~ 12
		
		for(int i = 0; i < 4; ++i) {
			for(int j = 0; j < 3; ++j) {
				arr[i][j] = data++;
			}
		}
		
		System.out.println(arr[0][0]); // [��index][��index]
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		
		System.out.println(arr[3][0]);
		System.out.println(arr[3][1]);
		System.out.println(arr[3][2]);
		
		double[][] dArr = {
				{1, 2, 3, 4}, 
				{10, 20, 30, 40, 50}, 
				{1.1, 2.2},
				{-100, -200, -300}
		};
		
		System.out.println(dArr);
		System.out.println(dArr[0]);
		System.out.println(dArr[1]);
		System.out.println(dArr[2]);
		System.out.println(dArr[3]);
		
		System.out.println(dArr.length);   // 4
		System.out.println(dArr[0].length);// 4
		System.out.println(dArr[1].length);// 5
		System.out.println(dArr[2].length);// 2
		System.out.println(dArr[3].length);// 3
		
		// ���� for�� ����Ͽ� dArr�� ��� ���� ���
		for(int b = 0; b < dArr.length; ++b) {
			for(int a = 0; a < dArr[b].length; ++a) {
				System.out.println(dArr[b][a]);
			}
		}
		
		System.out.println("==== Ȯ��� for�� ====");
		for(double[] d : dArr) {
			for(double tmp : d ) {
				System.out.println(tmp);
			}
		}
		
		int[][][] a = new int[2][3][4];
	}
}







