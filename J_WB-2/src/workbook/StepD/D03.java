package workbook.StepD;

import java.util.Scanner;

public class D03 {
	private int number;
	private int count = 0;
	private int totalsum;
	private double average;
	
	public D03() {
		getNum();
	}
	
	public void printR() {
		System.out.printf("입력한 %d 개의 숫자들의 총 합계는 %d 이고, 평균 값은 %.1f 입니다\n", count, totalsum, getAverage());
	}
	void getNum() {
		totalsum = 0;
		
		while(true) {
			input();
			if(number >= 0 && number <= 100) {
				count++;
				totalsum += number;
			}else {
				break;
			}
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("0부터 100 사이의 숫자를 입력하세요:");
		this.number = s.nextInt();
	}
	
	double getAverage() {
		average = (double)totalsum / (double)count;
		return average;
	}
}
