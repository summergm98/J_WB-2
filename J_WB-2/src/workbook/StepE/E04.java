package workbook.StepE;

import java.util.Scanner;

public class E04 {
	private int mode;
	
	public E04() {
		getMode();
	}
	
	public void printR() {
		printDan(mode);
	}
	
	void getMode() {
		Scanner s = new Scanner(System.in);
		System.out.print("구구단의 출력모드를 입력하세요(1: 홀수단 2: 짝수단): ");
		this.mode = s.nextInt();
	}
	
	void printDan(int mode) {
		int i,j;
		int count = 0;
		
		for(i = mode; i < 10; i+= 2) {
			for(j = 1; j < 10; j++) {
				if(i != 1) {
					System.out.print(i + " x " + j + " = " + i * j);
					count++;
					if(count == 3) {
						System.out.printf("\n");
						count = 0;
					}else if(i * j / 10 != 0 ){
						System.out.print("   ");
					}else {
						System.out.print("    ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
