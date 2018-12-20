package workbook.StepD;

import java.util.Scanner;

public class D09 {
	private int dan;
	private int i;
	
	public D09() {
		getDan();
	}
	
	public void printR() {
		for(i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + dan * i );
		}
	}
	void getDan() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("출력하고 싶은 구구단의 단 수를 입력하세요(2~9): ");
		this.dan = s.nextInt();
		
		if(dan < 2 || dan > 9) {
			System.out.print("잘못 입력하셨습니다 \n");
			getDan();
		}else
			return;
	}
	
	
}
