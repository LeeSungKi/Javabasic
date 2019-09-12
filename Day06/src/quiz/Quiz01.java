package quiz;

import java.util.Scanner;

/*
 * < 빙고 게임 >
 * - 5 X 5 빙고판이 주어진다. 
 * - 사용자에게 행번호(0~4)와 열번호(0~4)를 입력 받는다.
 * - 입력 받을 때마다 빙고인지 확인한다. 
 *   (빙고는 가로 혹은 세로 혹은 대각선 연속으로 5칸이 채워지면 1빙고)
 * - 매번 입력 받을 때 마다 빙고판 현황을 출력한다. 
 * 
 */
public class Quiz01 {
	public static void main(String[] args) {
		boolean[][] bingo = new boolean[5][5];
		boolean isWin = false;
		Scanner sc = new Scanner(System.in);
		
		int rowNum = 0; // 입력 받을 행 번호
		int colNum = 0; // 입력 받을 열 번호
		while(!isWin) {
			
			/////////////////////////////////////////////////
			// 사용자에게 입력 받기
			System.out.println("행, 열 순서로 정수를 2개 입력하세요.(0~4)");
			rowNum = sc.nextInt();
			colNum = sc.nextInt();
			
			
			/////////////////////////////////////////////////
			// 정상 입력인지 확인하기
			if(rowNum < 0 || rowNum > 4 || colNum < 0 || colNum > 4 ) {
				System.out.println("0 이상 4 이하의 정수만 입력하세요.");
				continue;
			}
			
			/////////////////////////////////////////////////
			// 칸 채우기
			bingo[rowNum][colNum] = true;
			
			/////////////////////////////////////////////////
			// 빙고판 현황 출력하기
			for(boolean[] arr : bingo) {
				for(boolean b : arr) {
					System.out.print( (b?"O":"X") + "\t"); // ln 빼기
				}
				System.out.println();
			}
			
			/////////////////////////////////////////////////
			// 빙고인지 아닌지 확인하기
			int bingoCount = 0; // 빙고 개수
			boolean isBingo = true;
			
			
			if(rowNum + colNum == 4) { // 인덱스가 우향 대각선에 속한다면
				for(int i = 0; i < 5; ++i) {
					if(!(isBingo = bingo[i][4-i])) {
						break;
					}
					
				}
				if(isBingo) { ++bingoCount; isBingo = true;}
			}
			
			
			if(rowNum == colNum) { // 인덱스가 좌향 대각선에 속한다면
				// 대각선까지 보기
				for(int i = 0; i < 5; ++i) {
					if(!(isBingo = bingo[i][i])) {
						break;
					}
				}
				if(isBingo) { ++bingoCount; isBingo = true;}
			}
			
			for(int i = 0; i < 5; ++i) { // 세로 빙고 인지 보기
				if(!(isBingo = bingo[i][colNum])) {
					break;
				}
			}
			if(isBingo) { ++bingoCount; isBingo = true;}
			
			for(int i = 0; i < 5; ++i) { // 가로 빙고 인지 보기
				if(!(isBingo = bingo[rowNum][i])) {
					break;
				}
			}
			if(isBingo) { ++bingoCount; isBingo = true;}
			
			if(bingoCount > 0) {
				System.out.println("빙고! (" + bingoCount + "개)");
				break;
			}
			
		}
	}
}






