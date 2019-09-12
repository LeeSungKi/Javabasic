package quiz;

import java.util.Scanner;

/*
 * < ���� ���� >
 * - 5 X 5 �������� �־�����. 
 * - ����ڿ��� ���ȣ(0~4)�� ����ȣ(0~4)�� �Է� �޴´�.
 * - �Է� ���� ������ �������� Ȯ���Ѵ�. 
 *   (����� ���� Ȥ�� ���� Ȥ�� �밢�� �������� 5ĭ�� ä������ 1����)
 * - �Ź� �Է� ���� �� ���� ������ ��Ȳ�� ����Ѵ�. 
 * 
 */
public class Quiz01 {
	public static void main(String[] args) {
		boolean[][] bingo = new boolean[5][5];
		boolean isWin = false;
		Scanner sc = new Scanner(System.in);
		
		int rowNum = 0; // �Է� ���� �� ��ȣ
		int colNum = 0; // �Է� ���� �� ��ȣ
		while(!isWin) {
			
			/////////////////////////////////////////////////
			// ����ڿ��� �Է� �ޱ�
			System.out.println("��, �� ������ ������ 2�� �Է��ϼ���.(0~4)");
			rowNum = sc.nextInt();
			colNum = sc.nextInt();
			
			
			/////////////////////////////////////////////////
			// ���� �Է����� Ȯ���ϱ�
			if(rowNum < 0 || rowNum > 4 || colNum < 0 || colNum > 4 ) {
				System.out.println("0 �̻� 4 ������ ������ �Է��ϼ���.");
				continue;
			}
			
			/////////////////////////////////////////////////
			// ĭ ä���
			bingo[rowNum][colNum] = true;
			
			/////////////////////////////////////////////////
			// ������ ��Ȳ ����ϱ�
			for(boolean[] arr : bingo) {
				for(boolean b : arr) {
					System.out.print( (b?"O":"X") + "\t"); // ln ����
				}
				System.out.println();
			}
			
			/////////////////////////////////////////////////
			// �������� �ƴ��� Ȯ���ϱ�
			int bingoCount = 0; // ���� ����
			boolean isBingo = true;
			
			
			if(rowNum + colNum == 4) { // �ε����� ���� �밢���� ���Ѵٸ�
				for(int i = 0; i < 5; ++i) {
					if(!(isBingo = bingo[i][4-i])) {
						break;
					}
					
				}
				if(isBingo) { ++bingoCount; isBingo = true;}
			}
			
			
			if(rowNum == colNum) { // �ε����� ���� �밢���� ���Ѵٸ�
				// �밢������ ����
				for(int i = 0; i < 5; ++i) {
					if(!(isBingo = bingo[i][i])) {
						break;
					}
				}
				if(isBingo) { ++bingoCount; isBingo = true;}
			}
			
			for(int i = 0; i < 5; ++i) { // ���� ���� ���� ����
				if(!(isBingo = bingo[i][colNum])) {
					break;
				}
			}
			if(isBingo) { ++bingoCount; isBingo = true;}
			
			for(int i = 0; i < 5; ++i) { // ���� ���� ���� ����
				if(!(isBingo = bingo[rowNum][i])) {
					break;
				}
			}
			if(isBingo) { ++bingoCount; isBingo = true;}
			
			if(bingoCount > 0) {
				System.out.println("����! (" + bingoCount + "��)");
				break;
			}
			
		}
	}
}






