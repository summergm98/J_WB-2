package workbook.StepI;

import java.util.Scanner; 

public class I05 {
	private int number[] = new int[10];
	
	public I05() {
		System.out.println("10개의 숫자 중 최댓값을 구합니다");
		getNum();
		System.out.println("최댓값은 " + MaxOfTen() + "입니다");
	}
	
	void getNum() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.print((i + 1 ) + "번 수를 입력하세요: ");
			this.number[i] = s.nextInt();
		}
	}
	
	int MaxOfTen() {
		int max = -1;
		
		for(int i = 0; i < 10; i++) {
			if(max < number[i])
				max = number[i];
		}
		
		return max;
	}
}
