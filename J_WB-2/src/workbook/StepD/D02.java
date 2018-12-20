package workbook.StepD;

import java.util.Scanner;

public class D02 {
	private int number;
	private int max_num, min_num;

	public D02() {
		max_num = -1;
		min_num = 999;
		
		while(true) {
		input();
			if(number >= 0 && number <= 100) {
				checkMax();
				checkMin();
			}else {
				break;
			}
		}
	}
	
	public void printR() {
		System.out.printf("입력된 숫자들 중 가장 큰 수는 %d 이고, 가장 작은 수는 %d 입니다 \n", max_num,min_num);
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("0부터 100 사이의 숫자를 입력하세요:");
		this.number = s.nextInt();
	}
	
	void checkMax() {
		if(max_num < number)
			max_num = number;
	}
	
	void checkMin() {
		if(min_num > number)
			min_num = number;
	}
}
