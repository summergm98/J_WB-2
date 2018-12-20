package workbook.StepD;

import java.util.Scanner;

public class D01 {
	private int number;
	private int totalSum;
	private int i;
	
	public D01() {
		input();
	}
	
	public void printSum() {
		System.out.printf("1부터 입력한 숫자까지의 모든 정수를 더한 값은 %d 입니다\n", getSum());
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요: ");
		this.number = s.nextInt();
	}
	
	int getSum() {
		
		for(i = 0; i <= number; i++)
			totalSum += i;
		
		return totalSum;
	}
}
